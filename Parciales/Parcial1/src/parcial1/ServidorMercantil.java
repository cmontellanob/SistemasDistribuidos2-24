/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 *
 * @author Carlos
 */
public class ServidorMercantil {

    public static void main(String args[]) {
        int port = 6789;
        try {

            DatagramSocket socketUDP = new DatagramSocket(port);
            byte[] bufer = new byte[1000];

            while (true) {
                // Construimos el DatagramPacket para recibir peticiones
                DatagramPacket peticion
                        = new DatagramPacket(bufer, bufer.length);

                // Leemos una petición del DatagramSocket
                socketUDP.receive(peticion);

                System.out.print("Datagrama recibido del host: "
                        + peticion.getAddress());
                System.out.println(" desde enl puerto remoto: "
                        + peticion.getPort());

                String cadena = new String(peticion.getData());
                String respuestaformateada = procesarSolicitud(cadena);  // es para procesesar la cadena recibida y dar respuesta de acuerdo al algoritmo planteado

                DatagramPacket respuesta = new DatagramPacket(respuestaformateada.getBytes(), respuestaformateada.length(),
                        peticion.getAddress(), peticion.getPort());

                // Enviamos la respuesta, que es un eco
                socketUDP.send(respuesta);
            }

        } catch (SocketException e) {
            System.out.println("Socket: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO: " + e.getMessage());
        }
    }

    private static String procesarSolicitud(String cadena) {
        String[] solicitud = cadena.split(":");
        if (solicitud[0].equals("Buscar")) {
            return "";
        }
        if (solicitud[0].equals("Congelar")) {
           return "No-no"; 
        }
        return "";
    }

}
