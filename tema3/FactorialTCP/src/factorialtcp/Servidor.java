/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorialtcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class Servidor {

    public static void main(String[] args) {
        int port = 5002;
        ServerSocket server;
        Operaciones operaciones = new Operaciones();
        try {
            server = new ServerSocket(port);
            System.out.println("Se inicio el servidor con éxito");
            String respuesta1;
            String respuesta2;
            String resultado = "";
            while (true) {
                // TODO code application logic here

                Socket client;
                PrintStream toClient;
                client = server.accept(); //conexion entre cliente y servidor para comunicacion bidireccional
                BufferedReader fromClient = new BufferedReader(new InputStreamReader(client.getInputStream())); // el lector
                System.out.println("Cliente se conecto");
                String operacion = fromClient.readLine();
                System.out.println("Operacion Enviada: "+operacion);
                
                toClient = new PrintStream(client.getOutputStream());
                if (operacion.equalsIgnoreCase("fac") || operacion.equalsIgnoreCase("fib") || operacion.equalsIgnoreCase("sum")) {
                    respuesta1 = "ok";
                } else {
                    respuesta1 = "error operacion no valida";
                }
                toClient.println(respuesta1);
                String cadenaN = fromClient.readLine();
                Integer n = Integer.parseInt(cadenaN);
                operaciones.setN(n);
                switch (operacion) {
                    case "fac":
                        resultado =String.valueOf(operaciones.factorial());
                        break;
                    case "fib":
                        resultado =String.valueOf(operaciones.fibonnaci());
                        break;
                    case "sum":
                        resultado = String.valueOf(operaciones.sumatoria());
                        break;
                }
             
                toClient.println(resultado);
            }
        } catch (IOException ex) {
            System.out.print(ex.getMessage());
        }
    }

}
