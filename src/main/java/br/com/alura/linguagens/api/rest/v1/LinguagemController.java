package br.com.alura.linguagens.api.rest.v1;

import br.com.alura.linguagens.api.rest.resource.LinguagemDTO;
import br.com.alura.linguagens.api.services.LinguagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/linguagens")
public class LinguagemController {

    @Autowired
    private LinguagemService service;

    @GetMapping
    public ResponseEntity<List<LinguagemDTO>> obterLinguagens() {
        return new ResponseEntity<>(service.obterLinguagens(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<LinguagemDTO> obterLinguagens(@PathVariable String id) {
        return new ResponseEntity<>(service.getById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<LinguagemDTO> cadastrarLinguagens(@RequestBody LinguagemDTO dto) {
        return new ResponseEntity<>(service.cadastrarLinguagens(dto), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarLinguagem(@PathVariable String id) {
        service.deletarLinguagem(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
