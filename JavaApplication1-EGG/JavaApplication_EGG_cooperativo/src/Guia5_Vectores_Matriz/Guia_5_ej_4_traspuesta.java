/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5_Vectores_Matriz;


/**
 *Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la matriz.
 * La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
 * @author swoop
 */
public class Guia_5_ej_4_traspuesta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] matriz = new int [4][4];

    // Asigno valores mediante el For
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            matriz[i][j] = (int)(Math.random()*10);
        }
    }

// Muestro la matriz
System.out.println("_____________________________________");
System.out.println("_______LA ORIGINAL___________________");
         for (int i = 0; i < 4; i++) {
         for (int j = 0; j < 4; j++) {
           	 
         System.out.print("[" + matriz[i][j] + "]");  
          	 
         }
         System.out.println("");
         }
System.out.println("_____________________________________");
System.out.println("_____LA TRASPUESTA___________________");
 // Muestro la matriz
         for (int j = 0; j < 4; j++) {
         for ( int i = 0; i < 4; i++) {
           	 
         System.out.print("[" + matriz[i][j] + "]");  
          	 
         }
         System.out.println("");

    }
    } 
}


