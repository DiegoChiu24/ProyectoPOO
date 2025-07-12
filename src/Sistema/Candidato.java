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
    private Partido partidoPo;
    private int numeroDNI;

    public Candidato(Partido partidoPo, int numeroDNI, String nombres, String apellidos) {
        super(nombres, apellidos);
        this.partidoPo = partidoPo;
        this.numeroDNI = numeroDNI;
    }

    public Partido getPartidoPo() {
        return partidoPo;
    }
    
    public void setPartido(Partido partidopo){
        this.partidoPo = partidopo;
    }
    
    public int getNumeroDNI() {
        return numeroDNI;
    }


    public void setNumeroDNI(int numeroDNI) {
        this.numeroDNI = numeroDNI;
    }
    
    @Override
    public String toString() {
        return nombres;
    }
    
    
}
