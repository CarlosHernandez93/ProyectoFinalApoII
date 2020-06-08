
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
    final String COMMAND_SIGUIENTE="Siguiente";
       
    public BtnSiguienteP1(VentanaIncial e)
    {
        
        /*separar espacios con JLabel vacios*/
        miVentanaPadre = e;      
        
        setLayout(new GridLayout(7,1));
        
        setPreferredSize(new Dimension(200, 450));
        
        this.setBackground(Color.white);
        
        botonSig = new JButton("Siguiente");
        botonSig.setToolTipText("Siguiente Artista");
        botonSig.setActionCommand(COMMAND_SIGUIENTE);
        botonSig.addActionListener(this);
        
        add(new JLabel(" "));
        add(new JLabel(" "));
        add(new JLabel(" "));
        add(botonSig);
        add(new JLabel(" "));
        add(new JLabel(" "));
        add(new JLabel(" "));
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
           
        String comando = e.getActionCommand();
        switch (comando){
            case COMMAND_SIGUIENTE:
                miVentanaPadre.accionSiguiente();
                break;
        }
    }
    
    
}
