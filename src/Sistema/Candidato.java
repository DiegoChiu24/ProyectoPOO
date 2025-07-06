/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;

/**
 *
 * @author aaap2
 */
public class Candidato extends Persona{
    private String partidoPo;
    private int numeroDNI;

    public Candidato(String partidoPo, int numeroDNI, String nombres, String apellidos) {
        super(nombres, apellidos);
        this.partidoPo = partidoPo;
        this.numeroDNI = numeroDNI;
    }

    public String getPartidoPo() {
        return partidoPo;
    }
    public int getNumeroDNI() {
        return numeroDNI;
    }

    public void setPartidoPo(String partidoPo) {
        this.partidoPo = partidoPo;
    }
    public void setNumeroDNI(int numeroDNI) {
        this.numeroDNI = numeroDNI;
    }
    
    
    
}
