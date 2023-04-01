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
public class Guia_5_ej_2_alternativo_Boolean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del vector: ");
        int N = leer.nextInt();
        int[] vector = new int[N];
        llenaVector(vector);
        System.out.print("Ingrese un numero entre 0 y 10 a buscar en el vector: ");
        int X = leer.nextInt();
        if (buscarVector(vector, X)){
            System.out.println("El número " + X +" se encuntra repetido.");
        }
    }
    public static void llenaVector(int[] v){
        for (int i = 0; i < v.length; i++) {
            v[i] = (int)(Math.random()*10 + 1);
        }
    }
    public static boolean buscarVector(int[] v, int x){
        boolean aparecio = false, repetido = false;
        for (int i = 0; i < v.length; i++) {
            if ((v[i] == x)&& (!aparecio)){
                aparecio = true;
                System.out.println("El número apareció en vector por primera vez en la posición " + (i + 1));
            }
            if ((aparecio) && (v[i] == x)){
                repetido = true;
            }
        }
        mostrarVector(v);
        return repetido;
    }
    public static void mostrarVector(int[] v){
        for (int i = 0; i < v.length; i++) {
            System.out.print("[" + v[i] + "]");
        }
        System.out.println("");
    }
    }
