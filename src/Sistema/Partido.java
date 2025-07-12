/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;

/**
 *
 * @author aaap2
 */
public class Partido {
    
    private String nombre, sigla, logo, representante;

    public Partido(String nombre, String sigla, String logo, String representante) {
        this.nombre = nombre;
        this.sigla = sigla;
        this.logo = logo;
        this.representante = representante;
    }

    public String getNombre() {
        return nombre;
    }
    public String getSigla() {
        return sigla;
    }
    public String getLogo() {
        return logo;
    }
    public String getRepresentante() {
        return representante;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    public void setLogo(String logo) {
        this.logo = logo;
    }
    public void setRepresentante(String representante) {
        this.representante = representante;
    }
    
    
}
