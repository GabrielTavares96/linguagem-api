package br.com.alura.linguagens.api.mapper;

import br.com.alura.linguagens.api.entities.Linguagem;
import br.com.alura.linguagens.api.rest.resource.LinguagemDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface LinguagemMapper {

    LinguagemMapper INSTANCE = Mappers.getMapper(LinguagemMapper.class);

    LinguagemDTO linguagemToLinguagemDTO(Linguagem linguagem);


}
