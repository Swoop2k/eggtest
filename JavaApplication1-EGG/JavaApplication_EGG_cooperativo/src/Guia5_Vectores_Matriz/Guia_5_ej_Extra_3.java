/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5_Vectores_Matriz;

/**
 *Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro. 
 * Después haremos otra función o procedimiento que imprima el vector.
 * @author swoop
 */
public class Guia_5_ej_Extra_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 4;
        int [] vector = new int [num];
        llenarvector(vector, num);
        imprimirvector(vector, num);
        System.out.println("");        
    }
    public static int[] llenarvector(int vector [], int num) {
        for (int i = 0; i < num; i++) {
            vector[i] = (int)(Math.random()*(10-1)+1);
        }
        return vector;
    }
    public static void imprimirvector(int vector [], int num) {
        for (int i = 0; i < num; i++) {
            System.out.print("["+i+"]"+vector[i]+" ");
        }
        
    }
}
