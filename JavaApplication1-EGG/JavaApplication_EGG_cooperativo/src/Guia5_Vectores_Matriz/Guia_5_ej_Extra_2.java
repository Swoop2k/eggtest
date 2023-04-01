/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5_Vectores_Matriz;

import java.util.Scanner;

/**
 *Escriba un programa que averigüe si dos vectores de N enteros son iguales (la comparación deberá detenerse 
 * en cuanto se detecte alguna diferencia entre los elementos).
 * @author swoop
 */
public class Guia_5_ej_Extra_2 {

    /**
     * @param args the command line arguments
     */
        public static void main(String args[]){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Inicializar la dimencion del vector: ");
             int index = scanner.nextInt();
             int comparacion = 0;
             int[] vecA = new int[index];
             int[] vecB = new int[index];
                
            for (int i = 0; i < index; i++) {
                System.out.print("Introduce el numero de Vector A "+i+"= ");
                vecA[i] = scanner.nextInt();
                System.out.print("Introduce el numero de Vector B "+i+"= ");
                vecB[i] = scanner.nextInt();

             if(vecA[i] == vecB[i]){
            comparacion++;	
              }
                 else{
                     System.out.println("Se encontro una diferencia en la posición "+i);
                     break;
                 }
            }

                if(comparacion == index){
			 System.out.println("Los dos vectores son iguales");
			
		        }
        }
}
