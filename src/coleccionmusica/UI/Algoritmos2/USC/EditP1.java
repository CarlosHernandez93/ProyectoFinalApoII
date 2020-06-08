    
package coleccionmusica.UI.Algoritmos2.USC;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayer;
import javax.swing.JPanel;

/**
 *
 * @author Juan Sebastian Bejarano y Carlos Augusto Hernandez
 */
public class EditP1 extends JPanel implements ActionListener{
    VentanaIncial miVentanaPadre;
    JButton editar;
    JButton adic;
    JButton JBTreporte;

    final String COMMAND_EDITAR="Editar";
    final String COMMAND_ADICIONAR="Adicionar";
    final String COMMAND_REPORTE="Reporte";
    
    public EditP1(VentanaIncial p) {
        
        miVentanaPadre = p;
        /*añadir espacios */
         
        setLayout( new GridLayout(1,5,110,10));        
        setPreferredSize(new Dimension(45,45));
        this.setBackground(Color.white);
        editar = new JButton("ver/Editar");
        editar.setActionCommand(COMMAND_EDITAR);
        editar.addActionListener(this);
        editar.setToolTipText("Ver/Editar Artista");
        adic  = new JButton("Adicionar");
        adic.setActionCommand(COMMAND_ADICIONAR);
        adic.addActionListener(this);
        adic.setToolTipText("Adiconar Artista");
        JBTreporte  = new JButton("Reporte");
        JBTreporte.setActionCommand(COMMAND_REPORTE);
        JBTreporte.addActionListener(this);
        JBTreporte.setToolTipText("Generar Reporte");
        add(new JLabel());
        add(editar);
        add(adic);
        add(JBTreporte);
        add(new JLabel(" "));
        
    }

    @Override
    public void actionPerformed(ActionEvent a) {
        String comando = a.getActionCommand();
        switch(comando){
            case COMMAND_EDITAR:
                miVentanaPadre.accionEditar();
                break;
            case COMMAND_ADICIONAR:
                miVentanaPadre.accionAdicionar();
                break;
            case COMMAND_REPORTE:
                miVentanaPadre.accionGenerarReporte();
                break;
        }
    }
    
    
    
}
