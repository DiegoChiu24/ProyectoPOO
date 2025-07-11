/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;

/**
 *
 * @author wachi
 */
public class GestionCandidato {

    private Candidato[] listaCandidatos;
    private int cantidadRegistrada;

    public GestionCandidato(int capacidadMaxima) {
        this.listaCandidatos = new Candidato[capacidadMaxima];
        this.cantidadRegistrada = 0;
    }

    public boolean registrarCandidato(Candidato nuevoCandidato) {
        if (cantidadRegistrada < listaCandidatos.length) {
            listaCandidatos[cantidadRegistrada] = nuevoCandidato;
            cantidadRegistrada++;
            return true;
        }
        return false;
    }

    public boolean modificarCandidato(int indice, Candidato candidatoActualizado) {
        if (indice >= 0 && indice < cantidadRegistrada) {
            listaCandidatos[indice] = candidatoActualizado;
            return true;
        }
        return false;
    }

    public boolean eliminarCandidato(int indice) {
        if (indice >= 0 && indice < cantidadRegistrada) {
            for (int i = indice; i < cantidadRegistrada - 1; i++) {
                listaCandidatos[i] = listaCandidatos[i + 1];
            }
            listaCandidatos[cantidadRegistrada - 1] = null;
            cantidadRegistrada--;
            return true;
        }
        return false;
    }

    public Candidato[] obtenerCandidatos() {
        Candidato[] copia = new Candidato[cantidadRegistrada];
        for (int i = 0; i < cantidadRegistrada; i++) {
            copia[i] = listaCandidatos[i];
        }
        return copia;
    }

    public int obtenerCantidadRegistrada() {
        return cantidadRegistrada;
    }
}
