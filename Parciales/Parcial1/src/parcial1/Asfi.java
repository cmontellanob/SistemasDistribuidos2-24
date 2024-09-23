/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Asfi extends UnicastRemoteObject implements IAsfi {

    public Asfi() throws RemoteException {
        super();
    }

    @Override
    public ArrayList<Cuenta> ConsultarCuentas(String ci, String nombres, String apellidos) throws RemoteException {
        ArrayList<Cuenta> cuentas = new ArrayList<>();
        // llamar al mercantil UDP
        String cadenaconsulta = "Buscar:" + ci + "-" + nombres + "-" + apellidos;
        String respuestaMercantil = LlamarMercantil(cadenaconsulta);
        // cuenta1-saldo1:cuenta2-saldo2:….
        if (!respuestaMercantil.equals("")) {
            String[] cuentascliente = cadenaconsulta.split(":");
            for (String s : cuentascliente) {
                String[] cuentacliente = s.split("-");
                cuentas.add(new Cuenta(Banco.Mercantil, cuentacliente[0], ci, nombres, apellidos, Double.parseDouble(cuentacliente[1])));
            }
        }

        // lamar al bco TCP
        String respuestaBCP = LlamarBCP(cadenaconsulta);
        if (!respuestaBCP.equals("")) {
            String[] cuentascliente = cadenaconsulta.split(":");
            for (String s : cuentascliente) {
                String[] cuentacliente = s.split("-");
                cuentas.add(new Cuenta(Banco.BCP, cuentacliente[0], ci, nombres, apellidos, Double.parseDouble(cuentacliente[1])));
            }
        }

        // va unir para devolver 
        return cuentas;
    }

    @Override
    public Boolean RetenerMonto(Cuenta cuenta, Double monto) throws RemoteException {
        // llamar al mercantil UDP
        Boolean retenido = false;
        String cadenaconsulta = "Congelar:" + cuenta.getNrocuenta() + "-" + monto.toString();
        if (cuenta.getBanco() == Banco.BCP) {
            String respuestaMercantil = LlamarMercantil(cadenaconsulta);
            // SI-nro de cuenta 
            String[] respuestas = respuestaMercantil.split("-");
            if (respuestas[0].equals("Si")) {
                retenido = true;
            }

        } else {
            String respuestaBCP = LlamarBCP(cadenaconsulta);
            // SI-nro de cuenta 
            String[] respuestasBCP = respuestaBCP.split("-");
            if (respuestasBCP[0].equals("Si")) {
                retenido = true;
            }
        }

        return retenido;
    }

    private String LlamarMercantil(String cadena) {
        int puerto = 6789;

        try {
            String ip = "localhost";
            DatagramSocket socketUDP = new DatagramSocket();
            byte[] mensaje = cadena.getBytes();
            InetAddress hostServidor = InetAddress.getByName(ip);

            // Construimos un datagrama para enviar el mensaje al servidor
            DatagramPacket peticion
                    = new DatagramPacket(mensaje, cadena.length(), hostServidor,
                            puerto);

            // Enviamos el datagrama
            socketUDP.send(peticion);

            // Construimos el DatagramPacket que contendrá la respuesta
            byte[] bufer = new byte[1000];
            DatagramPacket respuesta
                    = new DatagramPacket(bufer, bufer.length);
            socketUDP.receive(respuesta);

            // Enviamos la respuesta del servidor a la salida estandar
            String respuestacadena = new String(respuesta.getData());

            // Cerramos el socket
            socketUDP.close();
            return respuestacadena;
        } catch (SocketException e) {
            System.out.println("Socket: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO: " + e.getMessage());
        }
        return "";
    }

    private String LlamarBCP(String cadena) {
        int port = 5002;
        try {
            Socket client = new Socket("localhost", port);
            PrintStream toServer = new PrintStream(client.getOutputStream());
            BufferedReader fromServer = new BufferedReader(
                    new InputStreamReader(client.getInputStream()));
            toServer.println(cadena);
            String result = fromServer.readLine();
            System.out.println("cadena devuelta es: " + result);
            return result;
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return "";
    }

}
