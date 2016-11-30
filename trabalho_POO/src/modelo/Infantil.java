/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import excecoes.MaxUsersException;
import excecoes.MenorDeIdadeException;

/**
 *
 * @author mateus
 */
public class Infantil extends Usuario{
    public Infantil (String login, String senha, int idade){
        super(login,senha,idade);
    }
    
    @Override
    public void startVideo(Video video){  
        if(this.idade>=18){
            this.videosSendoAssistidos.put(video, 0.0);
        }
        else{
            throw new MenorDeIdadeException();
        }
    }
}
