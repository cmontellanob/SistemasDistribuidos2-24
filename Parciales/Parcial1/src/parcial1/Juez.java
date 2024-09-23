/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial1;

/**
 *
 * @author Carlos
 */

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Scanner;

public class Juez {

public static void main(String[] args) throws RemoteException, AlreadyBoundException, MalformedURLException, NotBoundException {
    Scanner sc=new Scanner(System.in);
    ArrayList<Cuenta>cuentas ;
    IAsfi asfi;
    asfi = (IAsfi)Naming.lookup("rmi://localhost/Asfi"); // instanciar un objeto remoto
    int op=0;
    int nrocuenta=0;
    String ci="";
    String nombres="";
    String apellidos="";
    Double montoretener;
    while (op!=2)
    {
        System.out.println("1.- Buscar Cuentas");
        System.out.println("2.- Salir");
        
        System.out.println("Elegir opcion");
        op=sc.nextInt();
        if (op==1)
        {
            System.out.print("Introduzca Ci");
            ci=sc.nextLine();
            System.out.print("Introduzca Nombres");
            System.out.print("Introduzca Apellidos");
            apellidos=sc.nextLine();
            cuentas=asfi.ConsultarCuentas(ci, nombres, apellidos);
            int i=0;
            for (Cuenta c:cuentas)
            {
                i++;
               System.out.println(i);
              System.out.println("Banco"+c.banco);
              System.out.println("Cuenta:"+c.nrocuenta);
              System.out.println("Nro de Cuenta"+ c.nrocuenta);
            }
              System.out.println("De que cuenta quiere retener (1-"+i+")");
            nrocuenta=sc.nextInt();
              System.out.println("Monto");
            montoretener=sc.nextDouble();
           if (asfi.RetenerMonto(cuentas.get(nrocuenta), montoretener))
           {
               
           }
    
    
    
    
      }
}
