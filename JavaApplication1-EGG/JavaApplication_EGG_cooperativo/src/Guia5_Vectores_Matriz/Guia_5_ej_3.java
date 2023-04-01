/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5_Vectores_Matriz;

import java.util.Scanner;

/**
 *Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos de 2 dígitos, 
 * etcétera (hasta 5 dígitos).
 * @author swoop
 */
public class Guia_5_ej_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingrese el tamaño del vector");
        Scanner leer = new Scanner(System.in);
       int taman = leer.nextInt();
       int [] vector = new int [taman];
       
        for (int i = 0; i < vector.length; i++) {
            vector[i]=(int)(Math.random()*100000);
            
        }
        int aux,cont,digit1=0,digit2=0,digit3=0,digit4=0,digit5=0;
        for (int i = 0; i < vector.length; i++) {
             cont=0;
             aux=vector[i];
            while (aux>0){
           
            aux = aux/10;
          
                    cont++;
            
            }
            switch (cont) {
                case 1: digit1++;
                        break;
                case 2: digit2++;
                        break;
                case 3: digit3++;
                        break;
                case 4: digit4++;
                        break;
                case 5: digit5++;
                        break;
            }
          
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println("");
        System.out.println( "numeros con 1 digitos: " + digit1 );
        System.out.println( "numeros con 2 digitos: " + digit2 );
        System.out.println( "numeros con 3 digitos: " + digit3 );
        System.out.println( "numeros con 4 digitos: " + digit4 );
        System.out.println( "numeros con 5 digitos: " + digit5 );
    }
    
}
