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
public class AvaliarFilmeNaoVistoException extends RuntimeException {
    
    public AvaliarFilmeNaoVistoException(String nomeFilme){
        super("Operação Bloqueada. Não é possível avaliar o filme: " + nomeFilme + " pois o usuário ainda não o assistiu.");
    }
    
}
