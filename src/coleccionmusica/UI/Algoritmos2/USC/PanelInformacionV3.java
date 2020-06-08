/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionmusica.UI.Algoritmos2.USC;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javafx.scene.control.ComboBox;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author Juan Sebastian Bejarano y Carlos Augusto Hernandez
 */
public class PanelInformacionV3 extends JPanel implements ActionListener{
    
    VentanaAlbum miVentanaAlbum;
    JList Listacanciones;
    JTextField JTFgenero;
    JTextField JTFalbum;
    JTextField JTFfechaLan;
    DefaultListModel modeloLista;
    JButton JBTsiguiente;
    JButton JBTanteriror;
    final String COMMAND_SIGUIENTE="Siguiente";
    final String COMMAND_VOLVER="Volver";
    
    public PanelInformacionV3(VentanaAlbum p){
        miVentanaAlbum = p;
        this.setPreferredSize(new Dimension(300, 115));
        this.setBackground(Color.WHITE);
        this.setLayout(new GridLayout(7,1,0,30));
        
        modeloLista = new DefaultListModel();
        Listacanciones = new JList();
        Listacanciones.setModel(modeloLista);
        Listacanciones.setBackground(Color.white);
        JTFalbum = new JTextField();
        JTFgenero = new JTextField();
        JTFgenero.setEnabled(false);
        JTFfechaLan = new JTextField();
        Listacanciones.setVisibleRowCount(1);
        JBTsiguiente = new JButton("Siguiente Album");
        JBTsiguiente.setActionCommand(COMMAND_SIGUIENTE);
        JBTsiguiente.addActionListener(this);
        JBTanteriror = new JButton("Anterior Album");
        JBTanteriror.setActionCommand(COMMAND_VOLVER);
        JBTanteriror.addActionListener(this);
       
        add(JTFalbum);
        add(JTFgenero);
        add(JTFfechaLan);
        add(new JScrollPane(Listacanciones));
        add(JBTsiguiente);
        add(JBTanteriror);
    }

    public void CargarNombreAlbumV3(String nombre){
        this.JTFalbum.setText(nombre);
    }
    public void CargarGeneroAlbumV3(String genero){
        this.JTFgenero.setText(genero);
   }
    
    public void CargarFechaLanV2(String fechaLan){
        this.JTFfechaLan.setText(fechaLan);
    }
    
    public void AgregarValores(String nombre){
        String valor = nombre;
        modeloLista.addElement(valor);
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        switch(comando){
            case COMMAND_SIGUIENTE:
                miVentanaAlbum.accionSiguiente();
                break;
            case COMMAND_VOLVER:
                miVentanaAlbum.accionAnterior();
                break;
        }
    }
        
}
