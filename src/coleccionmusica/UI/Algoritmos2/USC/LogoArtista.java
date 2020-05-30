
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
    VentanaIncial miVentanaInical;
    JLabel nombreArtista;
    JLabel artista;
    ImageIcon imagenArtista;
    
    public LogoArtista(VentanaIncial p)
    {
        miVentanaInical = p;
        this.setLayout(new BorderLayout());
        this.setBackground(Color.white);
        nombreArtista = new JLabel(miVentanaInical.CargaInicialNombre());
        artista = new JLabel();
        imagenArtista = new ImageIcon(miVentanaInical.CargaInicialImagen());
        artista.setIcon(imagenArtista);
        
        add(nombreArtista, BorderLayout.NORTH);
        add(artista, BorderLayout.CENTER);
    }
    
    public void CambiarNombre(String informacion){
       nombreArtista.setText(informacion);
    }
 
    public void CambiarImagen(String informacion){
        imagenArtista = new ImageIcon(informacion);
        artista.setIcon(imagenArtista);
    }
}
