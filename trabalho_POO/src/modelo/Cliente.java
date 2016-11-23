package modelo;

import java.util.ArrayList;
import java.util.List;

import excecoes.MaxUsersException;

/**
 *
 * @author lucas
 */
public class Cliente {
    
    private String nome;
    private String email;
    private List<Usuario> usuarios;
    private static final int MAX_USERS = 5;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.usuarios = new ArrayList<Usuario>();
    }

    public void addUsuario(Usuario usuario) {
        if(this.usuarios.size() < MAX_USERS)
            this.usuarios.add(usuario);
        else
            throw new MaxUsersException(MAX_USERS);
    }
    
    // ### Getters and Setters
    
    public List<Usuario> getUsuarios() {
        return usuarios;
    }    
    
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
     public void setEmail(String email) {
        this.email = email;
    }
    
}
