package web_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import web_api.model.Usuario;
import web_api.repository.UsuarioRepository;

import java.util.List;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;
    @GetMapping
    public List<Usuario> getUsers(){
        return repository.findByAll();
    }
}
