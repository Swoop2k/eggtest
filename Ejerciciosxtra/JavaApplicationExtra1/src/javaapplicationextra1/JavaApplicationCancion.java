/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplicationextra1;

import entidades.Canciones;

/**
 *
 * @author dsr19
 */
public class JavaApplicationCancion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Canciones c1 = new Canciones("Titulo1", "Autor1");
       
System.out.println(c1.toString());
    }

}
