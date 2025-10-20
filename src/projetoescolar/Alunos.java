package projetoescolar;

import java.util.Scanner;
import java.util.ArrayList;

public class Alunos {

    Scanner teclado = new Scanner(System.in);

    public void menuAlunos(ArrayList<String> aluno) {

        int menu = -1;
        do {

            System.out.println("\n-----MENU DE ALUNOS-----");
            System.out.println("\n0 - Sair");
            System.out.println("1 - Listar Alunos");
            System.out.println("2 - Adicionar Alunos");
            System.out.println("3 - Remover Alunos");
            System.out.println("4 - Buscar Alunos");
            System.out.println("5 - Atualizar Alunos");

            switch (menu) {

                case 0:
                break;
                case 1:
                    ListarAluno(aluno);
                    break;
                case 2:
                    AddAluno(aluno);
                    break;

                case 3:
                    DeleteAluno(aluno);
                    break;
                    case 4:
                    BuscarAluno(aluno);
                    break;
                    case 5:
                    AtualizarAluno(aluno);
                    break;
                    default:
                    System.out.println("Opcao Invalida!");


            }

        } while (menu != 0);

    }

    public void ListarAluno(ArrayList<String> aluno) {

        if (aluno.size() == 0) {

            System.out.println("\nNenhum aluno foi cadastrado!");

        } else {

            for (int i = 0; i < aluno.size(); i++) {

                System.out.println((i + 1) + aluno.get(i));

            }

        }

    }

    public void AddAluno(ArrayList<String> aluno) {

        System.out.print("\nDigite o nome do aluno: ");
        aluno.add(teclado.nextLine());
        System.out.println();

    }

    public void DeleteAluno(ArrayList<String> aluno) {

        System.out.print("\nDigite o numero do aluno: ");
        aluno.remove((teclado.nextInt()) - 1);
        System.out.println();

    }

    public void BuscarAluno(ArrayList<String> aluno) {

        System.out.print("\nDigite o nome do aluno, verificaremos seu cadastro: ");
        String nome = teclado.nextLine();
        if ((aluno.contains(nome)) == true) {
            System.out.println("\nO aluno " + nome + " esta cadastrado em nosso sistema.");

        }else{

            System.out.println("\nAluno nao esta presente em nosso sistema.");
        }

    }
    public void AtualizarAluno(ArrayList<String> aluno) {

        System.out.print("\nDigite o numero do aluno: ");
        int numeroAluno = (teclado.nextInt())-1;
        aluno.get(numeroAluno);
        System.out.print("Atualize o nome: ");
        aluno.add(numeroAluno, teclado.nextLine());
        System.out.println("\nNome atualizado com sucesso!");
 
    }

}
