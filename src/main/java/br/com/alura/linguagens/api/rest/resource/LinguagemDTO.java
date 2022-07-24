package br.com.alura.linguagens.api.rest.resource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LinguagemDTO {

    private String id;
    private String title;
    private String image;
    private int ranking;
}
