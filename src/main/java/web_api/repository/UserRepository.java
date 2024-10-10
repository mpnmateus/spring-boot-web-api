package web_api.repository;

import org.springframework.stereotype.Repository;
import web_api.model.Usuario;

@Repository
public class UserRepository {
    //fake repository
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
}
