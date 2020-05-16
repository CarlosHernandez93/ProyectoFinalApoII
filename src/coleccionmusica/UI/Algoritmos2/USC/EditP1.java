/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionmusica.UI.Algoritmos2.USC;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayer;
import javax.swing.JPanel;

/**
 *
 * @author cpe
 */
public class EditP1 extends JPanel implements ActionListener{
    VentanaIncial miVentanaPadre;
    JButton editar;
    JButton adic;

    EditP1(VentanaIncial p) {
        
        miVentanaPadre = p;
        /*añadir espacios */
         
        setLayout( new GridLayout(1,4));        
        setSize(300, 300);
        
        editar = new JButton("ver/editar");
        adic  = new JButton("adicionar");
         add(new JLabel());
         add(editar);
         add(adic);
         add(new JLabel(" "));
                         
                 
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
