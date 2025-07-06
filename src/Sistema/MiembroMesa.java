/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;

/**
 *
 * @author aaap2
 */
public class MiembroMesa extends Persona{
    
    private String tipoMiembro;

    public MiembroMesa(String tipoMiembro, String nombres, String apellidos) {
        super(nombres, apellidos);
        this.tipoMiembro = tipoMiembro;
    }

    public String getTipoMiembro() {
        return tipoMiembro;
    }
    public void setTipoMiembro(String tipoMiembro) {
        this.tipoMiembro = tipoMiembro;
    }
    
    
}
