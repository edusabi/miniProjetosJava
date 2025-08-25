package main.test;

import main.domain.Caminhao;
import main.domain.Carro;
import main.domain.Moto;
import main.domain.Veiculo;

public class TestandoSistema {
    public static void main(String[] args) {
        Veiculo carro = new Carro("15PMS18A", "Fiat", "Uno", 4);
        carro.exibirInfo();

        System.out.println("---------------");

        Veiculo moto = new Moto("BRA2E19", "Honda", "CB 300F Twister", 300);
        moto.exibirInfo();

        System.out.println("---------------");

        Veiculo caminhao = new Caminhao("PAZ2R24", "Volvo", "FH 540", 74.0);
        caminhao.exibirInfo();
    }
}
