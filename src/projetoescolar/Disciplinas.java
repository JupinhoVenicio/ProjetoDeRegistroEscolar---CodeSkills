import java.util.ArrayList;
import java.util.Scanner;

public class Disciplinas {
    private static ArrayList <Disciplinas> arrayL = new ArrayList<>();
    private String id, nomeM, conteudo;



    public Disciplinas(String id, String nomeM, String conteudo){
        this.id = id;
        this.nomeM = nomeM;
        this.conteudo = conteudo;
    }

    public  Disciplinas() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNomeM(String nomeM) {
        this.nomeM = nomeM;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getId() {
        return id;
    }

    public String getNomeM() {
        return nomeM;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void add (Disciplinas disciplinas){
        arrayL.add(disciplinas);
    }

    public String list(){
        String text = "";

        for(int i = 0; i < arrayL.size(); i++){
            text = text + arrayL.get(i).toString();
        }

        return text;
    }

    public Disciplinas buscar(String id) {

        for(int i = 0; i < arrayL.size(); i++){
            Disciplinas disciplinas = arrayL.get(i);

            if(disciplinas.getId().equalsIgnoreCase(id)){
                return disciplinas;
            }
        }
        return null;
    }

    public String delet(String id){

        String text = "";
        try {

            if(buscar(id) != null) {

                for (int i = 0; i < arrayL.size(); i++) {
                    Disciplinas disciplinas = arrayL.get(i);

                    if (disciplinas.getId().equalsIgnoreCase(id)) {
                        arrayL.remove(i);
                        text = "System > Materia retirada com sucesso! <";
                    }
                }
            }
            else{
               text = "System > Materia nao existe para excluir! <";
            }
        }catch(Exception e){
            System.out.println("ERRO -> "+e.getMessage());
        }

        return text;
    }

    @Override
    public String toString() {
        return "\n" +
                ">> Disciplinas <<\n" +
                "id:" +id+ "\n" +
                "nomeM: "+nomeM+"\n"+
                "conteudo: "+conteudo+"\n\n";

    }

    public static void mainDiciplinas(){

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
