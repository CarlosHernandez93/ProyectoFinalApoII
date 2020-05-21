
package coleccionmusica.UI.Algoritmos2.USC;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Juan Sebastian Bejarano y Carlos Augusto Hernandez
 */
public class PanelArtistaV2 extends JPanel{
    ImageIcon  imagenArtista;
    JLabel JLnombreArt;
    JLabel imgArtista;
   
    
    public PanelArtistaV2(){
        this.setPreferredSize(new Dimension(350,115));
        this.setLayout(new BorderLayout());
        this.setBackground(Color.white);
        
        JLnombreArt = new JLabel("Nombre");
        imgArtista = new JLabel();
        imagenArtista = new ImageIcon("./Datos/Imagenes/IconoColeccion2.jpg");
        imgArtista.setIcon(imagenArtista); 
        add(JLnombreArt,BorderLayout.NORTH);
        add(imgArtista,BorderLayout.CENTER);
    }
    
    /*@Override
    public void paintComponent(Graphics g){
       Dimension tam = getSize();
       imagenArtista = new ImageIcon("./Datos/Imagenes/IconoColeccion2.jpg");
       g.drawImage(imagenArtista.getImage(),0, 0, tam.width,120,null);
       setOpaque(false);
       super.paintComponent(g);
   }*/
}
