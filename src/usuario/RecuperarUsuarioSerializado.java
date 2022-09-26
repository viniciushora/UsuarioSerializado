package usuario;

import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class RecuperarUsuarioSerializado {

    public static void main(String[] args) throws Exception {
        {
            List<Usuario> users = new ArrayList<Usuario>();
            Usuario user = null;
            
            String current = new java.io.File(".").getCanonicalPath();
            FileInputStream fileIn = new FileInputStream(current + 
                    "\\src\\usuario_serializado.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            
            boolean isExist = true;

            while(isExist){
                if(fileIn.available() != 0){
                 user = (Usuario) in.readObject();    
                 users.add(user);
                }
                else{
                isExist =false;
                }
            }
            in.close();

            for (int i=0; i < users.size(); i++){
                System.out.println("Deserializando Usuario...");
                System.out.println("Nome: " + users.get(i).getNome());
                System.out.println("Mensagens enviadas");
                for (int j=0; j < users.get(i).getMensagensEnviadas().size(); j++){
                    Mensagem mensagem = users.get(i).getMensagensEnviadas().get(j);
                    String texto = mensagem.getTexto();
                    String resposta = mensagem.getResposta();
                    System.out.println("Mensagem: " + texto + " Resposta: " + resposta);
                }
                System.out.println("Mensagens recebidas");
                for (int k=0; k < users.get(i).getMensagensRecebidas().size(); k++){
                    Mensagem mensagem = users.get(i).getMensagensRecebidas().get(k);
                    String texto = mensagem.getTexto();
                    String resposta = mensagem.getResposta();
                    System.out.println("Mensagem: " + texto + " Resposta: " + resposta);
                }
            }
        }
    }
}
