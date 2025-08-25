package main.domain;

public class Macaco extends Animal{
    public Macaco(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Som: Uh Uh Uh Ah Ah Ah Ah");
    }

    @Override
    public void alimentar() {
        System.out.println(nome + " está comendo banana");
    }
}
