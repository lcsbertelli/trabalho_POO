package modelo;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import excecoes.AvaliarFilmeNaoVistoException;

/**
 *
 * @author lucas
 */
public class Usuario {
    
    private String login;
    private String senha;
    private List<Video> videosAssistidos;
    private List<Video> videosAssistirFuturo;
    private Map<Video, Double> videosSendoAssistidos;

    
    public Usuario(String login, String senha){
        this.login = login;
        this.senha = senha;
        this.videosAssistidos = new ArrayList<Video>();
        this.videosAssistirFuturo = new ArrayList<Video>();
        this.videosSendoAssistidos = new HashMap<Video, Double>();
    }
    
    // Usuario começar a ver um filme e ele é add na Lista de SendoAssistidos
    public void startVideo(Video video){        
        this.videosSendoAssistidos.put(video, 0.0);
    }
    
    public void stopVideo(Video video, double tempoAssistido){
        //Se ele assistiu o filme todo. Podendo dar stop sem ver os creditos, será considerado como assistido.
        if((tempoAssistido ==  video.getDuracaoTotal()) || (tempoAssistido >= (video.getDuracaoTotal() - video.getDuracaoCreditos()))){
            this.videosAssistidos.add(video);
            this.videosSendoAssistidos.remove(video);
        }else{
            //Se não, atualiza aonde ele parou de assistir    
            Double result = this.videosSendoAssistidos.replace(video, tempoAssistido);            
            if(result == null) //se o filme nao foi startado ele nao existe na lista de videosSendoAssistidos e a funcao replace vai retornar Null.
                throw new IllegalArgumentException("Operação Bloqueada. Você deve dar Start no video:" + video.getNome()+ ", para só então poder dar Stop posteriormente.");               
        }
    }
    
    public void assistirFuturamente(Video video){
        this.videosAssistirFuturo.add(video);
    }
   
    public void avaliar(Video video, double nota, Usuario thisUser){
        
        if(this.videosAssistidos.contains(video)){
            video.novaAvaliacao(thisUser, nota); //Rever como passar a propria instancia de Usuario para que seja add no map de video.
        }else{
            throw new AvaliarFilmeNaoVistoException(video.getNome());
        }
        
    }
    
    // ### Getters and Setters
    
    //somente o Set senha, se ele quiser mudar a senha. O Login não poderá ser alterado por RN.
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }
    
}
