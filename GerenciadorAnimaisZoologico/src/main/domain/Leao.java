package main.domain;

public class Leao extends Animal{
    public Leao(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Som: Rugindo");
    }

    @Override
    public void alimentar() {
        System.out.println(nome + " está comendo carne");
    }

}
