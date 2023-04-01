/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication_egg_cooperativo.Guia;

import java.util.Scanner;

/**
 * Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, multiplicar y 
 * dividir. La aplicación debe tener una función para cada operación matemática y deben devolver sus resultados
 * para imprimirlos en el main.
 * @author swoop
 */
public class Guia_3_ej_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un Nro");
        int num1 = leer.nextInt();
         
        System.out.println("Ingrese otro nro ");
        int num2  = leer.nextInt();
        String L = "N";
       
        do {  
            
            System.out.println("elija 1 Sumar"); 
            System.out.println("elija 2 restar"); 
            System.out.println("elija 3 multiplicar"); 
            System.out.println("elija 4 dividir");      
            System.out.println("elija 5 salir");   
        int n  = leer.nextInt();
 
        switch (n) {
            case 1:
                int resultado = suma (num1 , num2);
                System.out.println("Resultado " + resultado);
                break;
            case 2:
                int resultado1 = resta (num1 , num2);
                System.out.println("Resultado " + resultado1);
                break;
            case 3:
                int resultado2 = mult (num1 , num2);
                 System.out.println("Resultado " + resultado2);
            break;
            case 4:
                 double resultado3 = div (num1 , num2);
                  System.out.println("Resultado " + resultado3);
             break;
            case 5:
                 
                  System.out.println("descea salir?");
                  System.out.println("elija S o N");
                   L = leer.nextLine(); 
             default:
                 System.out.println("");
        }   
        }while ( !L.equalsIgnoreCase("s"));
    }
    
    /*
    Funciones usadas
    */
    public static int suma(int a, int b) {
        int c = a + b;
        return c;
    }
    
     public static int resta(int a, int b) {
        int c = a - b;
        return c;
    }
    
      public static int mult(int a, int b) {
        int c = a * b;
        return c;
    }

    public static double div(int a, int b) {
        double c = a / b;
        return c;
    }
}