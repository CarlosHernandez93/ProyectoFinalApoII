
package coleccionmusica.UI.Algoritmos2.USC;

import java.awt.BorderLayout;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import sun.util.locale.provider.AuxLocaleProviderAdapter;

/**
 *
 * @author Juan Sebastian Bejarano y Carlos Augusto Hernandez
 */
public class BtnAnteriorP1 extends JPanel implements ActionListener{
    
    VentanaIncial miVentanaPadre;
    JButton botonAnt;
    final String COMMNAD_ANTERIOR="Anterior";
    
    public BtnAnteriorP1(VentanaIncial p)
    {
        
        /*como hacer llamada en ventana padre ¿? */
        miVentanaPadre = p ;      
        
        setLayout(new GridLayout(7,1));
        
        setPreferredSize(new Dimension(200, 450));
        
         this.setBackground(Color.white);
        
        botonAnt = new JButton("Anterior");
        botonAnt.setToolTipText("Anterior Artista");
        botonAnt.setActionCommand(COMMNAD_ANTERIOR);
        botonAnt.addActionListener(this);
        
        add(new JLabel(" "));
        add(new JLabel(" "));
        add(new JLabel(" "));
        add(botonAnt);
        add(new JLabel(" "));
        add(new JLabel(" "));
        add(new JLabel(" "));
    }
    
    public VentanaIncial getMiVentanaPadre() {
        return miVentanaPadre;
    }
    
    public void setMiVentanaPadre(VentanaIncial miVentanaPadre) {
        this.miVentanaPadre = miVentanaPadre;
    }
  
    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        switch (comando){
            case COMMNAD_ANTERIOR:
                miVentanaPadre.accionAnterior();
                break;
        }
     
    }

    
    
}
