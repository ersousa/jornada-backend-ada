package org.example.model;

import lombok.Builder;
import org.example.enums.Alimentacao;
import org.example.enums.Classificacao;
import org.example.enums.Locomocao;

public class Leao extends Animal{
    @Builder
    public Leao(Classificacao classificacao, Alimentacao alimentacao, Integer peso, Locomocao locomocao) {
        super(classificacao, alimentacao, peso, locomocao);
    }
}
