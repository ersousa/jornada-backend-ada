package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.example.enums.Alimentacao;
import org.example.enums.Classificacao;
import org.example.enums.Locomocao;

@Data
@AllArgsConstructor
public class Animal {
    private Classificacao classificacao;
    private Alimentacao alimentacao;
    private Integer peso;
    private Locomocao locomocao;

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
