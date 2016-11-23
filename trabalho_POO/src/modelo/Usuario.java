/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author lucas
 */
public class Usuario {
    
    private String login;
    private String senha;
    
    public Usuario(String login, String senha){
        this.login = login;
        this.senha = senha;
    }

    // ### Getters and Setters
    
    //somente o Set senha, se ele quiser mudar a senha. O Login não poderá ser alterado por RN.
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }
    
}
