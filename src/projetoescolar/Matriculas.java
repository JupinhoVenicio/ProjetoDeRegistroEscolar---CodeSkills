package projetoescolar;

import java.util.Scanner;

import java.util.ArrayList;

public class Matriculas{

Scanner Scanner = new Scanner(System.in);

public static void menuMatriculas(ArrayList<String> alunos, ArrayList<String> professor, ArrayList<> disciplinas, ArrayList<String>AlunosMatriculados, ArrayList<String>DisciplinasMatriculadas){

    int num = -1;
    do{
        System.out.println("\n-----MENU DAS MATRICULAS-----")
        System.out.println("\n0-Sair")
        System.out.println("1-Numero da Matricula")
        System.out.println("2-")
        System.out.println("-----MENU DAS MATRICULAS-----")
        
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

    }while(num != 0)


}

 public void adicionarMatriculas(ArrayList<String>alunos, ArrayList<String>professor ArrayList<String>disciplinas, ArrayList<String>AlunosMatriculados, ArrayList<String>DisciplinasMatriculadas){
        alunos.listarAluno(alunos);
        System.out.println("Digite o número do aluno que deseja matricular:");
        while(!teclado.hasNextInt()){
            System.out.println("Entrada inválida! Por favor, digite um número.");
            teclado.next();
        }
        int nAluno = Integer.parseInt(teclado.nextLine());

        disciplinas.listarDisciplinas(disciplinas, professor);
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

    public void listarMatriculas(ArrayList<String>AlunosMatriculados, ArrayList<String>DisciplinasMatriculadas){
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