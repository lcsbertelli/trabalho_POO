/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excecoes;

/**
 *
 * @author lucas
 */
public class MaxUsersException extends RuntimeException{
    
    public MaxUsersException(int valor){
        super("Operação Bloqueada. Você tentou exceder o limite de Usuarios por Cliente, o limite é: " + valor);
    }
}
