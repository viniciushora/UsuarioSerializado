package usuario;

import java.io.*;

public class SaveUsuarioSerializado {
    
    public static void main(String[] args) throws IOException {
        
        String current = new java.io.File( "." ).getCanonicalPath(); 

        Usuario usuario = new Usuario();        
        usuario.setNome("João");
        Usuario usuario2 = new Usuario();
        usuario2.setNome("Pedro");
        Usuario usuario3 = new Usuario();
        usuario3.setNome("Matheus");
        usuario.enviarMensagem(usuario2, "Fala meu bom", "");
        usuario2.enviarMensagem(usuario3, "Salve cumpade", "");
        usuario3.enviarMensagem(usuario, "Bão?", "Bão demais");
               
        FileOutputStream fileSerializado = new FileOutputStream( 
                current + "\\src\\usuario_serializado.ser");                
        ObjectOutputStream outputSerializado = new ObjectOutputStream(fileSerializado);        
        outputSerializado.writeObject(usuario);
        outputSerializado.writeObject(usuario2);
        outputSerializado.writeObject(usuario3);
        outputSerializado.close();
        
        System.out.println("Usuario Salvo");        
        System.out.println("Arquivo gerado em: " + current + 
                "\\src\\usuario_serializado.ser");
        
        
    }
}

   
