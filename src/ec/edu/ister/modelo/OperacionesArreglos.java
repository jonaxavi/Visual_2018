package ec.edu.ister.modelo;

import javax.swing.JOptionPane;

/**
  * @Instituto Rumiñahui
 * @author SSolis
 */
public class OperacionesArreglos {
    //final int DIM =5;
    double notas[];//= new double[DIM];
    public void dimensionar(){
        int dim = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de notas"));
        notas= new double[dim];
    }
    
    public void llenarNotas(){
        for (int i = 0; i < notas.length; i++) {
            notas[i]=1+Math.random()*10;
        }
    }
    public void imprimir(){
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }
        System.out.println("\nel promedio es: "+promedio());
    }

    public double promedio(){
        double suma=0,promedio;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        promedio= suma/notas.length;
        return promedio;
    }
}









