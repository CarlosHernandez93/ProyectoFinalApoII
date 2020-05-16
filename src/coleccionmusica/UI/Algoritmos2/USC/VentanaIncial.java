/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionmusica.UI.Algoritmos2.USC;

import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Juan Sebastian Bejarano y Carlos Augusto Hernandez
 */
public class VentanaIncial extends JFrame{
    
    BtnAnteriorP1 btnAtras;
    BtnSiguienteP1 btnSiguiente;
    LogoArtista imgArtista;
    EditP1 editor;
    
    int ancho, alto;
    ImageIcon artista;
    
    public VentanaIncial()
    {
        ancho = 900;
        alto = 600;
        
       
        
        setSize(ancho, alto);
        setAlwaysOnTop(true);
        
        
        setTitle("Tu Coleccion");
        
        setBackground(Color.BLACK);
        
         this.setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);        
        setLayout(new BorderLayout());
        
       //logo artista
        
        btnAtras = new BtnAnteriorP1(this); //falta el this para hacer referencia a la ventana padre
        btnSiguiente = new BtnSiguienteP1(this); // fata ""  "" "" a la ventana padre
        editor = new EditP1(this);
        imgArtista = new LogoArtista(this);
        
        //add(btnAtras, BorderLayout.WEST);
        add(btnSiguiente, BorderLayout.EAST);
        add(btnAtras, BorderLayout.WEST);
        
        add(editor, BorderLayout.SOUTH);
        add(imgArtista, BorderLayout.CENTER);
       
    }
    
    
    public static void main(String[] args)
        {
            
            VentanaIncial miVentana = new VentanaIncial();
            miVentana.setVisible(true);
            
        }

   
    
}
