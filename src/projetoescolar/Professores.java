package projetoescolar;

import java.util.Scanner;
import java.util.ArrayList;

public class Professores
{
    static Scanner input = new Scanner(System.in);

    public static void menuProfessores(ArrayList<String> professor)
    {
        int menu = -1;
        do
        {
            System.out.println("\n-----MENU DOS PROFESSORES-----");
            System.out.println("1 - Listar Professores");
            System.out.println("2 - Adicionar Professores");
            System.out.println("3 - Remover Professores");
            System.out.println("4 - Buscar Professores");
            System.out.println("5 - Atualizar Professores");
            System.out.println("0 - Sair");
            
            menu = input.nextInt();
            switch (menu)
            {
                case 0:
                break;
                case 1:
                    ListarProfessores(professor);
                    break;
                case 2:
                    AdicionarProfessor(professor);
                    break;

                case 3:
                    RemoverProfessor(professor);
                    break;
                case 4:
                    BuscarProfessor(professor);
                    break;
                case 5:
                    AtualizarProfessor(professor);
                    break;
                    default:
                    System.out.println("Opcao Invalida!");
            }
        } while (menu != 0);
    }

    public static void ListarProfessores(ArrayList<String> professor)
    {
        if (professor.isEmpty())
        {
            System.out.println("\nNenhum professor foi cadastrado!");
        }
        else
        {
            for (int i = 0; i < professor.size(); i++)
            {
                System.out.println("\n"+(i + 1) + " - " + professor.get(i));
            }
        }
    }

    public static void AdicionarProfessor(ArrayList<String> professor)
    {
        System.out.print("\nDigite o nome do professor: ");
        input.nextLine();
        professor.add(input.nextLine());
        System.out.println("Professor adicionado com sucesso!");
    }

    public static void RemoverProfessor(ArrayList<String> professor)
    {
        System.out.print("\nDigite o numero do professor: ");
        
        professor.remove((input.nextInt()) - 1);
        System.out.println("Professor removido com sucesso!");
    }

    public static void BuscarProfessor(ArrayList<String> professor)
    {
        System.out.print("\nDigite o nome do professor: ");
        input.nextLine();
        String nome = input.nextLine();
        if (professor.contains(nome))
        {
            System.out.println("O professor " + nome + " esta cadastrado em nosso sistema.");
        }
        else
        {
            System.out.println("Nao ha professor pelo nome de " + nome + " cadastrado em nosso sistema.");
        }
    }

    public static void AtualizarProfessor(ArrayList<String> professor)
    {
        System.out.print("\nDigite o numero do professor: ");
        int num = input.nextInt()-1;
        System.out.print("Novo nome do professor para esse cadastro: ");
        input.nextLine();
        professor.add(num, input.nextLine());
        professor.remove(num+1);
        System.out.println("Cadastro atualizado com sucesso!");
    }
}