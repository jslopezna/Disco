/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disco;

/**
 *
 * @author Estudiante
 */

public class Disco {

    private String nombre; 
    private String artista; 
    private Cancion[] canciones; 
    private int  numeroCanciones; 

    public Disco(String nombre, String artista, Cancion[] canciones, int numeroCanciones) {
        this.nombre = nombre;
        this.artista = artista;
        this.canciones = canciones;
        this.numeroCanciones = numeroCanciones;
    }

    public String getNombre() {
        return nombre;
    }

    public String getArtista() {
        return artista;
    }

    public Cancion[] getCanciones() {
        return canciones;
    }

    public int getNumeroCanciones() {
        return numeroCanciones;
    }
     public boolean agregarCancion(String nombre,double precio,  float duracion, float tamanio, float calidad){
       Cancion cancion = new Cancion (nombre, precio,duracion,tamanio,calidad);
         return false;
       
         
     }

public Cancion darInformacionCancion ( String nombreCancion ){
 Cancion cancion= null; 
    for (int i = 0; i <this.numeroCanciones; i++) {
        if (this.canciones[i]. getNombre().equals(nombreCancion)) {
            cancion= this.canciones[i];
            break; 
        }
        
    }
    return cancion; 
}
    
    
    
}


   

