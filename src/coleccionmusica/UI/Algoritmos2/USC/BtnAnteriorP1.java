/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionmusica.UI.Algoritmos2.USC;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.*;
import javax.swing.*;

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
        
        setLayout(new GridLayout(8,8));
        
        setPreferredSize(new Dimension(200, 400));
        
        
        botonAnt = new JButton("Anterior");
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
