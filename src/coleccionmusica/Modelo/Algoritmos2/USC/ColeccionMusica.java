
package ColeccionMusica.Modelo.Algoritmos2.USC;

import java.io.*;
import java.util.*;


/**
 *
 * @author Juan Sebastian Bejarano y Carlos Augusto Hernandez
 */
public class ColeccionMusica {
    
    private String propietario;
    private Fecha fechaCreacion;
    private ArrayList<Artista> artistas;
    
    public static final String GENERO_SALSA="Salsa";
    public static final String GENERO_ROCK="Rock";
    public static final String GENERO_JAZZ="Jazz";
    public static final String GENERO_ESPIRITUAL="Espiritual";

    public ColeccionMusica(String propietario, Fecha fechaCreacion) {
        this.propietario = propietario;
        this.fechaCreacion = fechaCreacion;
        artistas = new ArrayList<Artista>();
    } 
    
    public ColeccionMusica()
    {
        artistas = new ArrayList<Artista>();      
    }
    
    public void agregarArtista(Artista nuevoArtista)
    {
        artistas.add(nuevoArtista);
    }
    
    public boolean buscarArtista(String nombreArtista)
    {
        boolean encontrado = false;        
        for(int i=0; i < artistas.size(); i++)
        {
            if(artistas.get(i).getNombre().equalsIgnoreCase(nombreArtista))
            {
                encontrado = true;
            }
        }        
        return encontrado;
    }
    
    public String artistaMasAlbumes()
    {
        String nombreMayor = "";
        int mayorNumAlbumes = 0;
        /* recorrer todos los artistas :*/
        for(int i = 0; i< artistas.size(); i++)
        {
            /* obtener el número álbumes de cada artista */
            if(   artistas.get(i).numAlbumes() >  mayorNumAlbumes    )
            {
                mayorNumAlbumes = artistas.get(i).numAlbumes();
                nombreMayor = artistas.get(i).getNombre();
            }
        }        
        return nombreMayor;
    }
    
    /*
     COMPLETAR: Completar método
    */
    public String generoMasAlbumes()
    {
        String nombreGenero ="";
        int cuantosSalsa=0, cuantosEspiritual=0, cuantosJazz=0,cuantosRock=0;    
        
        /* 1. recorrer  todos los artistas */
        for(int i = 0; i < artistas.size(); i++)
        {
            /* 2. por cada artista, contar cuantos albumes pertenecen a cada
             genero (usar funcion contarAlbumesGenero)  */
            cuantosSalsa += artistas.get(i).contarAlbumesGenero(ColeccionMusica.GENERO_SALSA);
            cuantosEspiritual += artistas.get(i).contarAlbumesGenero(ColeccionMusica.GENERO_ESPIRITUAL);
            cuantosJazz += artistas.get(i).contarAlbumesGenero(ColeccionMusica.GENERO_JAZZ);
            cuantosRock += artistas.get(i).contarAlbumesGenero(ColeccionMusica.GENERO_ROCK);            
        }
        /* 3. determinar cuál genero tiene mayor cantidad de álbumes y devolver el nombre
        */
        if(cuantosSalsa>cuantosRock && cuantosSalsa>cuantosJazz){
            if (cuantosSalsa>cuantosRock) {
                nombreGenero="Salsa";
            }
            else{
                nombreGenero="Rock";
            } 
        }
        else if(cuantosEspiritual>cuantosJazz){
            if (cuantosEspiritual>cuantosRock) {
                nombreGenero="Espiritual";
            }
            else{
                nombreGenero="Rock";
            }
        }
        else if(cuantosJazz>cuantosRock){
            nombreGenero="Jazz";
        }
        else{
            nombreGenero="Rock";
        }     
      return nombreGenero;  
    } 
    
    /**
     * 
     * @param pGenero: Nombre del Género: Salsa, Rock, Jazz o Religiosa
     * @return lista de albumes que pertenecen de ese género
     */
    public ArrayList<Artista> albumesPorGenero(String pGenero)
    {
        ArrayList<Artista> Resultado = new ArrayList<Artista>();
        /*
        Completar...
        */
        for (int i = 0; i < 10; i++) {
           
        }
        return Resultado;
    }
    
