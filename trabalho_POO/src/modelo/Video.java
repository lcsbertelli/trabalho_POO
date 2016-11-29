/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 * Esta classe está no lugar de InfoCatalogo (antigo Video) na ligacao entre usuário e filmes/episódios
 * 
 */
public abstract class Video {
    private String sinopse;
    private double duracaoTotal;
    private double duracaoCreditos;
    private InfoCatalogo descricao;
    
    public Video(String sinopse, double duracaoTotal, double duracaoCreditos) {
        this.sinopse = sinopse;
        this.duracaoTotal = duracaoTotal;
        this.duracaoCreditos = duracaoCreditos;
    }
    
    // delegando o registro de nota para o objeto descricao (InfoCatalogo)
    public void registrarAvaliacao(Usuario usuario, double nota) {
        descricao.novaAvaliacao(usuario, nota);
    }
    
    // setters
    
    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }
    
    public void setDuracaoTotal(double duracaoTotal) {
        this.duracaoTotal = duracaoTotal;
    }
    
    public void setDuracaoCreditos(double duracaoCreditos) {
        this.duracaoCreditos = duracaoCreditos;
    }
    
    public void setDescricao(InfoCatalogo descricao) {
        this.descricao = descricao;
    }
    
    // getters
    
    public String getSinopse() {
        return sinopse;
    }
    
    public double getDuracaoTotal() {
        return duracaoTotal;
    }
    
    
    public double getDuracaoCreditos() {
        return duracaoCreditos;
    }
    
    public InfoCatalogo getDescricao() {
        return descricao;
    }
    
}
