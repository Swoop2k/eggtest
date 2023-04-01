/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5_Vectores_Matriz;

import java.util.Scanner;

/**
 *Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas, 
 * sus columnas y sus diagonales son idénticas. Crear un programa que permita introducir un cuadrado por
 * teclado y determine si este cuadrado es mágico o no. El programa deberá comprobar que los números 
 * introducidos son correctos, es decir, están entre el 1 y el 9.
 * @author 
 */
public class Guia_5_ej_6_cuadradomagico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int N = 3;
        int[][] matriz = new int[N][N];
        System.out.println("Ingrese valores magicos:");
        for (int f = 0; f < N; f++) {
            for (int c = 0; c < N; c++) {
                System.out.print("[" + f + "," + c + "]:");
                matriz[f][c] = leer.nextInt();
            }
        }
       if (ComprobarFilas(matriz, N) && ComprobarColumnas(matriz,N) && ComprobarDiagonales(matriz,N)) {
           System.out.println("Su matriz rebosa de MAGIAAAAA");
       }else {
           System.out.println("Su matriz es carente de magia :( ");
       }
    }

    public static boolean ComprobarFilas(int[][] matriz, int N) {
        int[] vectorSumaFila = new int[N];
        int suma = 0;
        boolean filasMagicas = false;

        for (int f = 0; f < N; f++) {
            for (int c = 0; c < N; c++) {        //se suma cada fila y se guarda en un vector los resultados
                suma += matriz[f][c];
            }
            vectorSumaFila[f] = suma;
            suma = 0;
        }
        
        for (int i = 0; i < N; i++) {
            filasMagicas = vectorSumaFila[0] == vectorSumaFila[i];
        }
        return (filasMagicas);
    }

    public static boolean ComprobarColumnas(int[][] matriz, int N) {
        int[] vectorSumacolumna = new int[N];
        int suma = 0;
        boolean columnasMagicas = false;

        for (int c = 0; c < N; c++) {
            for (int f = 0; f < N; f++) {        //se suma cada columnas y se guarda en un vector los resultados
               suma += matriz[f][c];
            }
            vectorSumacolumna[c] = suma;
            suma = 0;
        }
        for (int i = 0; i < N; i++) {
            columnasMagicas = vectorSumacolumna[0] == vectorSumacolumna[i];
        }
        return (columnasMagicas);
    }

    public static boolean ComprobarDiagonales(int[][] matriz, int N) {
        boolean diagonalesMagicas ;
        int suma1 = 0 , suma2 =0 ;
         int aux = N-1 ;
        for (int f = 0; f < N; f++) {
            for (int c = 0; c < N; c++) {
                if (f == c) {
                 suma1 += matriz[f][c];
                }
            }
        }
        for (int f=0 ; f<N ; f++){
            suma2 += matriz[f][aux] ;
            aux = aux-1 ;
        }  
        diagonalesMagicas = suma1==suma2;
        return (diagonalesMagicas);
    }
    
}
