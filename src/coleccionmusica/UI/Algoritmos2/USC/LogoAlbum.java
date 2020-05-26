/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionmusica.UI.Algoritmos2.USC;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author cpe
 */
public class LogoAlbum extends JFrame{
    ImageIcon  imagenArtista;
    JLabel nombreAlbum;
    JLabel espacioAlbum;
   
    
    public LogoAlbum(){
        this.setPreferredSize(new Dimension(350,115));
        this.setLayout(new BorderLayout());
        this.setBackground(Color.white);
        
        nombreAlbum = new JLabel("Nombre");
        espacioAlbum = new JLabel();
        imagenArtista = new ImageIcon("./Datos/Imagenes/IconoColeccion2.jpg");
        espacioAlbum.setIcon(imagenArtista); 
        add(nombreAlbum,BorderLayout.NORTH);
        add(espacioAlbum,BorderLayout.CENTER);
    }
    
    
    
    
    }
