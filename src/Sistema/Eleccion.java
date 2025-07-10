/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;

/**
 *
 * @author aaap2
 */
public class Eleccion {
    private String fecha, tipoEleccion;
    private Candidato[] listCandidatos = new Candidato[10];
    private int cantcandidatos = 0; 

    public Eleccion(String fecha, String tipoEleccion) {
        this.fecha = fecha;
        this.tipoEleccion = tipoEleccion;
    }

    public String getFecha() {
        return fecha;
    }

    public String getTipoEleccion() {
        return tipoEleccion;
    }

    public Candidato[] getListCandidatos() {
        return listCandidatos;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setTipoEleccion(String tipoEleccion) {
        this.tipoEleccion = tipoEleccion;
    }

    public void setListCandidatos(Candidato[] listCandidatos) {
        this.listCandidatos = listCandidatos;
    }

    public int getCantcandidatos() {
        return cantcandidatos;
    }

    public void setCantcandidatos(int cantcandidatos) {
        this.cantcandidatos = cantcandidatos;
    }

    public boolean Añadircandidato(Candidato pepe) {
        if (cantcandidatos < listCandidatos.length) { 
            listCandidatos[cantcandidatos] = pepe;
            cantcandidatos++;
            return true;
        }
        return false;
    }

    public int NumCandidatos() {
        return cantcandidatos;
    }
}
