/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;

/**
 *
 * @author aaap2
 */
public class MesaElectoral {
    private int totalMiembros;
    private MiembroMesa[] miembros = new MiembroMesa[30];

    public MesaElectoral(int totalMiembros) {
        this.totalMiembros = totalMiembros;
    }

    public void setTotalMiembros(int totalMiembros) {
        this.totalMiembros = totalMiembros;
    }
    public void setMiembros(MiembroMesa[] miembros) {
        this.miembros = miembros;
    }

    public int getTotalMiembros() {
        return totalMiembros;
    }
    public MiembroMesa[] getMiembros() {
        return miembros;
    }
    
    

}
