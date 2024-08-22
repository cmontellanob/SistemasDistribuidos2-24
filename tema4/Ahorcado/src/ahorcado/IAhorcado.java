/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ahorcado;

import java.rmi.RemoteException;
import java.rmi.*;

/**
 *
 * @author DELL
 */
public interface IAhorcado extends Remote   {
    public boolean Inciar();
    public Respuesta adivinarLetra(char letra) throws RemoteException;
    public Respuesta adivinarPalabra(String palabra) throws RemoteException;
    
}
