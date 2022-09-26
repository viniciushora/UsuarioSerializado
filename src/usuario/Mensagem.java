package usuario;

import java.io.Serializable;


public class Mensagem implements Serializable{

    String texto;
    String resposta;
    Usuario remetente;
    Usuario destinatario;
    
    public String getTexto() {
        return this.texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    public String getResposta() {
        return this.resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public Usuario getRemetente() {
        return remetente;
    }

    public Usuario getDestinatario() {
        return destinatario;
    }

    public void setRemetente(Usuario remetente) {
        this.remetente = remetente;
    }

    public void setDestinatario(Usuario destinarario) {
        this.destinatario = destinarario;
    }
   

}
