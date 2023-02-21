package org.example;

import org.example.enums.Alimentacao;
import org.example.enums.Classificacao;
import org.example.enums.Locomocao;
import org.example.model.*;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Animal> animais = createAnimalsList();

        List<Animal> animaisCarnivoros = animais.stream()
                .filter(animal -> Alimentacao.CARNIVORO.equals(animal.getAlimentacao()))
                .collect(Collectors.toList());

        List<Animal> animaisHerbivoros = animais.stream()
                .filter(animal -> Alimentacao.HERBIVORO.equals(animal.getAlimentacao()))
                .collect(Collectors.toList());

        List<Animal> carnivorosVoadores = animais.stream()
                .filter(animal -> Alimentacao.CARNIVORO.equals(animal.getAlimentacao()))
                .filter(animal -> Locomocao.VOA.equals(animal.getLocomocao()))
                .collect(Collectors.toList());

        System.out.println("Animais carnívoros: " + animaisCarnivoros);
        System.out.println("Animais herbíveros: " + animaisHerbivoros);
        System.out.println("Animais carnívoros que voam: " + carnivorosVoadores);


    }

    private static List<Animal> createAnimalsList() {

        Lobo lobo = Lobo.builder()
                .classificacao(Classificacao.MAMIFERO)
                .alimentacao(Alimentacao.CARNIVORO)
                .peso(30)
                .locomocao(Locomocao.ANDA)
                .build();

        Elefante elefante = Elefante.builder()
                .classificacao(Classificacao.MAMIFERO)
                .alimentacao(Alimentacao.HERBIVORO)
                .peso(2000)
                .locomocao(Locomocao.ANDA)
                .build();

        Aguia aguia = Aguia.builder()
                .classificacao(Classificacao.AVE)
                .alimentacao(Alimentacao.CARNIVORO)
                .peso(5)
                .locomocao(Locomocao.VOA)
                .build();

        Leao leao = Leao.builder()
                .classificacao(Classificacao.MAMIFERO)
                .alimentacao(Alimentacao.CARNIVORO)
                .peso(160)
                .locomocao(Locomocao.ANDA)
                .build();

        return List.of(lobo, elefante, aguia, leao);
    }
}