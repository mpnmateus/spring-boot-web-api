package web_api.repository;

import org.springframework.stereotype.Repository;
import web_api.model.Usuario;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {
    //fake repository - Implementar com SpringBoot Data JPA
    public void save(Usuario usuario){
        if(usuario.getId() == null)
            System.out.println("SAVE - Recebendo o usuário na camada de repositório.");
        else
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório.");
        System.out.println(usuario);
    }
    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id %d para excluir um usuário.", id));
        System.out.println(id);
    }
    public List<Usuario> findByAll(){
        System.out.println("LIST - Listando os usuários do sistema.");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("mateus", "123456"));
        usuarios.add(new Usuario("carla", "123456"));
        return usuarios;
    }
    public Usuario findById(Integer id){
        //Apenas para ilustrar
        System.out.println(String.format("FIND/id - Recebendo o id %d para localizar um usuário", id));
        return new Usuario("mateus", "123456");
    }
    public Usuario findByUsername(String usuario){
        System.out.println(String.format("FIND/username - Recebendo o username %s para localizar um usuário", usuario));
        return new Usuario("mateusp", "123456");
    }
}
