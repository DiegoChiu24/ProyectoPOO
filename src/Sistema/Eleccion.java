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
    private Candidato candidato1, candidato2;

    public Eleccion(String fecha, String tipoEleccion, Candidato candidato1, Candidato candidato2) {
        this.fecha = fecha;
        this.tipoEleccion = tipoEleccion;
        this.candidato1 = candidato1;
        this.candidato2 = candidato2;
    }



    public String getFecha() {
        return fecha;
    }

    public String getTipoEleccion() {
        return tipoEleccion;
    }

    public Candidato getCandidato1() {
        return candidato1;
    }

    public Candidato getCandidato2() {
        return candidato2;
    }

    

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setTipoEleccion(String tipoEleccion) {
        this.tipoEleccion = tipoEleccion;
    }

    public void setCandidato1(Candidato candidato1) {
        this.candidato1 = candidato1;
    }

    public void setCandidato2(Candidato candidato2) {
        this.candidato2 = candidato2;
    }

    @Override 
    public String toString(){
        return tipoEleccion + " " + fecha;
    }
}
