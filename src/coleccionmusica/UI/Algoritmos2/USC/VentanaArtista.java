
package coleccionmusica.UI.Algoritmos2.USC;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import ColeccionMusica.Modelo.Algoritmos2.USC.ColeccionMusica;
/**
 *
 * @author Juan Sebastian Bejarano y Carlos Augusto Hernandez
 */
public class VentanaArtista extends JFrame{
    
    int alto,ancho;
    PanelInformacionV2 miPanelInformacion;
    PanelBotonesV2 miPanelBotones;
    PanelLogoV2 miLogo;
    PanelLabelV2 miPanelLabel;
    PanelArtistaV2 miPanelArtista;
    VentanaIncial miVentanaInical;
     
    public VentanaArtista(){
        alto = 600;
        ancho= 900;
        this.setSize(ancho, alto);
        this.setLocationRelativeTo(null);
        this.setAlwaysOnTop(true);
        this.setTitle("Artista");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        
        miPanelInformacion = new PanelInformacionV2(this);
        miPanelBotones = new PanelBotonesV2(this);
        miLogo = new PanelLogoV2();
        miPanelLabel = new PanelLabelV2();
        miPanelArtista = new PanelArtistaV2();
        miVentanaInical = new VentanaIncial();
        
        add(miLogo,BorderLayout.NORTH);
        add(miPanelBotones,BorderLayout.SOUTH);
        add(miPanelInformacion,BorderLayout.EAST);
        add(miPanelArtista,BorderLayout.WEST);
        add(miPanelLabel,BorderLayout.CENTER);
        
   }
    
    public String CargaNombreV2(){
        String nombre="";
        //nombre = miColeccionMusica.getArtistas().get(miVentanaInical.TomarPosicion()).getNombre();
        return nombre;
    }
    
    public String CargaImagenV2(){
        String imagen="";
        //imagen = miColeccionMusica.getArtistas().get(miVentanaInical.TomarPosicion()).getImagen();
        return imagen;
    }
    
    public void accionVolver(){
        VentanaIncial vInicio = new VentanaIncial();
        this.setVisible(false);
        vInicio.setVisible(true);        
    }
    
    public void accionAñadirAlbum(){
        VentanaAlbum vAlbum = new VentanaAlbum();
        this.setVisible(false);
        vAlbum.setVisible(true);
    }
}
