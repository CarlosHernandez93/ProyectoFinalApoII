
package coleccionmusica.UI.Algoritmos2.USC;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Juan Sebastian Bejarano y Carlos Augusto Hernandez
 */
public class PanelLabelV2 extends JPanel{
    JLabel JLnombre;
    JLabel JLfechaNac;
    JLabel JLfechaDeb;
    
    public PanelLabelV2(){
        this.setPreferredSize(new Dimension(100, 115));
        setLayout(new GridLayout(7, 1,0,30));
        this.setBackground(Color.white);
        
        JLnombre = new JLabel("Nombre:");
        JLfechaNac = new JLabel("Fecha de Nacimiento:");
        JLfechaDeb = new JLabel("Fecha de Debut:");
        
        add(new JLabel(" "));
        add(JLnombre);
        add(JLfechaNac);
        add(JLfechaDeb);
        add(new JLabel(" "));
        add(new JLabel(" "));
        add(new JLabel(" "));
        
    }
    
}
