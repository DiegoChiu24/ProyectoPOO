 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;

import java.util.ArrayList;

/**
 *
 * @author aaap2
 */
public class MesaElectoral {
    private String Identificador, Ubicacion;
    private ArrayList<MiembroMesa> miembros = new ArrayList<>();

    public MesaElectoral(String Identificador, String Ubicacion) {
        this.Identificador = Identificador;
        this.Ubicacion = Ubicacion;
    }
    
    public void agregarMiembrosMesa(MiembroMesa miembro){
        miembros.add(miembro);
    }

    public String getIdentificador() {
        return Identificador;
    }
    public String getUbicacion() {
        return Ubicacion;
    }

    public void setIdentificador(String Identificador) {
        this.Identificador = Identificador;
    }
    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }
    
    

}
