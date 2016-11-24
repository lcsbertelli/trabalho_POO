package testesUnitarios;

import excecoes.MaxUsersException;
import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;
import modelo.Usuario;
import modelo.Video;
import modelo.Ator;
import modelo.Diretor;
import enums.Categoria;

/**
 *
 * @author lucas
 */
public class TesteCalcularEstrelas {
    public static void main(String[] args) {
        Cliente cliente;
        Usuario usuario;
        Video video;
        List<Ator> atores = new ArrayList<Ator>();
        Ator ator1 = new Ator("Lucas Ator");
        Ator ator2 = new Ator("Joao Ator2");
        atores.add(ator1);
        atores.add(ator2);
        
        List<Diretor> direcao = new ArrayList<Diretor>();
        Diretor diretor1 = new Diretor("Diretor 1");
        direcao.add(diretor1);
        
        List<Categoria> categorias = new ArrayList<Categoria>();
        categorias.add(Categoria.AÇÃO);
        categorias.add(Categoria.COMÉDIA);
        
        double contTempoAssistido, contTempoAssistido2; 
        contTempoAssistido = 200.5; // Avaliacao viu até os creditos
        contTempoAssistido2 = 190.3; // Assistiu o filme todo, mas nao os creditos.
        
        cliente = new Cliente("lucas","lucas.bertellimartins@gmail.com");
        video = new Video("Matrix", 18, 200.5, 10.2, atores, direcao, categorias);
        System.out.println("nome do video: " + video.getNome() + " estrelas antes: " + video.getEstrelas());
        try{
            for(int i = 0; i < 4; i++){
                usuario = new Usuario("usu" + i, "senha" + i);
                cliente.addUsuario(usuario);
                
                usuario.startVideo(video);                
                usuario.stopVideo(video, contTempoAssistido);
                usuario.avaliar(video, 2.5, usuario);                
            }    
        } catch (MaxUsersException e){
            System.out.println(e.getMessage());
        }
        
        usuario = new Usuario("usu nao viu credito", "senhax");
        cliente.addUsuario(usuario);                
        usuario.startVideo(video);                
        usuario.stopVideo(video, contTempoAssistido2);
        usuario.avaliar(video, 5.0, usuario);               
        
        video.calcularEstrelas();
        System.out.println("nome do video: " + video.getNome() + " estrelas depois: " + video.getEstrelas());
        System.out.println("Categorias do Filme: " + categorias);
        
        
    }
}
