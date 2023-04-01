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
public class Guia4_ej_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un numero para determinar si es primo: ");
        int num = leer.nextInt();
        if (EsPrimo(num)){
            System.out.println("El numero "+num+" es PRIMO");
        }else{
            System.out.println("El numero "+num+" es NO ES PRIMO");
        }
    }
    public static boolean EsPrimo(int num) {
        boolean x;
        int pd = 2;
        if (num>0){
            while ((num%pd!=0) && (pd<=num/2)) {
                pd++;
            }
            x = pd>num/2 && num!=1;
        } else 
            x = false;
        return x;
    }
}

