/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotaapp.entidades;

/**
 *
 * @author swoop
 */
public class Mascota {

    private String nombre;
    private String apodo;
    // Conejo, Gato, Perro, loro, Carpincho
    private String tipo;
    private String color;
    private int edad;
    private boolean cola;
    private String raza;

    public Mascota() {
    }

    public Mascota(String nombre, String apodo, String tipo) {
        this.nombre = nombre;
        this.apodo = apodo;
        if (tipo.equals("Perro")||tipo.equals("Gato")||tipo.equals("Loro")||tipo.equals("Conejo")||tipo.equals("Carpincho"))
        this.tipo = tipo;
    }

    public Mascota(String nombre, String apodo, String color, int edad, boolean cola, String raza) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
    }
    
    public void setNombre(String nombre){
        
        if (nombre.length() > 0){
          this.nombre = nombre;  
        }
    }
}
