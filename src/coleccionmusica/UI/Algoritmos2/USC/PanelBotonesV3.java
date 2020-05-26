/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionmusica.UI.Algoritmos2.USC;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author cpe
 */
public class PanelBotonesV3 extends JPanel implements ActionListener{
    
    VentanaAlbum miVentantaAlbum;
    JButton guardar;
    JButton cancelar;
    JButton agregar;
    
    public PanelBotonesV3(VentanaAlbum p)
    {
        miVentantaAlbum = p;
        
        this.setBackground(Color.white);
        this.setPreferredSize(new Dimension(900,35));
        this.setLayout(new GridLayout(1,5,50,0));
        
        guardar = new JButton("Guardar");
        
        cancelar = new JButton("Cancelar");
        
        agregar = new JButton("Agregar Cancion");
        
        add(guardar);
        add(cancelar);
        add(agregar);
        add(new JLabel(" "));
        add(new JLabel(" "));
              
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
