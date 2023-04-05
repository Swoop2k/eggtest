/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package libroApp;

import entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author dsr19
 */
public class LibroApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        Libro l1 = new Libro("1234",leer.next(), "SR" , 15);
        
        l1.isbn = "ISBN";
        l1.titulo = "Título";
        l1.autor = "Autor";
        l1.numerodepaginas = 300;
                
        //m1.nombre = "Pepe Chiquito";
        
        System.out.println( l1.isbn +" "+ l1.titulo +" "+ l1.autor +" "+ l1.numerodepaginas);
        
}
}