import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        Disciplinas disciplinas;

        String acao;
        int num, cont = 0, exit = 0;
        do {

            System.out.println("[0] exit \n" +
                    "[1] add \n" +
                    "[2] list \n" +
                    "[3] busca \n" +
                    "[4] delet \n");
            System.out.print("Digite:");
            num = tecla.nextInt();

            switch (num) {
                case 0:
                    exit = 1;
                    break;
                case 1:
                    System.out.println("System > Registrando diciplina(s) <\n");
                    disciplinas = new Disciplinas();
                    cont++;
                    String id = Integer.toString(cont);
                    if(disciplinas.buscar(id)!=null) {

                    }
                    else{
                        disciplinas.setId(id);

                        System.out.println("nome");
                        disciplinas.setNomeM(tecla.next());

                        System.out.println("conteudo");
                        disciplinas.setConteudo(tecla.next());

                        disciplinas.add(disciplinas);
                    }

                    break;
                case 2:
                    System.out.println("System > listando diciplina(s) < \n");
                    disciplinas = new Disciplinas();
                    System.out.println(disciplinas.list());
                    break;
                case 3:
                    System.out.println("System > buscando diciplina(s) <");
                    disciplinas = new Disciplinas();
                    System.out.print("Digite o id: ");
                    acao = tecla.next();
                    System.out.println(disciplinas.buscar(acao));
                    break;
                case 4:
                    System.out.println("System > excluindo diciplina(s) <");
                    disciplinas = new Disciplinas();
                    acao = tecla.next();
                    System.out.println(disciplinas.delet(acao));
                    break;
            }

        } while (exit != 1) ;

    }
}
