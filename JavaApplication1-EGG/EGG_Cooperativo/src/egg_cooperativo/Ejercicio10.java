/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg_cooperativo;

import java.util.Scanner;

/**
 *
 * @author swoop
 */
public class Ejercicio10 {
    public static void main(String[] args) {
    System.out.println("ingresa 3 nros a ser impresos");
    Scanner leer = new Scanner(System.in);
    int num;
        for (int i = 0; i < 4; i++) {
            num = leer.nextInt();
            System.out.print(num);
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
}
}