
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
    JButton agregar;
    JButton agregarAlbum;
    JButton JBTvolver;
    
    final String COMMAND_VOLVER = "Volver";
    final String COMMAND_AGREGARCANCION = "AgregarCancion";
    final String COMMAND_AGREGARALBUM = "AgregarAlbum";
    final String COMMAND_ACTUALIZAR = "Actualizar";
    
    public PanelBotonesV3(VentanaAlbum p)
    {
        miVentantaAlbum = p;
        
        this.setBackground(Color.white);
        this.setPreferredSize(new Dimension(900,35));
        this.setLayout(new GridLayout(1,4,50,0));
        
        guardar = new JButton("Guardar");
        guardar.setToolTipText("Guardar los datos");
        guardar.setActionCommand(COMMAND_ACTUALIZAR);
        guardar.addActionListener(this);
        
        agregarAlbum = new JButton("Agregar Album");
        agregarAlbum.setToolTipText("Agregar nuevo album");
        agregarAlbum.setActionCommand(COMMAND_AGREGARALBUM);
        agregarAlbum.addActionListener(this);
        
        agregar = new JButton("Agregar Cancion");
        agregar.setToolTipText("Agregar nuevo artista");
        agregar.setActionCommand(COMMAND_AGREGARCANCION);
        agregar.addActionListener(this);
            
        JBTvolver = new JButton("Volver");
        JBTvolver.setToolTipText("Volver a la venta de Artista");
        JBTvolver.setActionCommand(COMMAND_VOLVER);
        JBTvolver.addActionListener(this);
           
        add(guardar);
        add(agregar);
        add(agregarAlbum);
        add(JBTvolver);
              
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        switch (comando){
            case COMMAND_VOLVER:
                miVentantaAlbum.accionVolver();
                break;
                
            case COMMAND_AGREGARCANCION:
                miVentantaAlbum.accionAgregar();
                break;
                
            case COMMAND_AGREGARALBUM:
                miVentantaAlbum.accionAgregarAlbum1();
                break;
            
            case COMMAND_ACTUALIZAR:
                miVentantaAlbum.accionActualizar();
                break;
        }
    }
    
}
