package br.com.alura.linguagens.api.repositories;

import br.com.alura.linguagens.api.entities.Linguagem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinguagemRepository extends MongoRepository<Linguagem, String> {
}
