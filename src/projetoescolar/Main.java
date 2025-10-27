package projetoescolar;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    static ArrayList <String> disciplinas = new ArrayList();
    static ArrayList<String> aluno = new ArrayList();
    static ArrayList<String> professor = new ArrayList();
    static ArrayList<String> professorR = new ArrayList();
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int menu = -1;

        do {

            System.out.println("\n-----GERENCIAMENTO ESCOLAR-----");
            System.out.println("\n0 - Sair");
            System.out.println("1 - Alunos");
            System.out.println("2 - Professores");
            System.out.println("3 - Disciplinas");
            System.out.println("4 - Matriculas");
            
            menu = teclado.nextInt();
            
            switch (menu) {
                case 0:

                    break;
                case 1:
                    Alunos.menuAlunos(aluno);
                    break;
                case 2:
                    Professores.menuProfessores(professor);
                    break;
                case 3:
                    Disciplinas.mainDiciplinas(disciplinas, professor, professorR);
                    break;
                default:
                    break;
            }

        } while (menu!=0);
    }

}
