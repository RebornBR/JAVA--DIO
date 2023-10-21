package dio.web.api.controller;

import dio.web.api.model.Usuario;
import dio.web.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // restcontroller é responsavel pelo direcionamento das nossas funcionalidades
@RequestMapping("/users") // @RequestMapping("prefix"): Determina qual a URI comum para todos os recursos disponibilizados pelo Controller.
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;
    @GetMapping
    public List<Usuario> list(){
        return repository.findAll(); // método da nossa classe UsuarioRepository
    }
    @PostMapping //@PostMapping: Determina que o método aceitará requisições HTTP do tipo POST.
    public void save(@RequestBody Usuario user){ // @RequestBody: Converte um JSON para o tipo do objeto esperado como parâmetro no método.
        repository.save(user); // método da nossa classe UsuarioRepository
    }
    @PutMapping //@PutMapping: Determina que o método aceitará requisições HTTP do tipo PUT.
    public void update(@RequestBody Usuario user){ //@RequestBody: Converte um JSON para o tipo do objeto esperado como parâmetro no método.
        repository.save(user); // método da nossa classe UsuarioRepository
    }
    @GetMapping("/{username}") // nome do nosso direcionamento(URI), não podemos utilizar com mesmo nome
    // entre {} é o parametro que será utilizado no URI
    public Usuario find(@PathVariable("/username") String username){ // @PathVariable: Consegue determinar que parte da URI será composta por parâmetros recebidos nas requisições.
        return repository.findByUsername(username); // método da nossa classe UsuarioRepository
    }
    @DeleteMapping("usuarios/{id}") //@DeleteMapping: Determina que o método aceitará requisições HTTP do tipo DELETE.
    public void delete(@PathVariable("/id") Integer id){//@PathVariable: Consegue determinar que parte da URI será composta por parâmetros recebidos nas requisições.
        repository.deleteById(id); // método da nossa classe UsuarioRepository
    }
}
