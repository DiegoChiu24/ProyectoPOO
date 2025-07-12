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
    
public class Main {

    private static Main instancia;

    // creamos los arrays dinamicos
    public ArrayList<Eleccion> elecciones = new ArrayList<>();
    public ArrayList<Candidato> candidatos = new ArrayList<>();
    public ArrayList<MesaElectoral> mesasElectorales = new ArrayList<>();
    public ArrayList<MiembroMesa> miembrosMesa = new ArrayList<>();
    public ArrayList<Partido> partidosPo = new ArrayList<>();
    
    public ArrayList<Operador> operadores = new ArrayList<>();
    
    // para ingresar
    public boolean validarOperador(String usuario, String password) {
        for (Operador op : operadores) {
            if (op.getUser().equals(usuario) && op.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }        
    public ArrayList<Operador> getOperadores() {
        return operadores;
    }
    
    // para llevar el sistema a los frames
    public static Main getInstancia() {
        if (instancia == null) {
            instancia = new Main();
        }
        return instancia;
    }
    
    // gestion de partido
    public void agregarPartido(String nombre, String sigla, String logo, String representante){
        partidosPo.add(new Partido(nombre, sigla, logo, representante));

    }
    public boolean DeletePartido(int num) {
        if (num >= 1 && num <= partidosPo.size()) {
            partidosPo.remove(num - 1);
            return true;
        } else {
            return false;
        }
    }
    
    
    
    // gestion de candidatos
    public void agregarCandidato(String nombre, String apellido, int numDni, Partido partidopo){
        candidatos.add(new Candidato(partidopo, numDni, nombre, apellido));

    }
      public boolean DeleteCandidato(int num) {
        if (num >= 1 && num <= candidatos.size()) {
            candidatos.remove(num - 1);
            return true;
        } else {
            return false;
        }
    } 
    
    
    // gestion de elecciones    
    public void agregarElecciones(String fecha, String tipoEleccion, Candidato cand1, Candidato cand2){
        elecciones.add(new Eleccion(fecha, tipoEleccion, cand1, cand2));

    }
      
    public boolean DeleteEleccion(int numEleccion) {
        if (numEleccion >= 1 && numEleccion <= elecciones.size()) {
            elecciones.remove(numEleccion - 1);
            return true;
        } else {
            return false;
        }
    }   
      
    // gestion de mesas electorales :(
    
    
    public boolean DeleteMesaElectoral(int num) {
        if (num >= 1 && num <= mesasElectorales.size()) {
            mesasElectorales.remove(num - 1);
            return true;
        } else {
            return false;
        }
    }   
    
    public void agregarMesasElectorales(String id, String ubicacion){
        mesasElectorales.add(new MesaElectoral(id, ubicacion));

    }
    
    
    // gestion de miembros de mesa
    public boolean DeleteMiembroMesa(int num) {
        if (num >= 1 && num <= miembrosMesa.size()) {
            miembrosMesa.remove(num - 1);
            return true;
        } else {
            return false;
        }
    }    
    
    public void agregarMiembrosMesa(String nombre, String apellido, String tipoMiembro){
        miembrosMesa.add(new MiembroMesa(nombre, apellido, tipoMiembro));
    }
}


  


