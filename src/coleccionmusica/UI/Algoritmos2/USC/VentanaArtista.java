
package coleccionmusica.UI.Algoritmos2.USC;

import java.awt.BorderLayout;
import javax.swing.JFrame;

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
    
    public VentanaArtista(){
        alto = 600;
        ancho= 900;
        this.setSize(ancho, alto);
        this.setLocationRelativeTo(null);
        this.setAlwaysOnTop(true);
        this.setTitle("Artista");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        
        miPanelInformacion = new PanelInformacionV2();
        miPanelBotones = new PanelBotonesV2(this);
        miLogo = new PanelLogoV2();
        miPanelLabel = new PanelLabelV2();
        miPanelArtista = new PanelArtistaV2();
        
        add(miLogo,BorderLayout.NORTH);
        add(miPanelBotones,BorderLayout.SOUTH);
        add(miPanelInformacion,BorderLayout.EAST);
        add(miPanelArtista,BorderLayout.WEST);
        add(miPanelLabel,BorderLayout.CENTER);
        
   }
    
    public void accionVolver(){
        VentanaIncial vInicio = new VentanaIncial();
        this.setVisible(false);
        vInicio.setVisible(true);        
    }
    
}
