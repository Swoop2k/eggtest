/**/
package entidades;

/**
 *
 * @author dsr19
 */
public class Canciones {
    private String titulo;
    private String autor;
    
    // constructor

    public Canciones() {
    }

    public Canciones(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
// gets and sets
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "La canción " + titulo + ", es del autor " + autor + '.';
    }

    
  
  
}
