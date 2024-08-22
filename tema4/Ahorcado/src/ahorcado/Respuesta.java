/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ahorcado;

import java.io.Serializable;

/**
 *
 * @author DELL
 */
class Respuesta implements Serializable{
  private  String estado; // cadena de guiones y letras adivinadas hasta ahora e_e__a
  private  int numerovidas;

    public Respuesta(String estado, int numerovidas) {
        this.estado = estado;
        this.numerovidas = numerovidas;
    }

   
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumerovidas() {
        return numerovidas;
    }

    public void setNumerovidas(int numerovidas) {
        this.numerovidas = numerovidas;
    }

    @Override
    public String toString() {
        return "Respuesta{" + "estado=" + estado + ", numerovidas=" + numerovidas + '}';
    }
    
    
}
