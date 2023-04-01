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
public class Guia_T_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Utilizando un Bucle for, aloja en el vector Equipo, 
        los nombres de tus compañeros de equipo
        */
    
        Scanner leer = new Scanner(System.in);
        System.out.println("cree un vector para llenarlo con los datos de compañeros:");
        
        String[] vectorNomb = new String[8];
        
        for (int i = 0; i < vectorNomb.length; i++) {
            System.out.println("ingrese su nombre");
            vectorNomb[i]=leer.next();            
        }
        
        for (String vectorNomb1 : vectorNomb) {
            System.out.print("[ " + vectorNomb1 + " ] ");            
        }
        System.out.println("");
    
    
    }
    
}

/*
  public static void main(String[] args) {
        // TODO code application logic here
    
        Utilizando un Bucle for, aloja en el vector Equipo, 
        los nombres de tus compañeros de equipo
        
    
        Scanner leer = new Scanner(System.in);
        System.out.println("cree un vector para llenarlo con los datos de compañeros:");
        
        String[] vectorNomb = new String[8];
        
        for (int i = 0; i < vectorNomb.length; i++) {
            System.out.println("ingrese su nombre");
            vectorNomb[i]=leer.next();            
        }
        
        for (int i = 0; i < vectorNomb.length; i++) {
            System.out.print("[ "+vectorNomb[i]+" ] ");            
        }
        System.out.println("");
    
    
    }
    
}  
*/