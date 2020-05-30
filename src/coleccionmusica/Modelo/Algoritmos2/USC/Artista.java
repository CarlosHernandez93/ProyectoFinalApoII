/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ColeccionMusica.Modelo.Algoritmos2.USC;

import java.util.*;

/**
 *
 * @author Juan Sebastian Bejarano y Carlos Augusto Hernandez
 */
public class Artista {
    
    /* atributos */
    private String nombre;
    private boolean estaActivo;
    private String rutaImagen;
    
    public String getImagen() {
        return rutaImagen;
    }

    public void setImagen(String imagen) {
        this.rutaImagen = imagen;
    }
    
    /* asociaciones con Fecha */
    private Fecha fechaNacimiento;    
    private Fecha fechaDebut;
    
    private ArrayList<Album> albumes;
    
    /* métodos */
    /* métodos constructores: */
    public Artista(String nombre, 
                   boolean activo,
                   Fecha fechaNac,
                   Fecha fechaDebut, String rutaImagen)
    {
        this.nombre = nombre;
        this.estaActivo = activo;
        this.fechaNacimiento = fechaNac;
        this.fechaDebut = fechaDebut;
        this.rutaImagen = rutaImagen;
        albumes = new ArrayList<Album>();
    }
    
    public Artista()
    {
        this.nombre = "";
        this.estaActivo = false;
        this.fechaNacimiento = new Fecha();
        this.fechaDebut = new Fecha();
        this.rutaImagen = "";
        albumes = new ArrayList<Album>();
    }

    public ArrayList<Album> getAlbumes() {
        return albumes;
    }

    public void setAlbumes(ArrayList<Album> albumes) {
        this.albumes = albumes;
    }
    
    public void agregarAlbum(Album nuevoAlbum)
    {
        albumes.add(nuevoAlbum);
    }
    
    public boolean buscarAlbum(String nombreAlbum)
    {
        boolean encontrado=false;
        for(int i=0; i< albumes.size(); i++)
        {
           if(albumes.get(i).getTitulo().equalsIgnoreCase(nombreAlbum)  ) ;
           {
               encontrado=true;
           }
        }
        return encontrado;
    }
    
    public int contarAlbumesGenero(String genero)
    {
        int cuantos = 0;        
        for(int i = 0; i < albumes.size(); i++)
        {
            if(albumes.get(i).getGenero().equalsIgnoreCase(genero))
            {
                cuantos++;
            }
        }        
        return cuantos;        
    }
    
    public int numAlbumes()
    {
        return albumes.size();
    }
    
    public Album buscarAlbum2(String nombreAlbum)
    {
        Album elAlbum=null;
        for(int i=0; i< albumes.size(); i++)
        {
           if(albumes.get(i).getTitulo().equalsIgnoreCase(nombreAlbum)  ) ;
           {
               elAlbum = albumes.get(i);
           }
        }
        return elAlbum;
    }

    //Metodo creado
    public boolean EstimacionAlbum(String generoAlbum){
        boolean validacion=false;
        if(generoAlbum.equalsIgnoreCase(albumes.get(0).getGenero())){
            validacion= true;
        }
        else{
            validacion= false;
        }
        return validacion;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getEstaActivo() {
        return estaActivo;
    }

    public void setEstaActivo(boolean estaActivo) {
        this.estaActivo = estaActivo;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Fecha getFechaDebut() {
        return fechaDebut;
    }

    public void setFechaDebut(Fecha fechaDebut) {
        this.fechaDebut = fechaDebut;
    }
    
    
    
    
}
