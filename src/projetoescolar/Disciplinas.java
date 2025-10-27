package projetoescolar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Disciplinas {

    public static void add (ArrayList <String> disciplinas, ArrayList <String> professores, ArrayList <String> profR){
        Scanner input = new Scanner(System.in);
        String nomeD, idprof;
        int infor;

        Professores.ListarProfessores(professores);
        System.out.print("Digite: ");
        infor = input.nextInt() - 1;
        if(infor >= 0 && infor <= professores.size()){
            idprof = Integer.toString(infor);

            System.out.print("Nome Materia: ");
            nomeD = input.next();

            disciplinas.add(nomeD);
            profR.add(idprof);
        }
        else{
            System.out.println("System > Professor nao encontrado! [Abortando processo] <\n");
        }

    }

    public static void list(ArrayList <String> disciplinas, ArrayList <String> profR){
        boolean encontrado = false;

        for(int i = 0; i < disciplinas.size(); i++){
            System.out.println("ID: "+(i + 1)+" <-> Materia: "+disciplinas.get(i) + " <-> ID professor: " + profR.get(i));
            encontrado = true;
        }
        if(!encontrado){
            System.out.println("System >Adicione alguma materia! [Abortando processo] <\n");
        }
    }

//    public static String verificar(ArrayList <String> disciplinas, int verf) {
//        String text = "algo encontrado!", id;
//        id = Integer.toString(verf);
//        for(int i = 0; i < disciplinas.size(); i++){
//            if(disciplinas.get(i).equalsIgnoreCase(id)){
//                return text;
//            }
//        }
//        return null;
//    }

    public static void buscar(ArrayList<String> disciplinas, ArrayList<String> profR) {
        Scanner input = new Scanner(System.in);
        String id;
        boolean encontrado = false;

        System.out.println("Digite:");
        id = input.next();

        for(int i = 0; i < disciplinas.size(); i++){
            if(disciplinas.get(i).equalsIgnoreCase(id)){
                System.out.println("ID: " +(i + 1)+ " <-> " + disciplinas.get(i) +" <-> Professor: " + profR.get(i));
                encontrado = true;
            }
        }

        if(!encontrado){
            System.out.println("System > Nao encontramos em nosso sistema! <");
        }
    }

    public static void delet(ArrayList <String> disciplinas, ArrayList <String> profR){
        Scanner input = new Scanner(System.in);
        String infor;
        if(disciplinas.isEmpty()){
            return;
        }
        System.out.println(">> Lista <<");
        list(disciplinas, profR);
        System.out.println();
        System.out.print("Id da disciplina para excluir: ");
        int id = input.nextInt() - 1;

        if (id >= 0 && id < disciplinas.size()) {
            disciplinas.remove(id);
            profR.remove(id);
            System.out.println("Disciplina removida!");
        }
        else {
            System.out.println("Disciplina não encontrada.");
        }
    }


    public static void mainDiciplinas(ArrayList <String> disciplinas,  ArrayList <String> professores, ArrayList <String> profR){

        Scanner tecla = new Scanner(System.in);

        String acao;
        int num, cont = 0, exit = 0;
        do {

            System.out.println("0 - Sair \n" +
                    "1 - Adicionar Disciplinas \n" +
                    "2 - Listar Disciplinas \n" +
                    "3 - Buscar Disciplinas \n" +
                    "4 - Remover Disciplinas\n");
            
            num = tecla.nextInt();

            switch (num) {
                case 0:
                    exit = 1;
                    break;
                case 1:
                    System.out.println("System > Registrando diciplina(s) <\n");
                    add(disciplinas, professores, profR);
                    break;
                case 2:
                    System.out.println("System > listando diciplina(s) < \n");
                    try{
                        list(disciplinas, profR);
                    }catch(Exception e){
                        System.out.println("ERRO -> "+e.getMessage());
                    }

                    break;
                case 3:
                    System.out.println("System > buscando diciplina(s) <");
                    buscar(disciplinas, profR);
                    break;
                case 4:
                    System.out.println("System > excluindo diciplina(s) <");
                    delet(disciplinas, profR);
                    break;
                default:
            }

        } while (exit != 1) ;
    }

}
