/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication_egg_cooperativo.Guia4_Subprocesos;

import java.util.Scanner;

/**
 *
 * @author swoop
 */
public class EJ_11_Guia_T {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = leer.nextLine();
        
        for (int i = 0; i < frase.length(); i++) {
            System.out.print(Codificador(frase.substring(i, i + 1)));
        }   
        System.out.println("");


    }
 // TODO code application logic here   

  
public static String Codificador(String letra) {

        switch (letra.toLowerCase()) {
            case "a":
                letra = "@";
                break;
            case "e":
                letra = "#";
                break;
            case "i":
                letra = "$";
                break;
            case "o":
                letra = "%";
                break;
            case "u":
                letra = "*";
                break;
        }
        return letra;
    }
    
}
