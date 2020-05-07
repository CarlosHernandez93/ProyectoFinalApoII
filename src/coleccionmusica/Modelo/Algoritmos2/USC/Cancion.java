/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ColeccionMusica.Modelo.Algoritmos2.USC;

/**
 *
 * @author Diego
 */
public class Cancion {
    
    private String titulo;
    private int duracion;
    private String genero;
    
    public Cancion(String titulo,
                   int duracion, 
                   String genero)
    {
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
    }
    
    public Cancion()
    {
       this.titulo = "";
       this.duracion = 0;
       this.genero = "";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
    
}
