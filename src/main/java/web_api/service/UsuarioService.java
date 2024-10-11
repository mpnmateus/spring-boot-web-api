package web_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web_api.model.Usuario;
import web_api.repository.UsuarioRepository;

import java.util.List;

@Service
public class UsuarioService {
    //responsável pela lógica de negócio e comunicação com a camada de repositório.
    //implementar futuramente, modificando as outras camadas

    @Autowired
    public UsuarioRepository repository;

    //Transformar UsuarioRepository em uma interface com contrato de método. Implementar aqui.
//    public List<Usuario> findAll(){
//        return UsuarioRepository.findByAll();
//    }
}
