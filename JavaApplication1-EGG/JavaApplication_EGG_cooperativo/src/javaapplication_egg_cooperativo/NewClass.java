/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication_egg_cooperativo;

import java.util.Scanner;

/**
 *
 * @author swoop
 */
public class NewClass {
    static Scanner input = new Scanner(System.in);
    static int Opcion;
    
    public static void main(String[] args) {
        Menu();
    }
      static void Menu() {
              
        System.out.println("MENU");
        System.out.println("1 - Sumar"); 
        System.out.println("2 - Restar"); 
        System.out.println("3 - Multiplicar"); 
        System.out.println("4 - Dividir"); 
        System.out.println("5 - Salir"); 
        System.out.println("");
        System.out.println("Elegir Opcion");
        
        Opcion = input.nextInt();
        
        switch (Opcion) {
            case 1:
                Suma();
                break;
            case 2: 
                Resta();
                break;
            case 3: 
                Multiplicacion();
                break;
            case 4: 
                Division();
                break;
            case 5: 
                Salir();
                break;
            default:
                System.out.println("Por favor ingresar un numero dentro del menu");
        }
      }
    
    static void Suma() {
        int n1, n2;
        
        System.out.println("Ingresar primer numero");
        n1 = input.nextInt();
        
        System.out.println("Ingresar segundo numero");
        n2 = input.nextInt();
        
        System.out.println("El resultado de la suma es: " + (n1 + n2));

        Menu();
    }
    
    static void Resta() {
        int n1, n2;
        
        System.out.println("Ingresar primer numero");
        n1 = input.nextInt();
        
        System.out.println("Ingresar numero a restar");
        n2 = input.nextInt();
        
        System.out.println("El resultado de la suma es: " + (n1 - n2));
        
        Menu();
    }
    
    static void Multiplicacion(){
        int n1, n2;
        
        System.out.println("Ingresar primer numero a multiplicar");
        n1 = input.nextInt();
        
        System.out.println("Ingresar segundo numero");
        n2 = input.nextInt();
        
        System.out.println("El resultado de la multiplicacion es: " + (n1 * n2));
    
        Menu();
    }   
    
    static void Division(){
        int n1, n2;
        
        System.out.println("Ingresar primer numero");
        n1 = input.nextInt();
        
        System.out.println("Ingresar segundo numero");
        n2 = input.nextInt();
        
        System.out.println("El resultado de la división es: " + (n1 / n2));
        
        Menu();
    }
    
    static void Salir(){
        
        Scanner InputSalida = new Scanner(System.in);
        
        String O;
        
        System.out.println("Desea Salid s/n");
        O = InputSalida.nextLine();
        if (O.equalsIgnoreCase("n")) {
            Menu();
        } else{
            System.out.println("adios");
        }
    }
}
