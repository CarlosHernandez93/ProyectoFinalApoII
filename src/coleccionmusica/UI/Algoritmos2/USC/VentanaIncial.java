
package coleccionmusica.UI.Algoritmos2.USC;

import java.awt.*;
import javax.swing.*;

import ColeccionMusica.Modelo.Algoritmos2.USC.ColeccionMusica;
import ColeccionMusica.Modelo.Algoritmos2.USC.Fecha;
import ColeccionMusica.Modelo.Algoritmos2.USC.Artista;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
/**
 *
 * @author Juan Sebastian Bejarano y Carlos Augusto Hernandez
 */
public class VentanaIncial extends JFrame{
    
    BtnAnteriorP1 btnAtras;
    BtnSiguienteP1 btnSiguiente;
    LogoArtista imgArtista;
    EditP1 editor;
    int siguiente = 0;
    int anterior ;
  
    ColeccionMusica miColeccionMusica1;
    
    int ancho, alto;
    PanelLogo logoColeccion;
    
    public VentanaIncial()
    {
        ancho = 900;
        alto = 600;
       
        setSize(ancho, alto);
        setAlwaysOnTop(true);
        
        setTitle("Tu Coleccion");
       
         this.setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);        
        setLayout(new BorderLayout());
        
        miColeccionMusica1 = new ColeccionMusica();
        btnAtras = new BtnAnteriorP1(this);
        btnSiguiente = new BtnSiguienteP1(this);
        editor = new EditP1(this);
        imgArtista = new LogoArtista();
        logoColeccion = new PanelLogo();
        
        add(btnAtras, BorderLayout.WEST);
        add(btnSiguiente, BorderLayout.EAST);
        add(editor, BorderLayout.SOUTH);
        add(imgArtista, BorderLayout.CENTER);
        add(logoColeccion, BorderLayout.NORTH);
        
    }
        
    public void CargarArtistaV1(ArrayList<Artista> artistas, String propietario){
        miColeccionMusica1.setPropietario(propietario);
        miColeccionMusica1.setArtistas(artistas);  
    }
    
    public void CargaInicial(){
        String nombreInicial;
        String imagenInicial;
        imagenInicial= miColeccionMusica1.getArtistas().get(0).getImagen();
        nombreInicial=miColeccionMusica1.getArtistas().get(0).getNombre();
        imgArtista.CambiarNombre(nombreInicial);
        imgArtista.CambiarImagen(imagenInicial);
    }
     
    public void CargarInformacion(int posicion){
        String nombre="";
        String imagen="";
        nombre = miColeccionMusica1.getArtistas().get(posicion).getNombre();
        imgArtista.CambiarNombre(nombre);
        imagen = miColeccionMusica1.getArtistas().get(posicion).getImagen();
        imgArtista.CambiarImagen(imagen);
    }
    
    public static void main(String[] args)
        {
            ColeccionMusica coleccionInicial = new ColeccionMusica();
            coleccionInicial.CargarInformacion("./Datos/DatosIniciales1.txt");
            VentanaIncial miVentana = new VentanaIncial();
            miVentana.CargarArtistaV1(coleccionInicial.getArtistas(), coleccionInicial.getPropietario());
            miVentana.CargaInicial();
            miVentana.setVisible(true);   
        }
   
    
    public void accionEditar(){
        this.setVisible(false);
        VentanaArtista vArtista = new VentanaArtista();
        vArtista.CargarArtistaV2(miColeccionMusica1.getArtistas(),miColeccionMusica1.getPropietario());
        vArtista.CargarInformacion(anterior);
        vArtista.setVisible(true); 
    }
           
    public int accionSiguiente(){
        siguiente ++;
        //Se valida con el tamaño del arreglo + 1 
        if (siguiente==miColeccionMusica1.getArtistas().size()) {
            siguiente=0;
        }
        anterior=siguiente;
        this.CargarInformacion(siguiente);
        return siguiente;
    }
    
    public int accionAnterior(){
        anterior --;
        //Se valida con el tamaño del arrglo - 1
        if (siguiente==0) {
            anterior=miColeccionMusica1.getArtistas().size()-1;
        }
        siguiente = anterior;
        this.CargarInformacion(anterior);
        return anterior;
    }
    
    public void accionAdicionar(){
        this.setAlwaysOnTop(false);
        String nombre,estadoInfo;
        String rutaImagen = ""; 
        String [] estado = {"Activo","Inactivo"};
        int diaNac;
        int mesNac;
        int ageNac;
        int diaDeb;
        int mesDeb;
        int ageDeb;
        boolean estado2;
        nombre=JOptionPane.showInputDialog(null,"Digite el nombre del artista","NOMBRE",JOptionPane.QUESTION_MESSAGE); 
        estadoInfo = (String)JOptionPane.showInputDialog(null,"Seleccione el estado del artista", "ESTADO", JOptionPane.QUESTION_MESSAGE,null,estado,estado[0]);
        if (estadoInfo.equals("Activo")) {
            estado2 = true;
        }
        else{
            estado2 = false;
        }
        diaNac = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el dia de nacimiento del artista","DIA DE NACIMIENTO",JOptionPane.QUESTION_MESSAGE));
        mesNac = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el mes de nacimiento del artista","MES DE NACIMIENTO",JOptionPane.QUESTION_MESSAGE));
        ageNac = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el año de nacimiento del artista","AÑO DE NACIMIENTO",JOptionPane.QUESTION_MESSAGE));
        diaDeb = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el dia de nacimiento del artista","DIA DE DEBUT",JOptionPane.QUESTION_MESSAGE));
        mesDeb = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el mes de nacimiento del artista","MES DE DEBUT",JOptionPane.QUESTION_MESSAGE));
        ageDeb = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el año de debut del artista","AÑO DE DEBUT",JOptionPane.QUESTION_MESSAGE));
        JFileChooser SeleccionImagen = new JFileChooser();
        int seleccion = SeleccionImagen.showOpenDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivo = SeleccionImagen.getSelectedFile();
            rutaImagen = archivo.getAbsolutePath();
        }
        Fecha fechaNac = new Fecha(diaNac, mesNac, ageNac);
        Fecha fechaDeb = new Fecha(diaDeb, mesDeb, ageDeb);
        Artista nuevoArtista = new Artista(nombre, estado2, fechaNac, fechaDeb, rutaImagen);
        miColeccionMusica1.agregarArtista(nuevoArtista);
        JOptionPane.showMessageDialog(null, "Su artista se ha guardado exitosamente");
    }

    public void accionGenerarReporte(){
        this.setAlwaysOnTop(false);
        try {
            FileWriter fw = new FileWriter(new File("./Datos/Reporte1.txt"));
            fw.write("El propietario es: "+miColeccionMusica1.getPropietario()+"\n");
            fw.write("El genero con albumes es: "+miColeccionMusica1.generoMasAlbumes()+"\n");
            fw.write("El artista con mas albumes es: "+miColeccionMusica1.artistaMasAlbumes());
            System.out.println("");
            fw.close();
        } catch (Exception e) {
            System.out.println("ERROR");
        
        }
        JOptionPane.showMessageDialog(null, "Se ha generado el reporte exitosamente");
    }    
}
