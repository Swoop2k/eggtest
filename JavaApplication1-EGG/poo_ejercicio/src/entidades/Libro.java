/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author dsr19
 */
public class Libro {
    
    public String isbn;
    public String titulo;
    public String autor;
    public int numerodepaginas;
    // constructores
    public Libro (){
    }

    public Libro(String isbn, String titulo, String autor, int numerodepaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numerodepaginas = numerodepaginas;
    }
    
    
    
}
