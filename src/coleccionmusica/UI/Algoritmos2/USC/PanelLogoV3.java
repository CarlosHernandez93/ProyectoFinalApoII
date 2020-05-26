/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionmusica.UI.Algoritmos2.USC;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author cpe
 */
public class PanelLogoV3 extends JPanel {
     ImageIcon logoColeccion ;
     
     public  PanelLogoV3(){
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
