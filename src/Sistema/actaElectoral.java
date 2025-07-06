/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;

/**
 *
 * @author aaap2
 */
public class actaElectoral {
    private String tituloDoc, fecha, hora, lugar, observaciones, selloOficial;
    private int IdMesa, totalVotantesRegistrados, totalVotantesEfectivos, votosBlanco, votosNulos, numeroActa;
    private MesaElectoral MesaElectoral;
    private int[] resultadosXcandidato = new int[10];
    private String[] firmas = new String[30];

    public actaElectoral(String tituloDoc, String fecha, String hora, String lugar, String observaciones, String selloOficial, int IdMesa, int totalVotantesRegistrados, int totalVotantesEfectivos, int votosBlanco, int votosNulos, int numeroActa, MesaElectoral MesaElectoral) {
        this.tituloDoc = tituloDoc;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.observaciones = observaciones;
        this.selloOficial = selloOficial;
        this.IdMesa = IdMesa;
        this.totalVotantesRegistrados = totalVotantesRegistrados;
        this.totalVotantesEfectivos = totalVotantesEfectivos;
        this.votosBlanco = votosBlanco;
        this.votosNulos = votosNulos;
        this.numeroActa = numeroActa;
        this.MesaElectoral = MesaElectoral;
    }

    public String getTituloDoc() {
        return tituloDoc;
    }
    public String getFecha() {
        return fecha;
    }
    public String getHora() {
        return hora;
    }
    public String getLugar() {
        return lugar;
    }
    public String getObservaciones() {
        return observaciones;
    }
    public String getSelloOficial() {
        return selloOficial;
    }
    public int getIdMesa() {
        return IdMesa;
    }
    public int getTotalVotantesRegistrados() {
        return totalVotantesRegistrados;
    }
    public int getTotalVotantesEfectivos() {
        return totalVotantesEfectivos;
    }
    public int getVotosBlanco() {
        return votosBlanco;
    }
    public int getVotosNulos() {
        return votosNulos;
    }
    public int getNumeroActa() {
        return numeroActa;
    }
    public MesaElectoral getMesaElectoral() {
        return MesaElectoral;
    }
    public int[] getResultadosXcandidato() {
        return resultadosXcandidato;
    }
    public String[] getFirmas() {
        return firmas;
    }

    public void setTituloDoc(String tituloDoc) {
        this.tituloDoc = tituloDoc;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    public void setSelloOficial(String selloOficial) {
        this.selloOficial = selloOficial;
    }
    public void setIdMesa(int IdMesa) {
        this.IdMesa = IdMesa;
    }
    public void setTotalVotantesRegistrados(int totalVotantesRegistrados) {
        this.totalVotantesRegistrados = totalVotantesRegistrados;
    }
    public void setTotalVotantesEfectivos(int totalVotantesEfectivos) {
        this.totalVotantesEfectivos = totalVotantesEfectivos;
    }
    public void setVotosBlanco(int votosBlanco) {
        this.votosBlanco = votosBlanco;
    }
    public void setVotosNulos(int votosNulos) {
        this.votosNulos = votosNulos;
    }
    public void setNumeroActa(int numeroActa) {
        this.numeroActa = numeroActa;
    }
    public void setMesaElectoral(MesaElectoral MesaElectoral) {
        this.MesaElectoral = MesaElectoral;
    }
    public void setResultadosXcandidato(int[] resultadosXcandidato) {
        this.resultadosXcandidato = resultadosXcandidato;
    }
    public void setFirmas(String[] firmas) {
        this.firmas = firmas;
    }
    
    
    
    
    
}
