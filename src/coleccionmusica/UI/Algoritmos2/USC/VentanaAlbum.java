
package coleccionmusica.UI.Algoritmos2.USC;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author Juan Sebastian Bejarano y Carlos Augusto Hernandez
 */
public class VentanaAlbum extends JFrame{
    
    int ancho;
    int alto;
    
    PanelInformacionV3 miInfo;
    PanelBotonesV3 miPanelBotones;
    PanelLogoV3 miLogo;
    PanelLabelV3 miPanelLabel;
    LogoAlbum miLogoAlbum;
    
    
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
        
        
        miInfo = new PanelInformacionV3();
        miPanelBotones = new PanelBotonesV3(this);
        miLogo = new PanelLogoV3();
        miPanelLabel = new PanelLabelV3();
        miLogoAlbum = new LogoAlbum();
        
        add(miInfo, BorderLayout.EAST);
        add(miPanelBotones, BorderLayout.SOUTH);
        add(miLogo, BorderLayout.NORTH);
        add(miPanelLabel, BorderLayout.CENTER);
        add(miLogoAlbum, BorderLayout.WEST);
        
       
        
    }
    
   
    
}
