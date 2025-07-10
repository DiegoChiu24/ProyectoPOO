/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;

/**
 *
 * @author wachi
 */
public class GestionMesas {

    private MesaElectoral[] listaMesas;
    private int totalMesas;

    public GestionMesas(int capacidadMaxima) {
        this.listaMesas = new MesaElectoral[capacidadMaxima];
        this.totalMesas = 0;
    }

    // Registrar una nueva mesa electoral
    public boolean registrarMesa(MesaElectoral nuevaMesa) {
        if (totalMesas < listaMesas.length) {
            listaMesas[totalMesas] = nuevaMesa;
            totalMesas++;
            return true;
        }
        return false;
    }

    // Eliminar una mesa electoral según índice
    public boolean eliminarMesa(int posicion) {
        if (posicion >= 0 && posicion < totalMesas) {
            for (int i = posicion; i < totalMesas - 1; i++) {
                listaMesas[i] = listaMesas[i + 1];
            }
            listaMesas[totalMesas - 1] = null;
            totalMesas--;
            return true;
        }
        return false;
    }

    // Modificar los datos de una mesa electoral
    public boolean actualizarMesa(int posicion, String nuevaUbicacion, int nuevaCantidadMiembros) {
        if (posicion >= 0 && posicion < totalMesas) {
            listaMesas[posicion].setUbicacion(nuevaUbicacion);
            listaMesas[posicion].setCantidadMiembros(nuevaCantidadMiembros);
            return true;
        }
        return false;
    }

    // Obtener copia de todas las mesas registradas
    public MesaElectoral[] obtenerMesasRegistradas() {
        MesaElectoral[] copia = new MesaElectoral[totalMesas];
        for (int i = 0; i < totalMesas; i++) {
            copia[i] = listaMesas[i];
        }
        return copia;
    }

    // Obtener cantidad total de mesas registradas
    public int obtenerTotalMesas() {
        return totalMesas;
    }

    // Obtener una mesa específica
    public MesaElectoral obtenerMesa(int posicion) {
        if (posicion >= 0 && posicion < totalMesas) {
            return listaMesas[posicion];
        }
        return null;
    }
}
