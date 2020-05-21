
package coleccionmusica.UI.Algoritmos2.USC;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Juan Sebastian Bejarano y Carlos Augusto Hernandez
 */
public class BtnSiguienteP1 extends JPanel implements ActionListener{
    
    
    VentanaIncial miVentanaPadre;
    JButton botonSig;
    
    
    public BtnSiguienteP1(VentanaIncial p)
    {
        
        /*separar espacios con JLabel vacios*/
        miVentanaPadre = p ;      
        
        setLayout(new GridLayout(15,4));
        
        setPreferredSize(new Dimension(200, 300));
        
        this.setBackground(Color.white);
        
        botonSig = new JButton("Siguiente");
        botonSig.setToolTipText("Click para Seguir");
        
        add(new JLabel(" "));                
        add(new JLabel(" "));
        add(new JLabel(" "));
        add(new JLabel(" "));
        add(new JLabel(" "));        
        add(new JLabel(" "));       
        add(new JLabel(" "));        
        add(botonSig);
        
    }

    public VentanaIncial getMiVentanaPadre() {
        return miVentanaPadre;
    }

    public void setMiVentanaPadre(VentanaIncial miVentanaPadre) {
        this.miVentanaPadre = miVentanaPadre;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
