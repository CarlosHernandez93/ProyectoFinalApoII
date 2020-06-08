
package coleccionmusica.UI.Algoritmos2.USC;

import ColeccionMusica.Modelo.Algoritmos2.USC.ColeccionMusica;
import ColeccionMusica.Modelo.Algoritmos2.USC.Artista;
import ColeccionMusica.Modelo.Algoritmos2.USC.Cancion;
import ColeccionMusica.Modelo.Algoritmos2.USC.Fecha;
import ColeccionMusica.Modelo.Algoritmos2.USC.Album;
import java.awt.BorderLayout;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Sebastian Bejarano y Carlos Augusto Hernandez
 */
public class VentanaAlbum extends JFrame{
    
    int ancho;
    int alto;
    int posicion3;
    int posicion4;
    int siguiente=0;
    int anterior;
    
    PanelInformacionV3 miInfo;
    PanelBotonesV3 miPanelBotones;
    PanelLogoV3 miLogo;
    PanelLabelV3 miPanelLabel;
    LogoAlbum miLogoAlbum;
    ColeccionMusica miColeccionMusica3;
    
    public VentanaAlbum()
    {
        alto = 600;
        ancho= 900;
        
        //tamaño de pagina
        this.setSize(ancho, alto);
        
        //centar
        this.setLocationRelativeTo(null);
        
        //encima de todo
        this.setAlwaysOnTop(true);
        
        //titulo dde la pestaña
        this.setTitle("Albumes");
        
        //dejar de ejecuta al sair
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //distribucion por zonas
        this.setLayout(new BorderLayout());                   
        
        
        miInfo = new PanelInformacionV3(this);
        miPanelBotones = new PanelBotonesV3(this);
        miLogo = new PanelLogoV3();
        miPanelLabel = new PanelLabelV3();
        miLogoAlbum = new LogoAlbum();
        miColeccionMusica3 = new ColeccionMusica();
        
        add(miInfo, BorderLayout.EAST);
        add(miPanelBotones, BorderLayout.SOUTH);
        add(miLogo, BorderLayout.NORTH);
        add(miPanelLabel, BorderLayout.CENTER);
        add(miLogoAlbum, BorderLayout.WEST);
       
    }
    
    public void CargarAlbumV3(ArrayList<Artista> artistas, String propietario){
        miColeccionMusica3.setPropietario(propietario);
        miColeccionMusica3.setArtistas(artistas);
    }
    
    public void CargarInformacionV3(int posicionArtista, int posicionAlbum){
        int diaLan, mesLan, ageLan;
        String fechaLan;
        String nombreCancion [] = new String[miColeccionMusica3.getArtistas().get(posicionArtista).getAlbumes().get(posicionAlbum).getCanciones().size()];
        miInfo.CargarNombreAlbumV3(miColeccionMusica3.getArtistas().get(posicionArtista).getAlbumes().get(posicionAlbum).getTitulo());
        miInfo.CargarGeneroAlbumV3(miColeccionMusica3.getArtistas().get(posicionArtista).getAlbumes().get(posicionAlbum).getGenero());
        diaLan = miColeccionMusica3.getArtistas().get(posicionArtista).getAlbumes().get(posicionAlbum).getFechaLanzamiento().getDia();
        mesLan = miColeccionMusica3.getArtistas().get(posicionArtista).getAlbumes().get(posicionAlbum).getFechaLanzamiento().getMes();
        ageLan = miColeccionMusica3.getArtistas().get(posicionArtista).getAlbumes().get(posicionAlbum).getFechaLanzamiento().getAnio();
        fechaLan = diaLan+"/"+mesLan+"/"+ageLan;
        miInfo.CargarFechaLanV2(fechaLan);
        miLogoAlbum.CargarImagenV3(miColeccionMusica3.getArtistas().get(posicionArtista).getAlbumes().get(posicionAlbum).getImagen());
            for (int i = 0; i < nombreCancion.length; i++) {
                nombreCancion[i] = miColeccionMusica3.getArtistas().get(posicionArtista).getAlbumes().get(posicionAlbum).getCanciones().get(i).getTitulo();
                miInfo.AgregarValores(nombreCancion[i]);
            }
            miInfo.Listacanciones.setListData(nombreCancion);
            
        posicion3 = posicionArtista;
        posicion4 = posicionAlbum;
    }
    
    public void accionVolver(){
        VentanaArtista vArtista = new VentanaArtista();
        this.setVisible(false);
        vArtista.CargarArtistaV2(miColeccionMusica3.getArtistas(),miColeccionMusica3.getPropietario());
        vArtista.CargarInformacion(posicion3);
        vArtista.setVisible(true);
    }
    
    public void accionAgregar(){
        this.setAlwaysOnTop(false);
        String nombre,genero;
        int minutos;
        nombre = JOptionPane.showInputDialog(null,"Digite el nombre de la cancion","Nombre de la cancion",JOptionPane.QUESTION_MESSAGE);
        minutos = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite los minutos que dura la cancion","Minutos de la cancio",JOptionPane.QUESTION_MESSAGE));
        System.out.println(posicion3);
        genero = miColeccionMusica3.getArtistas().get(posicion3).getAlbumes().get(siguiente).getGenero();
        Cancion nuevaCancion = new Cancion(nombre, minutos, genero);
        miColeccionMusica3.getArtistas().get(posicion3).getAlbumes().get(siguiente).agregarCancion(nuevaCancion);
        miInfo.AgregarValores(nombre);
        JOptionPane.showMessageDialog(null,"La cancion se ha guardado exitosamente");
        this.CargarInformacionV3(posicion3, 0);
    }
    
