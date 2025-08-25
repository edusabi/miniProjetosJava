package main.test;

import main.domain.*;

import java.util.ArrayList;
import java.util.Scanner;

public class FuncionarioTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        String continuar;

        do {
            System.out.print("Digite o nome do funcionário: ");
            String nome = scanner.next();

            System.out.print("Digite a idade do funcionário: ");
            int idade = scanner.nextInt();

            System.out.print("Digite o salário do funcionário: ");
            double salario = scanner.nextDouble();

            System.out.print("Digite o tipo (CLT | PJ | ESTAGIARIO): ");
            String tipo = scanner.next().toUpperCase();

            switch (tipo) {
                case "CLT":
                    funcionarios.add(new FuncionarioCLT(nome, idade, salario));
                    break;
                case "PJ":
                    funcionarios.add(new FuncionarioPJ(nome, idade, salario));
                    break;
                case "ESTAGIARIO":
                    funcionarios.add(new Estagiario(nome, idade, salario));
                    break;
                default:
                    System.out.println("Tipo inválido.");
                    break;
            }

            System.out.print("Deseja adicionar outro funcionário? (s/n): ");
            continuar = scanner.next().toLowerCase();

        } while (continuar.equals("s"));

        // Listando todos os funcionários
        System.out.println("\n--- LISTA DE FUNCIONÁRIOS ---");
        for (Funcionario f : funcionarios) {
            double salarioCalculado = f.calcularSalario();
            System.out.println("Nome: " + f.getNome());
            System.out.println("Idade: " + f.getIdade());
            System.out.println("Tipo: " + f.getClass().getSimpleName());
            System.out.println("Salário Final: R$" + salarioCalculado);
            System.out.println("-----------------------------");
        }

        scanner.close();
    }
}
