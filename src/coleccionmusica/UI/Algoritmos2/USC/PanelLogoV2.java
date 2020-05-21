
package coleccionmusica.UI.Algoritmos2.USC;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Juan Sebastian Bejarano y Carlos Augusto Hernandez
 */
public class PanelLogoV2 extends JPanel{
    ImageIcon logoColeccion;
    public  PanelLogoV2(){
        this.setPreferredSize(new Dimension(900, 80));
    }
    
   @Override
   public void paintComponent(Graphics g){
       Dimension tam = getSize();
       logoColeccion = new ImageIcon("./Datos/Imagenes/IconoColeccion2.jpg");
       g.drawImage(logoColeccion.getImage(),0, 0, tam.width,tam.height,null);
       setOpaque(false);
       super.paintComponent(g);
   }
}
