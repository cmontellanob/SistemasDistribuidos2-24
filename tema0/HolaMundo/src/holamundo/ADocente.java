/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holamundo;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public abstract class ADocente {
    
    String nombre;
    String apellidos;
    ArrayList<IMateria> materias;

    public ADocente(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        materias=new ArrayList<IMateria>();
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

     public abstract void addMateria(IMateria materia);
   
}            
            
            
    
            
