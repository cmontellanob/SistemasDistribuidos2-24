/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Carlos
 */
public class ServidorBCP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int port = 5002;
        ServerSocket server;

        try {

            server = new ServerSocket(port);
            System.out.println("Se inicio el servidor con éxito");
            while (true) {
                Socket client;
                PrintStream toClient;
                client = server.accept(); //conexion entre cliente y servidor para comunicacion bidireccional
                BufferedReader fromClient = new BufferedReader(new InputStreamReader(client.getInputStream())); // el lector
                
                System.out.println("Cliente se conecto");
                String recibido = fromClient.readLine();
                String respuesta=procesarSolicitud(recibido);
                System.out.println(recibido);
                toClient = new PrintStream(client.getOutputStream());
                toClient.println(respuesta);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
     private static String procesarSolicitud(String cadena) {
        String[] solicitud = cadena.split(":");
        if (solicitud[0].equals("Buscar")) {
            String [] datos=solicitud[1].split("-");
            if (datos[0].equals("11021654") && datos[1].equals("Juan Perez") 
                    && datos[2].equals("Segovia"))
            {
                return "657654-5000";
            }
            return "";
        }
        if (solicitud[0].equals("Congelar")) {
           return "No-no"; 
        }
        return "";
    }
}
