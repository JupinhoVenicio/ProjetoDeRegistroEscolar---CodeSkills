package projetoescolar;

import java.util.Scanner;

import java.util.ArrayList;

public class Matriculas{

static Scanner teclado = new Scanner(System.in);

public static void menuMatriculas(ArrayList<String> alunos, ArrayList<String> professor, ArrayList<String> disciplinas, ArrayList<String>AlunosMatriculados, ArrayList<String>DisciplinasMatriculadas){

    int op  = -1;
    do{
        System.out.println("\n-----MENU DAS MATRICULAS-----");
        System.out.println("\n0-Sair");
        System.out.println("1- Adicionar Matriculas");
        System.out.println("2- Listar Matriculas");
        
        while(!teclado.hasNextInt()){
            System.out.println("Entrada inválida! Por favor, digite um número.");
            teclado.next();
        }
        op = Integer.parseInt(teclado.nextLine());
        
        switch (op) {
                case 0:
                    break;
                case 1:
                    adicionarMatriculas(alunos, professor, disciplinas, AlunosMatriculados, DisciplinasMatriculadas);
                    break;
                case 2:
                    listarMatriculas(AlunosMatriculados, DisciplinasMatriculadas);
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }

    }while(op != 0);


}

 public static void adicionarMatriculas(ArrayList<String>alunos, ArrayList<String>professor, ArrayList<String>disciplinas, ArrayList<String>AlunosMatriculados, ArrayList<String>DisciplinasMatriculadas){
        Alunos.ListarAluno(alunos);
        System.out.println("Digite o número do aluno que deseja matricular:");
        while(!teclado.hasNextInt()){
            System.out.println("Entrada inválida! Por favor, digite um número.");
            teclado.next();
        }
        int nAluno = Integer.parseInt(teclado.nextLine());

        Disciplinas.list(disciplinas, professor);
        System.out.println("Digite o número da disciplina que deseja matricular:");
        while(!teclado.hasNextInt()){
            System.out.println("Entrada inválida! Por favor, digite um número.");
            teclado.next();
        }
        int nDisciplina = Integer.parseInt(teclado.nextLine());

        if(nAluno < alunos.size() && nAluno >= 0 && nDisciplina < disciplinas.size() && nDisciplina >= 0){
            AlunosMatriculados.add(alunos.get(nAluno));
            DisciplinasMatriculadas.add(disciplinas.get(nDisciplina));
            System.out.println("Matrícula realizada com sucesso!");
        } else {
            System.out.println("Número do aluno ou disciplina inválido!");
        }
    }

    public static void listarMatriculas(ArrayList<String>AlunosMatriculados, ArrayList<String>DisciplinasMatriculadas){
        System.out.println("-----LISTA DE MATRÍCULAS-----");
        if(AlunosMatriculados.isEmpty()){
            System.out.println("Nenhuma matrícula cadastrada.");
        } else {
            for(int i = 0; i < AlunosMatriculados.size(); i++){
                System.out.println("Aluno: " + AlunosMatriculados.get(i) + " - Disciplina: " + DisciplinasMatriculadas.get(i));
            }
        }
    }

}