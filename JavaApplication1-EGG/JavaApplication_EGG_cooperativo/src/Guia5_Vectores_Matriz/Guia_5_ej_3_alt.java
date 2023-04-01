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
public class Guia_5_ej_3_alt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, aux, j, k;
        System.out.println("Dame tu N!!!!");
        n = new Scanner(System.in).nextInt();
        int[] vector = new int[n];

        int[] numdig = new int[5];
                    
        
       k=0;
        for (int i = 0; i < n; i++) {
            vector[i] = (int)(Math.random() * 100000);
            System.out.println(vector[i]);
            j=0;
            aux = vector[i];
            while (aux>0){
                j++;
                aux = aux/10;
            }
            
            numdig[j-1]= k++;
            
            
            }
            for (j = 0; j < 5; j++) {
                System.out.println(numdig[j]);
            }
    }
    
}
