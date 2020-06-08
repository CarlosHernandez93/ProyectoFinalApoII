
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
 * @author Juan Sebastian Bejarano y Carlos Augusto Hernandez
 */
public class PanelBotonesV2 extends JPanel implements ActionListener{
    VentanaArtista miVentantaArtista;
    JButton JBTguardar;
    JButton JBTvolver;
    final String COMMAND_VOLVER="Volver";
    final String COMMAND_ACTUALIZAR="Actualizar";
    
    public PanelBotonesV2(VentanaArtista p){
        miVentantaArtista=p;
        
        this.setBackground(Color.white);
        this.setPreferredSize(new Dimension(900,35));
        this.setLayout(new GridLayout(1,5,50,0));
        
        JBTguardar = new JButton("Guardar");
        JBTguardar.setToolTipText("Click para guardar");
        JBTguardar.setActionCommand(COMMAND_ACTUALIZAR);
        JBTguardar.addActionListener(this);
        JBTvolver = new JButton("Volver");
        JBTvolver.setToolTipText("Click para voler");
        JBTvolver.setActionCommand(COMMAND_VOLVER);
        JBTvolver.addActionListener(this);
        
        add(JBTguardar);
        add(new JLabel(" "));
        add(new JLabel(" "));
        add(new JLabel(" "));
        add(JBTvolver);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        switch(comando){
            case COMMAND_VOLVER:
                miVentantaArtista.accionVolver();
                break;
                
            case COMMAND_ACTUALIZAR:
                miVentantaArtista.accionActualizar();
                break;
        }
    }
    
}
