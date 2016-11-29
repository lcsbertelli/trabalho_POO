package modelo;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import enums.Categoria;

/**
 *
 * @author lucas
 */

/**
 * 
 * Alteração:
 * Esta é a antiga classe Video
 * Episodio e Filme não a estendem mais.
 * O que acontece agora é um relacionamento de agregação / delegação com Filme e Serie.
 * Filme TEM-UMa Informação de Catálogo.
 * Penso em agregar esta classe com episódio também, sendo que cada episódio relacionado
 * à Serie referenciará a mesma informação da série. Isso facilitará a chamada de
 * novaAvaliacao() na classe usuário
 * video.descricao.novaAtualizacao() -- servindo tanto para episodio quanto para filme
 * 
 */

public class InfoCatalogo
{
    private String nome;
    private double estrelas;
    private int classificEtaria;
    /*private double duracaoTotal;
    private double duracaoCreditos;*/
    private List<Ator> atoresPrincipais;
    private List<Diretor> direcao;
    private Map<Usuario, Double> avaliacoes;
    private List<Categoria> categorias;

    public InfoCatalogo(String nome, int classificEtaria, /*double duracaoTotal, double duracaoCreditos,*/ List<Ator> atoresPrincipais, List<Diretor> direcao, List<Categoria> categorias) {
        this.nome = nome;
        this.classificEtaria = classificEtaria;
        /*this.duracaoTotal = duracaoTotal;
        this.duracaoCreditos = duracaoCreditos;*/
        this.atoresPrincipais = atoresPrincipais;
        this.direcao = direcao;
        this.categorias = categorias;
        this.avaliacoes = new HashMap<Usuario, Double>();
    }
    
    // calcula ou recalcula a nova média aritmética das notas de avaliacao do video
    public void calcularEstrelas(){
        double soma = 0;
        for(Usuario usuario : avaliacoes.keySet()){
            soma += avaliacoes.get(usuario);
        }
        this.estrelas = (soma/avaliacoes.size());
    }
    
    // Esse metodo verifica se é uma Nova Avaliacao ou uma Reavaliacao e recalcula as estrelas do video.  
    public void novaAvaliacao(Usuario usuario, double nota){
        
        if(avaliacoes.containsKey(usuario)){ // Reavaliacao da Nota 
            this.avaliacoes.replace(usuario, nota);
            calcularEstrelas();
        }else{ //Nova Avaliacao   
            this.avaliacoes.put(usuario, nota);
            calcularEstrelas();
        }        
    } 
    
    public void addAtor(Ator ator){
        this.atoresPrincipais.add(ator);
    }
    public void removerAtor(Ator ator){
        this.atoresPrincipais.remove(ator);
    }
    
    public void addDiretor(Diretor diretor){
        this.direcao.add(diretor);
    }
    public void removerDiretor(Diretor diretor){
        this.direcao.remove(diretor);
    }
    
    public void addCategoria(Categoria categoria){
        this.categorias.add(categoria);
    }
    
    public void removerCategoria(Categoria categoria){
        this.categorias.remove(categoria);
    }
    
    
    
    // ### Getters and Setters
    
    
    public Map<Usuario, Double> getAvaliacoes() {
        return avaliacoes;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }     
    

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setClassificEtaria(int classificEtaria) {
        this.classificEtaria = classificEtaria;
    }
    
   /* public void setDuracaoTotal(double duracaoTotal) {
        this.duracaoTotal = duracaoTotal;
    }

    public void setDuracaoCreditos(double duracaoCreditos) {
        this.duracaoCreditos = duracaoCreditos;
    }*/
    
    public String getNome() {
        return nome;
    }
    
    public double getEstrelas() {
        return estrelas;
    }

    public int getClassificEtaria() {
        return classificEtaria;
    }
    
    /*public double getDuracaoTotal() {
        return duracaoTotal;
    }

    public double getDuracaoCreditos() {
        return duracaoCreditos;
    }*/

    public List<Ator> getAtoresPrincipais() {
        return atoresPrincipais;
    }

    public List<Diretor> getDirecao() {
        return direcao;
    }
    
    
}
