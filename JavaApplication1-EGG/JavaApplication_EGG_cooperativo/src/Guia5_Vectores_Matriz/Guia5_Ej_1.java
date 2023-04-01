/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5_Vectores_Matriz;


/**
 * Realizar un algoritmo que llene un vector con los 100 primeros números enteros y los muestre 
 * por pantalla en orden descendente.
 * @author swoop
 */
public class Guia5_Ej_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        1. Realizar un algoritmo que llene un vector con los 100 primeros números
enteros y los muestre por pantalla en orden descendente.
        */
//        Scanner leer=new Scanner (System.in);
        int [] vector100=new int [100];
        
        for (int i = 0; i < vector100.length; i++) {
            vector100[i]=i+1;
        }
        
        for (int i =vector100.length-1 ; i>=0 ; i--) {
// for (int i = 0; i < vector100.length; i++) {
            System.out.print(" [ "+vector100[i]+ " ] ");
        }
        System.out.println("");
    }
    
}
