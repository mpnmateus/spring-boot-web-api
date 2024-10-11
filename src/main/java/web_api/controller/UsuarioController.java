package web_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import web_api.model.Usuario;
import web_api.repository.UsuarioRepository;

import java.util.List;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;
    @GetMapping("/users")
    public List<Usuario> getUsers(){
        return repository.findByAll();
    }
    @GetMapping("/users/{username}")
    public Usuario getOne(@PathVariable("username") String username){
        return repository.findByUsername(username);
    }
}
