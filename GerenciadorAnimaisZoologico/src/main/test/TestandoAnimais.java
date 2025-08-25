package main.test;

import main.domain.*;

public class TestandoAnimais {
    public static void main(String[] args) {
        Leao leao = new Leao("Ochoa", 20);
        Macaco macaco = new Macaco("Donk", 12);
        Arara arara = new Arara("Duby", 55);
        Onca onca = new Onca("Steve", 5);

        Animal[] animais = {leao, macaco, arara, onca};

        for(Animal animal: animais){
            animal.exibirDados();
            animal.emitirSom();
            animal.alimentar();
            System.out.println("---------");
        }

    }
}
