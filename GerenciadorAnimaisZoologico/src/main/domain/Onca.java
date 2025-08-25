package main.domain;

public class Onca extends Animal{
    public Onca(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Som: esturrando");
    }

    @Override
    public void alimentar() {
        System.out.println(nome + " está comendo carne");
    }
}
