
package coleccionmusica.UI.Algoritmos2.USC;

import ColeccionMusica.Modelo.Algoritmos2.USC.Artista;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import ColeccionMusica.Modelo.Algoritmos2.USC.ColeccionMusica;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Sebastian Bejarano y Carlos Augusto Hernandez
 */
public class VentanaArtista extends JFrame{
    
    int alto,ancho, posicion2;
    PanelInformacionV2 miPanelInformacion;
    PanelBotonesV2 miPanelBotones;
    PanelLogoV2 miLogo;
    PanelLabelV2 miPanelLabel;
    PanelArtistaV2 miPanelArtista;
    VentanaIncial miVentanaInical;
    ColeccionMusica miColeccionMusica2;
     
    public VentanaArtista(){
        alto = 600;
        ancho= 900;
        this.setSize(ancho, alto);
        this.setLocationRelativeTo(null);
        this.setAlwaysOnTop(true);
        this.setTitle("Artista");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        
        miPanelInformacion = new PanelInformacionV2(this);
        miPanelBotones = new PanelBotonesV2(this);
        miLogo = new PanelLogoV2();
        miPanelLabel = new PanelLabelV2();
        miPanelArtista = new PanelArtistaV2();
        miVentanaInical = new VentanaIncial();
        miColeccionMusica2 = new ColeccionMusica();
        //miColeccionMusica2.setArtistas(miVentanaInical.GuardarArtista());
        
        add(miLogo,BorderLayout.NORTH);
        add(miPanelBotones,BorderLayout.SOUTH);
        add(miPanelInformacion,BorderLayout.EAST);
        add(miPanelArtista,BorderLayout.WEST);
        add(miPanelLabel,BorderLayout.CENTER);
        
   }
    
    public void CargarArtistaV2(ArrayList<Artista> artistas, String propietario){
        miColeccionMusica2.setPropietario(propietario);
        miColeccionMusica2.setArtistas(artistas);
    }
    
    public void CargarInformacion(int posicion){
        String fechaNac, fechaDeb;
        int diaFecha1, diaFecha2, mesFecha1, mesFecha2, ageFecha1, ageFecha2;
        miPanelInformacion.CargarNombreV2(miColeccionMusica2.getArtistas().get(posicion).getNombre());
        diaFecha1 = miColeccionMusica2.getArtistas().get(posicion).getFechaNacimiento().getDia();
        diaFecha2 = miColeccionMusica2.getArtistas().get(posicion).getFechaDebut().getDia();
        mesFecha1 = miColeccionMusica2.getArtistas().get(posicion).getFechaNacimiento().getMes();
        mesFecha2 = miColeccionMusica2.getArtistas().get(posicion).getFechaDebut().getMes(); 
        ageFecha1 = miColeccionMusica2.getArtistas().get(posicion).getFechaNacimiento().getAnio();
        ageFecha2 = miColeccionMusica2.getArtistas().get(posicion).getFechaDebut().getAnio();
        fechaNac =String.valueOf(diaFecha1)+"/"+String.valueOf(mesFecha1)+"/"+String.valueOf(ageFecha1);
        miPanelInformacion.CargarFechaNacV2(fechaNac);
        fechaDeb =String.valueOf(diaFecha2)+"/"+String.valueOf(mesFecha2)+"/"+String.valueOf(ageFecha2);
        miPanelInformacion.CargarFechaDebV2(fechaDeb);
        miPanelInformacion.CargarEstadoV2(miColeccionMusica2.getArtistas().get(posicion).getEstaActivo());
        miPanelArtista.CargarImagenV2(miColeccionMusica2.getArtistas().get(posicion).getImagen());
        posicion2 = posicion;
    }
    
    public void accionVolver(){
        this.setVisible(false); 
        VentanaIncial vInicio = new VentanaIncial();
        vInicio.CargarArtistaV1(miColeccionMusica2.getArtistas(), miColeccionMusica2.getPropietario());
        vInicio.CargaInicial();
        vInicio.setVisible(true);
    }
    
    public void accionAñadirAlbum(){
        VentanaAlbum vAlbum = new VentanaAlbum();
        this.setVisible(false);
        if (posicion2>3) {
            //Cuando se crea el artista, se crea el arreglo album por lo que esta vacio
            if(miColeccionMusica2.getArtistas().get(posicion2).getAlbumes().size()==0){
                vAlbum.CargarAlbumV3(miColeccionMusica2.getArtistas(),miColeccionMusica2.getPropietario());
                vAlbum.accionAgregarAlbum2(posicion2);
                vAlbum.CargarInformacionV3(posicion2,0);                
            }
            else{
                vAlbum.CargarAlbumV3(miColeccionMusica2.getArtistas(), miColeccionMusica2.getPropietario());
                vAlbum.CargarInformacionV3(posicion2,0);  
            }
        }
        else{
        vAlbum.CargarAlbumV3(miColeccionMusica2.getArtistas(),miColeccionMusica2.getPropietario());
        vAlbum.CargarInformacionV3(posicion2,0);    
        }
        vAlbum.setVisible(true);
    }
    
    public void accionActualizar(){
        this.setAlwaysOnTop(false);
        int dia, mes, age;
        miColeccionMusica2.getArtistas().get(posicion2).setNombre(miPanelInformacion.JTFnombre.getText());
        String fechaNac[] = miPanelInformacion.JTFfechaNac.getText().split("/");
        dia = Integer.parseInt(fechaNac[0]);
        mes = Integer.parseInt(fechaNac[1]);
        age = Integer.parseInt(fechaNac[2]);
        miColeccionMusica2.getArtistas().get(posicion2).getFechaNacimiento().setDia(dia);
        miColeccionMusica2.getArtistas().get(posicion2).getFechaNacimiento().setMes(mes);
        miColeccionMusica2.getArtistas().get(posicion2).getFechaNacimiento().setAnio(age);
        
        String fechaDeb[] = miPanelInformacion.JTFfechaDeb.getText().split("/");
        dia = Integer.parseInt(fechaDeb[0]);
        mes = Integer.parseInt(fechaDeb[1]);
        age = Integer.parseInt(fechaDeb[2]);
        miColeccionMusica2.getArtistas().get(posicion2).getFechaDebut().setDia(dia);
        miColeccionMusica2.getArtistas().get(posicion2).getFechaDebut().setMes(mes);
        miColeccionMusica2.getArtistas().get(posicion2).getFechaDebut().setAnio(age);
        
        miColeccionMusica2.getArtistas().get(posicion2).setNombre(miPanelInformacion.JTFnombre.getText());
        
        miColeccionMusica2.getArtistas().get(posicion2).setEstaActivo(miPanelInformacion.checkActividad.isSelected());
        
        JOptionPane.showMessageDialog(null, "Se actualizo la informacion correctamente");
    }
}
