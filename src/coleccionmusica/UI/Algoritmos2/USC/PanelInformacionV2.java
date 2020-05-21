
package coleccionmusica.UI.Algoritmos2.USC;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Juan Sebastian Bejarano y Carlos Augusto Hernandez
 */
public class PanelInformacionV2 extends JPanel {
    JTextField JTFnombre;
    JTextField JTFfechaNac;
    JTextField JTFfechaDeb;
    JCheckBox checkActividad;
    JButton JBTaddAlbum;
    
    public PanelInformacionV2(){
        
        setPreferredSize(new Dimension(300,115));
        setLayout(new GridLayout(7, 1,0,30));
        setBackground(Color.white);
        
        JTFnombre = new JTextField();
        JTFfechaNac = new JTextField();
        JTFfechaDeb = new JTextField();
        checkActividad = new JCheckBox();
        checkActividad.setText("En Actividad");
        JBTaddAlbum = new JButton("Añadir Album");
        JBTaddAlbum.setPreferredSize(new Dimension(10, 10));
        checkActividad.setBackground(Color.white);
        
        add(new JLabel(" "));
        add(JTFnombre);
        add(JTFfechaNac);
        add(JTFfechaDeb);
        add(checkActividad);
        add(JBTaddAlbum);
         add(new JLabel(" "));
    }
}
