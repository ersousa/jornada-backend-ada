package org.example.model;

import lombok.Builder;
import lombok.Getter;
import org.example.enums.Alimentacao;
import org.example.enums.Classificacao;
import org.example.enums.Locomocao;

@Getter
public class Lobo extends Animal {
    @Builder
    public Lobo(Classificacao classificacao, Alimentacao alimentacao, Integer peso, Locomocao locomocao) {
        super(classificacao, alimentacao, peso, locomocao);
    }

}