    public void accionAgregarAlbum1(){
        this.setAlwaysOnTop(false);
        String nombre, genero;
        String rutaImagen = "";
        int numCopias, duracion, dia, mes, age;
        nombre = JOptionPane.showInputDialog(null,"Digite el nombre del album","Nombre del album",JOptionPane.QUESTION_MESSAGE);
        genero = miColeccionMusica3.getArtistas().get(posicion3).getAlbumes().get(posicion3).getGenero();
        numCopias = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el numero de copias del album","Numero de copias",JOptionPane.QUESTION_MESSAGE));
        //Falta por agregar la imagen
        duracion = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la duracion del album (minutos)","Duracion",JOptionPane.QUESTION_MESSAGE));
        dia = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el dia de lanzamiento","Dia de lanzamiento",JOptionPane.QUESTION_MESSAGE));
        mes = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el mes de lanzamiento","Mes de lanzamiento",JOptionPane.QUESTION_MESSAGE));
        age = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el año de lanzamiento","Año de lanzamiento",JOptionPane.QUESTION_MESSAGE));
        JFileChooser seleccionImagen = new JFileChooser();
        int seleccion = seleccionImagen.showOpenDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivo = seleccionImagen.getSelectedFile();
            rutaImagen = archivo.getAbsolutePath();
        }
        Fecha nuevaFecha = new Fecha(dia, mes, age);
        Album nuevoAlbum = new Album(nombre, genero, numCopias, rutaImagen, duracion, nuevaFecha);
        miColeccionMusica3.getArtistas().get(posicion3).agregarAlbum(nuevoAlbum);
        JOptionPane.showMessageDialog(null,"Se agrego el nuevo album exitosamente");
    }
    
    public void accionAgregarAlbum2(int numero){
        this.setAlwaysOnTop(false);
        String nombre, genero; 
        String rutaImagen = "";
        int numCopias,duracion, dia, mes, age;
        nombre = JOptionPane.showInputDialog(null,"Digite el nombre del album","Nombre del album",JOptionPane.QUESTION_MESSAGE);
        genero = JOptionPane.showInputDialog(null,"Digite el genero del album","Genero del album",JOptionPane.QUESTION_MESSAGE);
        numCopias = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el numero de copias del album","Numero de copias",JOptionPane.QUESTION_MESSAGE));
        JFileChooser seleccionImagen = new JFileChooser();
        int seleccion = seleccionImagen.showOpenDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivo = seleccionImagen.getSelectedFile();
            rutaImagen = archivo.getAbsolutePath();
        }
        duracion = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la duracion del album (minutos)","Duracion",JOptionPane.QUESTION_MESSAGE));
        dia = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el dia de lanzamiento","Dia de lanzamiento",JOptionPane.QUESTION_MESSAGE));
        mes = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el mes de lanzamiento","Mes de lanzamiento",JOptionPane.QUESTION_MESSAGE));
        age = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el año de lanzamiento","Año de lanzamiento",JOptionPane.QUESTION_MESSAGE));  
        Fecha nuevaFecha = new Fecha(dia, mes, age);
        Album nuevoAlbum = new Album(nombre, genero, numCopias, rutaImagen, duracion, nuevaFecha);
        miColeccionMusica3.getArtistas().get(numero).agregarAlbum(nuevoAlbum);
        JOptionPane.showMessageDialog(null,"Se agrego el nuevo album exitosamente");
    }
    
    public int accionSiguiente(){
        siguiente ++;
        //Se valida con el tamaño del arreglo + 1 
        if (siguiente==miColeccionMusica3.getArtistas().get(posicion3).getAlbumes().size()) {
            siguiente=0;
        }
        anterior=siguiente;
        this.CargarInformacionV3(posicion3,siguiente);
        return siguiente;
    }
    
    public int accionAnterior(){
        anterior --;
        //Se valida con el tamaño del arrglo - 1
        if (siguiente==0) {
            anterior=miColeccionMusica3.getArtistas().get(posicion3).getAlbumes().size()-1;
        }
        siguiente = anterior;
        this.CargarInformacionV3(posicion3,anterior);
        return anterior;
    }
 
    public void accionActualizar(){
        this.setAlwaysOnTop(false);
        int dia, mes ,age;  
        miColeccionMusica3.getArtistas().get(posicion3).getAlbumes().get(posicion4).setTitulo(miInfo.JTFalbum.getText());
        String fechaLan[] = miInfo.JTFfechaLan.getText().split("/");
        dia = Integer.parseInt(fechaLan[0]);
        mes = Integer.parseInt(fechaLan[1]);
        age = Integer.parseInt(fechaLan[2]);
        miColeccionMusica3.getArtistas().get(posicion3).getAlbumes().get(posicion4).getFechaLanzamiento().setDia(dia);
        miColeccionMusica3.getArtistas().get(posicion3).getAlbumes().get(posicion4).getFechaLanzamiento().setMes(mes);
        miColeccionMusica3.getArtistas().get(posicion3).getAlbumes().get(posicion4).getFechaLanzamiento().setAnio(age);
        JOptionPane.showMessageDialog(null, "Se actualizo la informacion correctamente");
    }
    
}
