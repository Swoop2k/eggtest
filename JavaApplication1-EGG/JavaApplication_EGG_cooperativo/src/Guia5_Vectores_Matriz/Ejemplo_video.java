/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5_Vectores_Matriz;

import java.util.Scanner;

/**
 *
 * @author swoop
 */
public class Ejemplo_video {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        Scanner leer = new Scanner(System.in);
        int [] vector= new int [2];
        int[] producto = new int [3];
        int [][] matriz = {{4,8,6},{2,1,7}};
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("v" + i + ": ");
            vector[i]= leer.nextInt(); 
             }
        //multiplica vector por matriz
            int sum;
            //para cada columna de la matriz...
            for (int j = 0; j < matriz[0].length; j++) {
                sum=0;
                //...recorro el vector y multiplico
                for (int i = 0; i< vector.length; i++) {
                    sum+=vector[i]*matriz[i][j];
                }
                producto [j]= sum;
            }
        String aux="";
        //mostrar vector
        System.out.println("VECTOR:");
          //bucle for 'mejorado'
          //for (tipo elemento : arreglo)
        for (int elemento: vector){   
        aux= aux +" "+elemento; 
                    }
        System.out.println(aux);
       
        //mostrar matriz
        System.out.println("Matriz: ");
        //para cada fila de la matriz
        for(int[] fila:matriz){
            aux="";
        //para cada elemento de la fila
            for(int elemento:fila){
            aux+= " "+elemento;
            }
            System.out.println(aux);
            }
        //mostrar resultado
        aux="";
        System.out.println("vector x matriz");
        for(int elemento: producto){
        aux+=" "+elemento;
        }
        System.out.println(aux);
    }
    
}
  

