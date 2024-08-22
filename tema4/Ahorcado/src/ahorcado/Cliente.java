/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ahorcado;

/**
 *
 * @author Carlos
 */

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Cliente {

public static void main(String[] args) throws RemoteException, AlreadyBoundException, MalformedURLException, NotBoundException {
    
    IAhorcado ahorcado;
    ahorcado = (IAhorcado)Naming.lookup("rmi://localhost/JuegoAhorcado"); // instanciar un objeto remoto
    
      }
}
