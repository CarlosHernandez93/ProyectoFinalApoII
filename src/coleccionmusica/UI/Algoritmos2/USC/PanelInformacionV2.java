
package coleccionmusica.UI.Algoritmos2.USC;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Juan Sebastian Bejarano y Carlos Augusto Hernandez
 */
public class PanelInformacionV2 extends JPanel implements ActionListener{
    VentanaArtista miVentanaArtista;
    JTextField JTFnombre;
    JTextField JTFfechaNac;
    JTextField JTFfechaDeb;
    JCheckBox checkActividad;
    JButton JBTaddAlbum;
    
    final String COMMAND_AÑADIR="Añadir";
    
    public PanelInformacionV2(VentanaArtista p){
        miVentanaArtista = p;
        setPreferredSize(new Dimension(300,115));
        setLayout(new GridLayout(7, 1,0,30));
        setBackground(Color.white);
        
        JTFnombre = new JTextField();
        JTFfechaNac = new JTextField();
        JTFfechaDeb = new JTextField();
        checkActividad = new JCheckBox();
        checkActividad.setText("En Actividad");
        JBTaddAlbum = new JButton("Añadir Album");
        JBTaddAlbum.setPreferredSize(new Dimension(10, 10));
        JBTaddAlbum.setActionCommand(COMMAND_AÑADIR);
        JBTaddAlbum.addActionListener(this);
        checkActividad.setBackground(Color.white);
        
        add(new JLabel(" "));
        add(JTFnombre);
        add(JTFfechaNac);
        add(JTFfechaDeb);
        add(checkActividad);
        add(JBTaddAlbum);
        add(new JLabel(" "));
        
    }

    public void CargarNombreV2(String nombre){
        this.JTFnombre.setText(nombre);
    }
    
    public void CargarEstadoV2(boolean estado){
        this.checkActividad.setSelected(estado);
    }
    public void CargarFechaNacV2(String fechaNac){
        this.JTFfechaNac.setText(fechaNac);
    }
    public void CargarFechaDebV2(String fechaDeb){
        this.JTFfechaDeb.setText(fechaDeb);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        switch(comando){
            case COMMAND_AÑADIR:
                miVentanaArtista.accionAñadirAlbum();
                break;
        }
    }
    
    
}
