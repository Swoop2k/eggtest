/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotaapp;

import java.util.Scanner;
import mascotaapp.entidades.Mascota;

/**
 *
 * @author swoop
 */
public class MascotaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        Mascota m1 = new Mascota("Aukan", leer.next(), "perro");
        
        //m1.nombre = "Pepe Chiquito";
        
        m1.setNombre("Pepe Chiquito");
        
        //System.out.println(m1. );
        
//        m1.apodo = "Aukan";
//        m1.nombre = leer.next();
//        m1.tipo = "perro";
//        m1.edad = 14;
//        m1.raza = "Border";
//        m1.cola = true;
//        m1.color = "Bicolor";
        
        //System.out.println(m1.apodo + "  " +m1.edad + " "+ m1.tipo + "  ");
        //System.out.println(m1.getNombre());
          
        System.out.println(m1.toString());

    }
    
}
