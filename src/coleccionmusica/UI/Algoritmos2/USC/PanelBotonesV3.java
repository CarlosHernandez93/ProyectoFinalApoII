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
    JButton JBTsiguiente;
    JButton JBTvolver;
    final String COMMAND_VOLVER = "Volver";
    
    public PanelBotonesV3(VentanaAlbum p)
    {
        miVentantaAlbum = p;
        
        this.setBackground(Color.white);
        this.setPreferredSize(new Dimension(900,35));
        this.setLayout(new GridLayout(1,5,50,0));
        
        guardar = new JButton("Guardar");
        
        cancelar = new JButton("Cancelar");
        
        agregar = new JButton("Agregar Cancion");
        
        JBTsiguiente = new JButton("Sgiente Album");
        
        JBTvolver = new JButton("Volver");
        JBTvolver.setToolTipText("Volver a la venta de Artista");
        JBTvolver.setActionCommand(COMMAND_VOLVER);
        JBTvolver.addActionListener(this);
        
        add(guardar);
        add(cancelar);
        add(agregar);
        add(new JLabel(" "));
        add(JBTvolver);
              
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        switch (comando){
            case COMMAND_VOLVER:
                miVentantaAlbum.accionVolver();
                break;
        }
    }
    
}
