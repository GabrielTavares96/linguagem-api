package br.com.alura.linguagens.api.rest.v1;

import br.com.alura.linguagens.api.entities.Linguagem;
import br.com.alura.linguagens.api.repositories.LinguagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LinguagemController {

    @Autowired
    private LinguagemRepository repository;

    @GetMapping("/linguagens")
    public List<Linguagem> obterLinguagens() {
        return repository.findAll();
    }

    @PostMapping("/linguagens")
    public Linguagem cadastrarLinguagens(@RequestBody Linguagem linguagem) {
        return repository.save(linguagem);
    }

}
