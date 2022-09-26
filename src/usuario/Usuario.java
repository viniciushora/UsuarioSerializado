package usuario;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Usuario implements Serializable{

    String nome;
    private List<Mensagem> mensagensEnviadas = new ArrayList<Mensagem>();
    private List<Mensagem> mensagensRecebidas = new ArrayList<Mensagem>();

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }

    public List<Mensagem> getMensagensEnviadas() {
        return mensagensEnviadas;
    }

    public List<Mensagem> getMensagensRecebidas() {
        return mensagensRecebidas;
    }
    
    
    public void enviarMensagem(Usuario destinatario, String texto, String resposta){
        System.out.println(texto + resposta);
        Mensagem mensagem = new Mensagem();
        mensagem.setTexto(texto);
        mensagem.setRemetente(this);
        mensagem.setDestinatario(destinatario);
        destinatario.receberMensagem(mensagem, resposta);
        mensagensEnviadas.add(mensagem);
    }
    
    public void receberMensagem(Mensagem mensagem, String resp){
        if (resp.equals("")){
            Scanner myObj = new Scanner(System.in);
            System.out.println("Responda a mensagem: ");
            String resposta = myObj.nextLine();
            mensagem.setResposta(resposta);
        } else {
            mensagem.setResposta(resp);
        }
        mensagensRecebidas.add(mensagem);
    }
   

}
