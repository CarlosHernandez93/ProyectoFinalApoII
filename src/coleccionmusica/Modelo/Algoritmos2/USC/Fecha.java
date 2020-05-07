/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ColeccionMusica.Modelo.Algoritmos2.USC;

/**
 *
 * @author Juan Sebastian Bejarano y Carlos Augusto Hernandez
 */
public class Fecha {
    
    /* atributos */
    private int dia;
    private int mes;
    private int anio;
    
    /* métodos */
    /* métodos constructores */
    public Fecha(int dia, int mes, int anio)
    {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    public Fecha(int anio)
    {
        this.anio = anio;
    }
     
    public Fecha()
    {
        this.dia = 0;
        this.mes = 0;
        this.anio = 0;
    }
    
    // alt + insert:completar código

    //Métodos set o de modificación de atributos
    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    //Métodos get o de consulta de atributos
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }
    
    
    
}
