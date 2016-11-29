/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * 
 */
public class Serie {
    
    private List<Temporada> temporadas;
    private InfoCatalogo descricao;
    
    public Serie(InfoCatalogo descricao) {
        this.temporadas = new ArrayList<Temporada>();
        this.descricao = descricao;
        
    }
    
    public void addTemporada(Temporada temporada) {
        this.temporadas.add(temporada);
    }
    
    // setters
    
    
    public void setDescricao(InfoCatalogo descricao) {
        this.descricao = descricao;
    }
    
    // getters
    
    public InfoCatalogo getDescricao() {
        return descricao;
    }
       
}
