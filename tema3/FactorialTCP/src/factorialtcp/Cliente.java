/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorialtcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Cliente {

    public static void main(String[] args) {
        int port = 5002;
        Scanner sc=new Scanner(System.in);
        try {
            Socket client = new Socket("localhost", port);
            
            PrintStream toServer = new PrintStream(client.getOutputStream());
            BufferedReader fromServer = new BufferedReader(
                    new InputStreamReader(client.getInputStream()));
            System.out.print("Introduzca ka operacion fac/fib/sum");
            String operacion=sc.nextLine();
            toServer.println(operacion);
            String result = fromServer.readLine();
            if (result.equals("ok"))
            {
              System.out.print("Introduzca n");
              int n =sc.nextInt();  
              toServer.println(String.valueOf(n));
              String result2 = fromServer.readLine();
              System.out.println("cadena devuelta por el servidor es: " + result2);
            }

            
            
            
            
            
            
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
