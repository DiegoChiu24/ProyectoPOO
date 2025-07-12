/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;

/**
 *
 * @author aaap2
 */
public class Operador {
    
    private String user, password;

    public Operador(String user, String password) {
        this.user = user;
        this.password = password;
    }
    
    public boolean verificarPassword (String user, String password) {
        return (this.user.equals(user) && this.password.equals(password));                  
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
