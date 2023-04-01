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
public class Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("===================================");
       System.out.println("Ingrese los minutos a calcular");
       Scanner leer = new Scanner(System.in);
        int  minutos, horas, dias;
            minutos = leer.nextInt();
            dias = minutos/1440;
            horas = minutos/60;  
            
            
        if (minutos<1440 && minutos>60){
            System.out.println("LOS MINUTOS EQUIVALEN A " + horas + " HORAS"); 
        }    
        else {
            System.out.println("LOS MINUTOS EQUIVALEN A " + dias + " DIAS; Y " + (minutos%1440)/60 + " HORAS");
    }
    
}
}