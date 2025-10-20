public class Disciplinas {

    private String id, nomeM, conteudo;

    public void Diciplinas(String id, String nomeM, String conteudo){
        this.id = id;
        this.nomeM = nomeM;
        this.conteudo = conteudo;
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

    @Override
    public String toString() {
        return "Disciplinas \n" +
                "id:" +id+ "\n" +
                "nomeM: "+nomeM+"\n"+
                "conteudo: "+conteudo;
    }
}
