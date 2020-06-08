/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import ColeccionMusica.Modelo.Algoritmos2.USC.Artista;
import org.junit.Test;
import static org.junit.Assert.*;

import ColeccionMusica.Modelo.Algoritmos2.USC.ColeccionMusica;
import ColeccionMusica.Modelo.Algoritmos2.USC.Fecha;
import junit.framework.TestCase;
/**
 *
 * @author Carlos
 */
public class ColeccionMusicaTest extends TestCase{
    
    ColeccionMusica miColeccion;
    
    public ColeccionMusicaTest(){
        
        
    }
    
    public void Escenario1(){
        miColeccion = new ColeccionMusica();
    }
    
    public void Escenario2(){
        miColeccion = new ColeccionMusica("Carlos Bejarano", new Fecha(27, 05, 2020));
    }
    
    public void Escenariio3(){
        miColeccion = new ColeccionMusica("Carlos Bejarano", new Fecha(27, 05, 2020));
        miColeccion.agregarArtista(new Artista("Alguien", true, new Fecha(01, 01,2020), new Fecha(27, 05, 2020),""));
    }
    public void Escenario4()
    {
        miColeccion = new ColeccionMusica();
    }
    
    public void Escenario5()
    {
        miColeccion = new ColeccionMusica();
        miColeccion.CargarInformacion("./Datos/DatosIniciales1.txt");
    }
    @Test
    public void testCargaDatos(){
        //Primer paso
        Escenario1();
        
        //Segundo paso
        assertNotNull(miColeccion.getArtistas());
        assertEquals(miColeccion.getArtistas().size(), 0);
        
        //Tercer paso
        miColeccion.CargarInformacion("./Datos/DatosIniciales1.txt");
        
        //Cuarto paso
        assertEquals(miColeccion.getArtistas().size(), 4);
    }
    
    @Test
    public void agregarArtista(){
        Escenario1();
        
        //Primer paso
        Escenario2();
        
        //Segundo paso
        assertNull(miColeccion.getArtistas().size());
        assertEquals(miColeccion.getArtistas().size(), 0);
        
        //Tercer paso
        miColeccion.agregarArtista(new Artista("Alguien", true, new Fecha(01, 01,2020), new Fecha(27, 05, 2020),""));
        
        //Cuarto paso
        assertEquals(miColeccion.getArtistas().size(), 1);
    }
    
    @Test
    public void eliminarArtista(){
        //Primer paso
        Escenariio3();  
        
        //Segundo paso
        assertEquals(miColeccion.getArtistas().size(), 1);
        
        //Tercer paso
        // Agregar el metodo que se creo
        
        //Cuarto paso
        assertEquals(miColeccion.getArtistas().size(), 0);
        assertTrue(miColeccion.getArtistas().size() == 0);
    }
   
    //-----------AGREGADO--------------
    @Test
    public void testArtistasMasAlbumes()
    {
        Escenario4();
        miColeccion.CargarInformacion("./Datos/DatosIniciales1.txt");
        
        miColeccion.artistaMasAlbumes();
        
        assertNotNull(miColeccion.getArtistas());
        assertEquals(miColeccion.getArtistas().size(), 4);
        assertEquals(miColeccion.artistaMasAlbumes(), "Marcos Witt");
    }
    
    
    @Test
    public void testAlbunesPorGenero()
   {
       Escenario5();
       
        String pGenero = "Espiritual";       
       
       miColeccion.albumesPorGenero(pGenero);
       
       assertNotNull(miColeccion.albumesPorGenero(pGenero));
       
       assertEquals(miColeccion.albumesPorGenero(pGenero).size(), 4);
       
    }
}
