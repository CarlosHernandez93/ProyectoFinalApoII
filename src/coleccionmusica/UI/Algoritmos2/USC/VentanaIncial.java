
package coleccionmusica.UI.Algoritmos2.USC;

import java.awt.*;
import javax.swing.*;

import ColeccionMusica.Modelo.Algoritmos2.USC.ColeccionMusica;
import ColeccionMusica.Modelo.Algoritmos2.USC.Fecha;
import ColeccionMusica.Modelo.Algoritmos2.USC.Artista;
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
   
    ColeccionMusica miColeccionMusica;
    
    int ancho, alto;
    ImageIcon artista;
    PanelLogo logoColeccion;
    
    public VentanaIncial()
    {
        miColeccionMusica = new ColeccionMusica();
        ancho = 900;
        alto = 600;
        
        miColeccionMusica.CargarInformacion("./Datos/DatosIniciales1.txt"); 
        
        setSize(ancho, alto);
        setAlwaysOnTop(true);
        
        setTitle("Tu Coleccion");
        setBackground(Color.BLACK);
       
         this.setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);        
        setLayout(new BorderLayout());
        
       //logo artista
        
        btnAtras = new BtnAnteriorP1(this); //falta el this para hacer referencia a la ventana padre
        btnSiguiente = new BtnSiguienteP1(this); // fata ""  "" "" a la ventana padre
        editor = new EditP1(this);
        imgArtista = new LogoArtista(this);
        logoColeccion = new PanelLogo();
       
        add(btnAtras, BorderLayout.WEST);
        add(btnSiguiente, BorderLayout.EAST);
        add(editor, BorderLayout.SOUTH);
        add(imgArtista, BorderLayout.CENTER);
        add(logoColeccion, BorderLayout.NORTH);
        
    }
    
    public int TomarPosicion(){
        int posicion;
        //Puede tomar el valor de siguiente o anterior puesto que ambas tienen el mismo valor
        posicion=siguiente;
        return posicion;
    }
    
    public String CargaInicialNombre(){
        String nombreInicial="";
        nombreInicial=miColeccionMusica.getArtistas().get(0).getNombre();
        return nombreInicial;
    }
    
    public String CargaInicialImagen(){
        String imagenInicial;
        imagenInicial= miColeccionMusica.getArtistas().get(0).getImagen();
        return imagenInicial;
    }
    
    public void CargarNombre(int posicion){
        String nombre="";
        nombre = miColeccionMusica.getArtistas().get(posicion).getNombre();
        imgArtista.CambiarNombre(nombre);
    }
    
    public void CargarImganen(int posicion){
        String imagen="";
        imagen = miColeccionMusica.getArtistas().get(posicion).getImagen();
        imgArtista.CambiarImagen(imagen);
    }
    
    public static void main(String[] args)
        {
            VentanaIncial miVentana = new VentanaIncial();
            miVentana.setVisible(true);   
        }
    
    public void accionEditar(){
        VentanaArtista vArtista = new VentanaArtista();
        this.setVisible(false);
        vArtista.setVisible(true);
    }
    
    public int accionSiguiente(){
        siguiente ++;
        //Se valida con el tamaño del arreglo + 1 
        if (siguiente==miColeccionMusica.getArtistas().size()) {
            siguiente=0;
        }
        anterior=siguiente;
        this.CargarNombre(siguiente);
        this.CargarImganen(siguiente);
        return siguiente;
    }
    
    public int accionAnterior(){
        anterior --;
        //Se valida con el tamaño del arrglo - 1
        if (siguiente==0) {
            anterior=miColeccionMusica.getArtistas().size()-1;
        }
        siguiente = anterior;
        this.CargarNombre(anterior);
        this.CargarImganen(anterior);
        return anterior;
    }
    
    public void accionAdicionar(){
        this.setAlwaysOnTop(false);
        String nombre;
        String [] estado = {"Activo","Inactivo"};
        int diaNac;
        int mesNac;
        int ageNac;
        int diaDeb;
        int mesDeb;
        int ageDeb;
        String estadoInfo;
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
        mesNac = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el dia de nacimiento del artista","MES DE NACIMIENTO",JOptionPane.QUESTION_MESSAGE));
        ageNac = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el dia de nacimiento del artista","AÑO DE NACIMIENTO",JOptionPane.QUESTION_MESSAGE));
        diaDeb = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el dia de nacimiento del artista","DIA DE DEBUT",JOptionPane.QUESTION_MESSAGE));
        mesDeb = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el dia de nacimiento del artista","MES DE DEBUT",JOptionPane.QUESTION_MESSAGE));
        ageDeb = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el dia de nacimiento del artista","AÑO DE DEBUT",JOptionPane.QUESTION_MESSAGE));
        Fecha fechaNac = new Fecha(diaNac, mesNac, ageNac);
        Fecha fechaDeb = new Fecha(diaDeb, mesDeb, ageDeb);
        Artista nuevoArtista = new Artista(nombre, estado2, fechaNac, fechaDeb, "");
        miColeccionMusica.agregarArtista(nuevoArtista);
        JOptionPane.showMessageDialog(null, "Su artista se ha guardado exitosamente");
    }

    public ColeccionMusica getMiColeccionMusica() {
        return miColeccionMusica;
    }

    public void setMiColeccionMusica(ColeccionMusica miColeccionMusica) {
        this.miColeccionMusica = miColeccionMusica;
    }
    
    
}
