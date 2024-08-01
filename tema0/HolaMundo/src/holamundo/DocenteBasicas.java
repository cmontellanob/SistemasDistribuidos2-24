/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holamundo;

/**
 *
 * @author DELL
 */
public class DocenteBasicas extends ADocente {
    
    @Override
    public void addMateria(IMateria materia) {
        
        materias.add(materia);
    }

    public DocenteBasicas(String nombre, String apellidos) {
        
        super(nombre, apellidos);
    }

  
    
    
}
