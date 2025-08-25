package main.domain;

public class FuncionarioCLT extends Funcionario{
    public FuncionarioCLT(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    @Override
    public double calcularSalario() {
        System.out.println("Calcular salario FuncionarioCLT");
        return getSalario() + 500;
    }
}
