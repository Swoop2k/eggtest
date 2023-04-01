/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication_egg_cooperativo.Guia;

import java.util.Scanner;

/**
 *
 * @author swoop
 */
public class Ej_3 {

    /**
     * @param args the command line arguments
     */

       public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese cantidad de EUROS: ");
        double euro = leer.nextDouble();
        System.out.print("A que moneda desea convertir?: ");
        String moneda = leer.next();
        convertir(euro,moneda);
    }
    public static void convertir(double euro, String moneda) {
        moneda=moneda.toLowerCase();
        switch(moneda){
            case "dolares":
                System.out.println(euro+"€ ---> $"+1.28611*euro);
                break;
            case "libras":
                System.out.println(euro+"€ ---> ₤"+0.86*euro);
                break;
            case "yenes":
                System.out.println(euro+"€ ---> ¥"+129.852*euro);
                break;
        }
    }
}
    
