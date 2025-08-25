package Main.test;

import Main.domain.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestandoSistema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Livro> meusLivros = BancoDeLivros.getLivros();

        while (true){
            System.out.println("Digite 1 para aluno \nDigite 2 para professor");
            int opcao = scan.nextInt();
            scan.nextLine();

            if(opcao == 0){
                System.out.println("Saindo...");
                break;
            };

            System.out.print("Digite o nome do usuário: ");
            String nomeUsuario = scan.nextLine();

            System.out.print("Digite a idade do usuário: ");
            int idadeUsuario = scan.nextInt();
            scan.nextLine();

            Usuario usuario = null;

            switch (opcao){
                case 1:
                    System.out.println("Digite a série do aluno: ");
                    String serieUsuario = scan.nextLine();
                    usuario = new UsuarioAluno(nomeUsuario, idadeUsuario, serieUsuario);
                    break;
                case 2:
                    System.out.println("Digite a materia do professor: ");
                    String materiaUsuario = scan.nextLine();
                    usuario = new UsuarioProfessor(nomeUsuario, idadeUsuario, materiaUsuario);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            };

            System.out.println("Qual livro você deseja? ");

            for (int i = 0; i < meusLivros.size(); i++) {
                Livro livro = meusLivros.get(i);
                System.out.println((i + 1) + " - " + livro.getTitulo() + " - " + livro.getAutor() + " - " + livro.getAno());
            };

            Livro livroEscolhido = null;
            while (livroEscolhido == null) {
                System.out.print("Digite o número do livro que você quer: ");
                int numeroLivro = scan.nextInt();

                if (numeroLivro >= 1 && numeroLivro <= meusLivros.size()) {
                    livroEscolhido = meusLivros.get(numeroLivro - 1);
                    System.out.println("Você escolheu o livro: " + livroEscolhido.getTitulo());
                } else {
                    System.out.println("Número inválido! Tente novamente.");
                }
            };

            System.out.println("Digite a data de início do empréstimo (dd/mm/aaaa): ");
            scan.nextLine();
            String dataInicioLivro = scan.nextLine();

            System.out.println("Digite a data de entrega do livro (dd/mm/aaaa): ");
            String dataFimLivro = scan.nextLine();

            Emprestimo emprestimo = new Emprestimo(livroEscolhido, usuario, dataInicioLivro, dataFimLivro);

            System.out.println("--------------");
            emprestimo.exibirInfoEmprestimo();
            break;
        };

        scan.close();

    }

}
