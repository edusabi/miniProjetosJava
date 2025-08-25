package main.domain;

public class Arara extends Animal{
    public Arara(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void alimentar() {
        System.out.println(nome + " está comendo uva");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som: Falando");
    }
}
