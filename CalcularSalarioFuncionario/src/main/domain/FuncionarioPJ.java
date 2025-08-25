package main.domain;

public class FuncionarioPJ extends Funcionario{
    public FuncionarioPJ(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    @Override
    public double calcularSalario() {
        System.out.println("Calcular salario FuncionarioCLT");
        return getSalario() + 300;
    }
}
