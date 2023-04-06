
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class PersonaApp {

 
    public static void main(String[] args) { 
    
    Scanner sc = new Scanner(System.in);

        Persona p1 = new Persona();
        
        //p1.setNombre("juan");

        System.out.println("ingrese nombre de la persona:");
        
        String nombre = sc.nextLine();
        p1.setNombre(nombre);
        
       // p1.setNombre(sc.nextLine());

        System.out.println("ingrese apellido de la persona:");
        p1.setApellido(sc.nextLine());

        System.out.println("ingrese la cantidad de energia gastada en el paseo:");
        int restarEnergia=sc.nextInt();
        
        
        
        System.out.println("nombre: "+p1.getNombre());
        
        System.out.println("apellido: "+p1.getApellido());

        System.out.println(p1.toString());

        System.out.println("cant de energia restante de la persona: "+p1.paseo(restarEnergia));
    
}
//atributos
    private String nombre;

    private String apellido;

    private int altura;

    private String sexo;

    private int energia;

    

    //constructores
    public Persona() {
        energia = 1000;
    }

    public Persona(int energia) {
        this.energia = energia;
    }

    //set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    //get
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getAltura() {
        return altura;
    }

    public String getSexo() {
        return sexo;
    }

    //metodos de operaciones o funciones???
    public int paseo(int restarEnergia) {

        energia -= restarEnergia;

        return energia;

    }

    //to string
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", altura=" + altura + ", sexo=" + sexo + '}';
    }
}