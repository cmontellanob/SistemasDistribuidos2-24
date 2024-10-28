/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package consumiroperacionesjava;

/**
 *
 * @author DELL
 */
public class ConsumirOperacionesJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("La suma es"+sumar(35,4));
    }

    private static int sumar(int a, int b) {
        consumir.Operaciones service = new consumir.Operaciones();
        consumir.OperacionesSoap port = service.getOperacionesSoap12();
        return port.sumar(a, b);
    }
    
}
