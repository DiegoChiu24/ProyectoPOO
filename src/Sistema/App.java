/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;

/**
 *
 * @author aaap2
 */
import Inicio.Login;


public class App {
    public static void main(String[] args) {
        // traemos la clase main donde manejamos las listas de clase y todo
        Main sistema = Main.getInstancia();
        
        
        //agregamos los operadores que pueden acceder al sistema
        sistema.getOperadores().add(new Operador("", ""));
        sistema.getOperadores().add(new Operador("alejandro", "12345"));
        sistema.getOperadores().add(new Operador("diego", "12345"));
        
        // abrimos la ventana login que despues levanta las demas ventanas
        Login login = new Login(); 
        login.setVisible(true);
    }
}
