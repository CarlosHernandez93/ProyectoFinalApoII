
package coleccionmusica.UI.Algoritmos2.USC;

import java.awt.BorderLayout;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import sun.util.locale.provider.AuxLocaleProviderAdapter;

/**
 *
 * @author Juan Sebastian Bejarano y Carlos Augusto Hernandez
 */
public class BtnAnteriorP1 extends JPanel implements ActionListener{
    
    VentanaIncial miVentanaPadre;
    JButton botonAnt;
    
    public BtnAnteriorP1(VentanaIncial p)
    {
        
        /*como hacer llamada en ventana padre ¿? */
        miVentanaPadre = p ;      
        
        setLayout(new GridLayout(15,5));
        
        setPreferredSize(new Dimension(200, 300));
        
         this.setBackground(Color.white);
        
        botonAnt = new JButton("Anterior");
        botonAnt.setToolTipText("Click para volver");
        
        add(new JLabel(" "));
        add(new JLabel(" "));
        add(new JLabel(" "));
        add(new JLabel(" "));
        add(new JLabel(" "));
        add(new JLabel(" "));
        add(new JLabel(" "));
                
        add(botonAnt);
        
    }
    
    public VentanaIncial getMiVentanaPadre() {
        return miVentanaPadre;
    }
    
    public void setMiVentanaPadre(VentanaIncial miVentanaPadre) {
        this.miVentanaPadre = miVentanaPadre;
    }

   

    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
