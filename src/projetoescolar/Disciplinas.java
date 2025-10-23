import java.util.ArrayList;

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



}
