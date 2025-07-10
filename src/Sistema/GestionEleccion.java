/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;

/**
 *
 * @author wachi
 */
public class GestionEleccion {

    private Eleccion[] listadoElecciones;
    private int totalElecciones;

    public GestionEleccion(int capacidadMaxima) {
        this.listadoElecciones = new Eleccion[capacidadMaxima];
        this.totalElecciones = 0;
    }

    // Registrar nueva elección
    public boolean registrarEleccion(Eleccion nuevaEleccion) {
        if (totalElecciones < listadoElecciones.length) {
            listadoElecciones[totalElecciones] = nuevaEleccion;
            totalElecciones++;
            return true;
        }
        return false;
    }

    // Actualizar elección en un índice específico
    public boolean actualizarEleccion(int posicion, Eleccion eleccionActualizada) {
        if (posicion >= 0 && posicion < totalElecciones) {
            listadoElecciones[posicion] = eleccionActualizada;
            return true;
        }
        return false;
    }

    // Eliminar elección en un índice específico
    public boolean eliminarEleccion(int posicion) {
        if (posicion >= 0 && posicion < totalElecciones) {
            for (int i = posicion; i < totalElecciones - 1; i++) {
                listadoElecciones[i] = listadoElecciones[i + 1];
            }
            listadoElecciones[totalElecciones - 1] = null;
            totalElecciones--;
            return true;
        }
        return false;
    }

    // Obtener copia de elecciones registradas
    public Eleccion[] obtenerEleccionesRegistradas() {
        Eleccion[] copia = new Eleccion[totalElecciones];
        for (int i = 0; i < totalElecciones; i++) {
            copia[i] = listadoElecciones[i];
        }
        return copia;
    }

    // Obtener cantidad total de elecciones registradas
    public int obtenerTotalElecciones() {
        return totalElecciones;
    }
}
