
package coleccionmusica.UI.Algoritmos2.USC;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author cpe
 */
public class LogoAlbum extends JPanel{
    ImageIcon  imagenAlbum;
    JLabel nombreAlbum;
    JLabel espacioAlbum;
   
    
    public LogoAlbum(){
        this.setPreferredSize(new Dimension(350,115));
        this.setLayout(new BorderLayout());
        this.setBackground(Color.white);
        
        espacioAlbum = new JLabel();
        imagenAlbum = new ImageIcon();
        espacioAlbum.setIcon(imagenAlbum); 
        add(espacioAlbum,BorderLayout.NORTH);
    }
    
    public void CargarImagenV3 (String rutaImagen){
       imagenAlbum = new ImageIcon(rutaImagen);
       this.espacioAlbum.setIcon(imagenAlbum); 
    }
   
    }
