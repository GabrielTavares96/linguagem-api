package br.com.alura.linguagens.api.services;

import br.com.alura.linguagens.api.entities.Linguagem;
import br.com.alura.linguagens.api.mapper.LinguagemMapper;
import br.com.alura.linguagens.api.repositories.LinguagemRepository;
import br.com.alura.linguagens.api.rest.resource.LinguagemDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LinguagemService {

    @Autowired
    private LinguagemRepository repository;


    public List<LinguagemDTO> obterLinguagens() {


        List<Linguagem> linguagemList = repository.findAll();
        List<LinguagemDTO> linguagemDTOS = new ArrayList<>();

        for (Linguagem test : linguagemList) {
            LinguagemDTO dto = LinguagemMapper.INSTANCE.linguagemToLinguagemDTO(test);
            linguagemDTOS.add(dto);

        }
        return linguagemDTOS;
    }

    public LinguagemDTO getById(String id) {
        Linguagem linguagem = repository.findById(id).get();

        return LinguagemMapper.INSTANCE.linguagemToLinguagemDTO(linguagem);
    }

    public LinguagemDTO cadastrarLinguagens(LinguagemDTO dto) {

        Linguagem linguagem = Linguagem.builder()
                .image(dto.getImage())
                .title(dto.getTitle())
                .ranking(dto.getRanking()).build();

        linguagem = repository.save(linguagem);

        return LinguagemMapper.INSTANCE.linguagemToLinguagemDTO(linguagem);
    }

    public void deletarLinguagem(String id) {
        repository.deleteById(id);
    }

}
