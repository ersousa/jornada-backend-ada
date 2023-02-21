package org.example.model;

import lombok.Builder;
import org.example.enums.Alimentacao;
import org.example.enums.Classificacao;
import org.example.enums.Locomocao;

public class Aguia extends Animal{
    @Builder
    public Aguia(Classificacao classificacao, Alimentacao alimentacao, Integer peso, Locomocao locomocao) {
        super(classificacao, alimentacao, peso, locomocao);
    }
}
