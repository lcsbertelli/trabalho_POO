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
public class Temporada {
    
    private List<Episodio> episodios;
    private int numeroTemporada;
    private Serie serie;
    
    public Temporada(int numeroTemporada, Serie serie) {
        this.episodios = new ArrayList<Episodio>();
        this.numeroTemporada = numeroTemporada;
        this.serie = serie;
    }
    
    public void addEpisodio(Episodio episodio) {
        this.episodios.add(episodio);
    }
    
    // setters
    
    public void setNumeroTemporada(int numeroTemporada) {
        this.numeroTemporada = numeroTemporada;
    }
    
    public void setSerie(Serie serie) {
        this.serie = serie;
    }
    
    // getters
    
    public int getNumeroTemporada() {
        return numeroTemporada;
    }
    
    public Serie getSerie() {
        return serie;
    }
    
}
