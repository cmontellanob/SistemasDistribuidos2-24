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
public class DocenteEspecialidad extends ADocente {
    Especialidad especialidad;

    public DocenteEspecialidad(String nombre, String apellidos,Especialidad especialidad) {
        super(nombre, apellidos);
        this.especialidad=especialidad;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    
  

   
    @Override
    public void addMateria(IMateria materia) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "DocenteEspecialidad{" + "especialidad=" + especialidad + '}';
    }
    
    
}
