package modelo;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import enums.Categoria;

/**
 *
 * @author Notebook
 */
public class Filme extends Video {
    
    private InfoCatalogo descricao;
    
    public Filme(String sinopse, double duracaoTotal, double duracaoCreditos, InfoCatalogo descricao) {
        super(sinopse, duracaoTotal, duracaoCreditos);
        this.descricao = descricao;
    }
    
    // setters

    public void setInfoCatalogo(InfoCatalogo descricao) {
        this.descricao = descricao;
    }
    
    // getters
    
    public InfoCatalogo getInfoCatalogo() {
        return descricao;
    }
}
