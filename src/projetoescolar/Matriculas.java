package projetoescolar;

import java.util.Scanner;
import java.util.ArrayList;

public class Matriculas {
    
    Scanner teclado = new Scanner(System.in);

    public void menuMatriculas(ArrayList<String>alunos, ArrayList<String>professor, ArrayList<String>disciplinas, ArrayList<String>AlunosMatriculados, ArrayList<String>DisciplinasMatriculadas){
        
        int op = -1;

        do {
            System.out.println("""
            -------------MENU MATRÍCULAS-------------
            0 - Voltar ao Menu Principal
            1 - Cadastrar Matrícula
            2 - Listar Matrículas
            """;);
            
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