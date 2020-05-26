/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionmusica.UI.Algoritmos2.USC;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author cpe
 */
public class PanelLabelV3 extends JFrame {
    
    JLabel album, 
           genero, 
           fechaLanzamiento, 
           canciones;
    
    
    public PanelLabelV3()
    {
        this.setPreferredSize(new Dimension(100, 115));
        setLayout(new GridLayout(7, 1,0,30));
        this.setBackground(Color.white);
        
        album = new JLabel("Nombre Album:");
        genero = new JLabel("Genero:");
        fechaLanzamiento = new JLabel("Fecha De Lanzamiento:");
        canciones = new JLabel("Cnciones");
        
        add(new JLabel(" "));
        add(album);
        add(genero);
        add(fechaLanzamiento);
        add(canciones);
        add(new JLabel(" "));
        add(new JLabel(" "));
    }
    
    
}
