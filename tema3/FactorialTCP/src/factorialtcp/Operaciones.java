/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorialtcp;

/**
 *
 * @author DELL
 */
public class Operaciones {
    private int n;

    public Operaciones() {
        
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public int factorial(){
        int aux=1;
        for (int i=0;i<this.n;i++)
        {
            aux*=i;
        }
        return aux;
    }
    public int sumatoria(){
        int aux=1;
        for (int i=0;i<this.n;i++)
        {
            aux*=i;
        }
        return aux;
    }public int fibonnaci(){
        int aux=1;
        for (int i=0;i<this.n;i++)
        {
            aux*=i;
        }
        return aux;
    }
}
