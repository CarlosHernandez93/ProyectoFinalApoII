
package coleccionmusica.UI.Algoritmos2.USC;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Label;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Juan Sebastian Bejarano y Carlos Augusto Hernandez
 */
public class LogoArtista extends JPanel {
    JLabel nombreArtista;
    JLabel artista;
    ImageIcon imagenArtista;
    
    public LogoArtista()
    {
        this.setLayout(new BorderLayout());
        this.setBackground(Color.white);
        
        nombreArtista = new JLabel("Hola sebastian");
        artista = new JLabel();
        imagenArtista = new ImageIcon();
        artista.setIcon(imagenArtista);
        
        add(nombreArtista, BorderLayout.NORTH);
        add(artista, BorderLayout.CENTER);
    }
    
    public void CambiarNombre(String informacion1){
        this.nombreArtista.setText(informacion1);
    }
 
    public void CambiarImagen(String informacion2){
        this.imagenArtista = new ImageIcon(informacion2);
        this.artista.setIcon(imagenArtista);
    }
}
