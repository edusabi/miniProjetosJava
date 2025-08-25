package main.domain;

public class Estagiario extends Funcionario{
    public Estagiario(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    @Override
    public double calcularSalario() {
        System.out.println("Calcular salario FuncionarioCLT");
        return getSalario() + 100;
    }
}
