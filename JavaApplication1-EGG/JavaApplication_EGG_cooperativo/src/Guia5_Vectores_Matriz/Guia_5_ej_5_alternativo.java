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
public class Guia_5_ej_5_alternativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int[][] matrizA = new int[4][4];
        int[][] matrizB = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizA[i][j] = (int) (Math.random() * 20 -10);    // genera numeros entre 1 y 10 por eso el +1 así no entra el 0

                System.out.print(" [ " + matrizA[i][j] + " ]");

            }
            System.out.println(" ");
        }
        //matriz traspuesta
        System.out.println("la matriz transpuesta queda así: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizB[i][j] = matrizA[j][i];
                System.out.print(" [ " + matrizB[i][j] + " ]");
            }
            System.out.println("");
        }
        //matriz antisimetrica
        System.out.println("la matriz antisimetrica queda así: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizB[i][j] = (matrizA[j][i] * -1);
                System.out.print(" [ " + matrizB[i][j] + " ]");
            }
            System.out.println("");

        }
    }
    
}
