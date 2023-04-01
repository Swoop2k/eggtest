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
public class Guia5_ej_2 {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        // TODO code application logic here
        /*
        2. Realizar un algoritmo que llene un vector de tamaño N con valores
aleatorios y le pida al usuario un número a buscar en el vector. El
programa mostrará dónde se encuentra el numero y si se encuentra
repetido
        */
        
        Scanner leer=new Scanner (System.in);
        System.out.println("Ingrese el tamaño del vector: ");
        int tamaño=leer.nextInt();
        int [] vector= new int [tamaño];
        
        for (int i = 0; i < vector.length; i++) {
            vector[i]= (int) (Math.random() * 100);
            System.out.print("["+vector[i]+"]");
        }
        System.out.println("");
        
        System.out.println("Ingrese el numero que desea buscar: ");
        int num=leer.nextInt();
         int cont=0;      
        for (int i = 0; i < vector.length; i++) {
            if (num==vector[i]) {
                System.out.println("Se encontro el numero en la posicion: " + (i+1));
                cont++;
            }
        }
        
        if (cont==0) {
            System.out.println("No se encontro el valor");
        } else {
        
        System.out.println("El numero se encontro "+cont+" veces");
        }
    }
    
}
