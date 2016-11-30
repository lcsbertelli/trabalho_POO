package testesUnitarios;

import excecoes.MaxUsersException;
import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;
import modelo.Usuario;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas
 */
public class TesteMaxUsersException {
    public static void main(String[] args) {
        Cliente cliente;
        Usuario usuario;
        List<Usuario> usuarios;
        usuarios = new ArrayList<Usuario>();
        
        cliente = new Cliente("lucas","lucas.bertellimartins@gmail.com");
        
        System.out.println(cliente.getNome());
        
        try{
            for(int i = 0; i < 6; i++){
                usuario = new Usuario("usu" + i, "senha" + i, 31);
                cliente.addUsuario(usuario);
            }    
        } catch (MaxUsersException e){
            System.out.println(e.getMessage());
        }
        
        System.out.println("Como a excessao foi tratada, a execucao continua...");
        
        usuarios = cliente.getUsuarios();
        System.out.println("Usuarios existentes para o Cliente:");
        for(Usuario usuario_aux : usuarios){
            System.out.println(usuario_aux.getLogin());
        }
        
    }
}
