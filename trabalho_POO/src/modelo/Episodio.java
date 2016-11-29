/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * 
 */
public class Episodio extends Video {
    
    private Temporada temporada;
    
    public Episodio(String sinopse, double duracaoTotal, double duracaoCreditos,Temporada temporada) {
        super(sinopse, duracaoTotal, duracaoCreditos);
        this.temporada = temporada;
    }
    
    // setter
    public void setTemporada(Temporada temporada) {
        this.temporada = temporada;
    }
    
    // getter
    public Temporada getTemporada() {
        return temporada;
    }
}
