package projetoescolar;

import java.util.Scanner;
import java.util.ArrayList;

public class Alunos {

    static Scanner teclado = new Scanner(System.in);

    public static void menuAlunos(ArrayList<String> aluno) {

        int menu = -1;
        do {

            System.out.println("\n-----MENU DE ALUNOS-----");
            System.out.println("\n0 - Sair");
            System.out.println("1 - Listar Alunos");
            System.out.println("2 - Adicionar Alunos");
            System.out.println("3 - Remover Alunos");
            System.out.println("4 - Buscar Alunos");
            System.out.println("5 - Atualizar Alunos");

            while(!teclado.hasNextInt()){
                System.out.println("Digite um número");
                teclado.next();
            };



            menu = teclado.nextInt();

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

    public static void ListarAluno(ArrayList<String> aluno) {

        if (aluno.size() == 0) {

            System.out.println("\nNenhum aluno foi cadastrado!");

        } else {

            for (int i = 0; i < aluno.size(); i++) {

                System.out.println("\n"+(i + 1)+ " - " + aluno.get(i));

            }

        }

    }

    public static void AddAluno(ArrayList<String> aluno) {

        System.out.print("\nDigite o nome do aluno: ");
        teclado.nextLine();
        aluno.add(teclado.nextLine());
        System.out.println();

    }

    public static void DeleteAluno(ArrayList<String> aluno) {

        System.out.print("\nDigite o numero do aluno: ");
        teclado.nextInt();
        aluno.remove((teclado.nextInt()) - 1);
        System.out.println();

    }

    public static void BuscarAluno(ArrayList<String> aluno) {

        System.out.print("\nDigite o nome do aluno, verificaremos seu cadastro: ");
        teclado.nextLine();
        String nome = teclado.nextLine();
        if ((aluno.contains(nome)) == true) {
            System.out.println("\nO aluno " + nome + " esta cadastrado em nosso sistema.");

        }else{

            System.out.println("\nAluno nao esta presente em nosso sistema.");
        }

    }
    public static void AtualizarAluno(ArrayList<String> aluno) {

        System.out.print("\nDigite o numero do aluno: ");
        int numeroAluno = (teclado.nextInt())-1;
        aluno.get(numeroAluno);
        System.out.print("Atualize o nome: ");
        teclado.nextLine();
        aluno.add(numeroAluno, teclado.nextLine());
        aluno.remove(numeroAluno+1);
        System.out.println("\nNome atualizado com sucesso!");
 
    }

}
