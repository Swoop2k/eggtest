/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg_cooperativo.java_4;

import java.util.Scanner;

/**
 Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*      *
*      *
* * * *

 * @author swoop
 */
public class Ejercicio_8 {
    public static void main(String[] args) {
    System.out.println("ingresa un Nro");
    Scanner leer = new Scanner(System.in);
     int num;
    num = leer.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.print("");
            for (int j = 0; j < num; j++) {
                if ( j==0  || j ==num-1 || i==0 || i==num-1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
                            
            }
            System.out.println();
        }
}
}