    /** ----- completado
     * 
     * @param pArtista: Nombre del artista
     * @return lista de álbumes que pertenecen al artista
     */
    public ArrayList<Album> albumesPorArtista(String pArtista)
    {
       ArrayList<Album> Resultado = new ArrayList<Album>();
        for (int i = 0; i < artistas.size(); i++) {
            if (pArtista.equalsIgnoreCase(artistas.get(i).getNombre())) {
                Resultado = artistas.get(i).getAlbumes();
            }
        }
        return Resultado;   
    }
    
    public Artista buscarArtista2(String nombreArtista)
    {
        Artista elArtista = null;        
        for(int i=0; i < artistas.size(); i++)
        {
            if(artistas.get(i).getNombre().equalsIgnoreCase(nombreArtista))
            {
                elArtista = artistas.get(i);
            }
        }        
        return elArtista;
    }

    public ArrayList<Artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(ArrayList<Artista> artistas) {
        this.artistas = artistas;
    }   

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public Fecha getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Fecha fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    
    /* Modificar método para que se adecúe al acrhivo de entrada */
    public void CargarInformacion(String rutaArchivo)
    {
        try {
            
            BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));
            String linea;
            /* Leer información de la colección de música: */
            linea = br.readLine().trim(); //"Diego Loaiza,2020-04-22"
            
            String datosCol[] = linea.split(","); //datosCol[]={"Diego Loaiza", "2020-04-22"};
            String fecha = datosCol[1]; //fecha = "2020-04-22"
            String datosFecha[] = fecha.split("-"); //datosFecha[] = {"2020","04","22"};            
            propietario = datosCol[0];
            fechaCreacion = convertirFecha(datosFecha); 
            
            /* leer número de artistas que se van a leer: */
            int numArtistas =  Integer.parseInt(br.readLine().trim());
            
            /* leer información del primer artista:*/
            for(int i = 0; i < numArtistas; i++)
            {
                    linea = br.readLine().trim(); //Ejemplo: Mick Jagger,true,1943-07-26,1964-12-07            
                    String datosArtista[] = linea.split(",");
                    String nombreArtista = datosArtista[0]; //"Mick Jagger"
                    boolean activo =  Boolean.valueOf(datosArtista[1].trim()); //true
                    String fechaNacArtista[] = datosArtista[2].trim().split("-"); //{"1943","07","26"}
                    String fechaDebutArtista[] = datosArtista[3].trim().split("-"); //{"1964","12","07"}
                    Fecha fechaNac = convertirFecha(fechaNacArtista);            
                    Fecha fechaDebut = convertirFecha(fechaDebutArtista); 
                    String imagen = datosArtista[4];
                    Artista nuevoArtista = new Artista(nombreArtista, activo, fechaNac, fechaDebut, imagen);
                    artistas.add(nuevoArtista);
            }
            for (int i = 0; i < artistas.size(); i++) {
                System.out.println(artistas.get(i).getNombre());
                System.out.println(artistas.get(i).getEstaActivo());
                System.out.println(artistas.get(i).getFechaNacimiento());
                System.out.println(artistas.get(i).getFechaDebut());
                System.out.println(artistas.get(i).getImagen());
                System.out.println("");
            }
            
            //Lectura de los primeros albumes del primer artista
            int numAlbum1 =  Integer.parseInt(br.readLine().trim());

            for (int i = 0; i < numAlbum1; i++) {
                linea = br.readLine().trim();
                String datosAlbum1[] = linea.split(",");
                String nombreAlbum1 = datosAlbum1[0];
                String generoAlbum1 = datosAlbum1[1];
                int numCopias1 = Integer.parseInt(datosAlbum1[2]);
                String rutaAlbum1 = datosAlbum1[3];
                int duracionAlmbun1 = Integer.parseInt(datosAlbum1[4]); 
                String fecha1[] = datosAlbum1[5].trim().split("-");
                Fecha fechaPublic1 = convertirFecha(fecha1);
                Album nuevoAlbum1 = new Album(nombreAlbum1, generoAlbum1, numCopias1, rutaAlbum1, duracionAlmbun1, fechaPublic1);
                artistas.get(0).agregarAlbum(nuevoAlbum1);
            }
            
