/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        System.out.println("Hola mundo");
//        Persona persona = new Persona("Juan", "PErez", 45);
//        System.out.println(persona);

        int op = 0;
        //Persona persona=null;
        Persona persona=new Persona();
        while (op != 3) {
           
            System.out.println("1.- Introducir Datos");
            System.out.println("2.- Mostrar Datos");
            System.out.println("3.- Crear Docente Basica");
            System.out.println("4.- Salir");

            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Introduzca el nombre");
                    String nombre = sc.next();
                    System.out.println("Introduzca el apellido");
                    String apellido = sc.next();

                    System.out.println("Introduzca el edad");
                    int edad = sc.nextInt();
          //          persona = new Persona(nombre, apellido, edad);
                    persona.setNombre(nombre.toUpperCase());
                    persona.setApellidos(apellido.toUpperCase());
                    persona.setEdad(edad);

                    break;
                case 2:
                    System.out.println(persona);
                    break;
                case 3:
                    DocenteBasicas ingperez=new DocenteBasicas("Juan","Perez") ;
                    MateriaBasica Mat100=new MateriaBasica();
                    MateriaBasica Mat101=new MateriaBasica();
                    MateriaEspecialidad SIS256=new MateriaEspecialidad();
                    ingperez.addMateria(Mat100);
                    ingperez.addMateria(Mat101);
                    ingperez.addMateria(SIS256);
                    
                    
                    break;    
            }

        }

    }

}
