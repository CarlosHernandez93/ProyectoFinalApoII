/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionmusica.UI.Algoritmos2.USC;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javafx.scene.control.ComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author cpe
 */
public class PanelInformacionV3 extends JPanel {
    
    JTextArea JTAcanciones;
    JTextField JTFalbum;
    ComboBox<String> CBgenero;
    JTextField JTFfechaLan;
    
    public PanelInformacionV3(){
        this.setPreferredSize(new Dimension(300, 115));
        this.setBackground(Color.WHITE);
        this.setLayout(new GridLayout(7,1,0,30));
        
        JTAcanciones = new JTextArea();
      
        JTFalbum = new JTextField();
        //CBgenero = new ComboBox<>();
        JTFfechaLan = new JTextField();
        
        add(new JLabel(" "));
        add(JTFalbum);
        add(new JLabel(" "));
        add(JTFfechaLan);
        add(JTAcanciones);
    }
    
}