            System.out.println(artistas.get(0).numAlbumes());
           
            //Lectura de los albumes para el segundo artista de la lista
            int numAlbum2 =  Integer.parseInt(br.readLine().trim());

            for (int i = 0; i < numAlbum2; i++) {
                linea = br.readLine().trim();
                String datosAlbum2[] = linea.split(",");
                String nombreAlbum2 = datosAlbum2[0];
                String generoAlbum2 = datosAlbum2[1];
                int numCopias2 = Integer.parseInt(datosAlbum2[2]);
                String rutaAlbum2 = datosAlbum2[3];
                int duracionAlmbun2 = Integer.parseInt(datosAlbum2[4]); 
                String fecha1[] = datosAlbum2[5].trim().split("-");
                Fecha fechaPublic2 = convertirFecha(fecha1);
                Album nuevoAlbum2 = new Album(nombreAlbum2, generoAlbum2, numCopias2, rutaAlbum2, duracionAlmbun2, fechaPublic2);
                artistas.get(1).agregarAlbum(nuevoAlbum2);
            }
            
            System.out.println(artistas.get(1).numAlbumes());
            
            //Lectura de los albumes para el tercer artista de la lista
            int numAlbum3 =  Integer.parseInt(br.readLine().trim());

            for (int i = 0; i < numAlbum3; i++) {
                linea = br.readLine().trim();
                String datosAlbum3[] = linea.split(",");
                String nombreAlbum3 = datosAlbum3[0];
                String generoAlbum3 = datosAlbum3[1];
                int numCopias3 = Integer.parseInt(datosAlbum3[2]);
                String rutaAlbum3 = datosAlbum3[3];
                int duracionAlmbun3 = Integer.parseInt(datosAlbum3[4]); 
                String fecha3[] = datosAlbum3[5].trim().split("-");
                Fecha fechaPublic3 = convertirFecha(fecha3);
                Album nuevoAlbum3 = new Album(nombreAlbum3, generoAlbum3, numCopias3, rutaAlbum3, duracionAlmbun3, fechaPublic3);
                artistas.get(2).agregarAlbum(nuevoAlbum3);
            }
            
            System.out.println(artistas.get(2).numAlbumes());
           
            //Lectura de los albumes para el cuarto artista de la lista
            int numAlbum4 =  Integer.parseInt(br.readLine().trim());

            for (int i = 0; i < numAlbum4; i++) {
                linea = br.readLine().trim();
                String datosAlbum4[] = linea.split(",");
                String nombreAlbum4 = datosAlbum4[0];
                String generoAlbum4 = datosAlbum4[1];
                int numCopias4 = Integer.parseInt(datosAlbum4[2]);
                String rutaAlbum4 = datosAlbum4[3];
                int duracionAlmbun4 = Integer.parseInt(datosAlbum4[4]); 
                String fecha4[] = datosAlbum4[5].trim().split("-");
                Fecha fechaPublic4 = convertirFecha(fecha4);
                Album nuevoAlbum4 = new Album(nombreAlbum4, generoAlbum4, numCopias4, rutaAlbum4, duracionAlmbun4, fechaPublic4);
                artistas.get(3).agregarAlbum(nuevoAlbum4);
            }
            
            System.out.println(artistas.get(3).numAlbumes());
          
            br.close();
            
        } catch (FileNotFoundException ex) {
            
        } catch (IOException ex) {
            
        }
    }
    
    public Fecha convertirFecha(String fechaArr[])
    {
        Fecha laFecha = new Fecha(Integer.valueOf(fechaArr[2]),
                                  Integer.valueOf(fechaArr[1]),
                                  Integer.valueOf(fechaArr[0]));
        return laFecha;
    }
    
    /**
     * @param args the command line arguments
     */
    /*public static void main(String[] args) {
          //TODO code application logic here
          ColeccionMusica miColeccion = new ColeccionMusica();         
          miColeccion.CargarInformacion("./Datos/DatosIniciales1.txt");
          System.out.println("El artista con más álbumes es: "+miColeccion.artistaMasAlbumes());
          System.out.println(miColeccion.albumesPorArtista("cheo feliciano"));
          System.out.println(miColeccion.albumesPorGenero("Jazz"));
    }*/
    
}
