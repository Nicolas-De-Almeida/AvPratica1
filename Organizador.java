public class Organizador {
    private String nome;
    private int CPF;
    private int telefone;
    private String areaAtuacao;

    public Organizador (String nome, int CPF, int telefone, String areaAtuacao) {
        this.nome = nome;
        this.CPF = CPF;
        this.telefone = telefone;
        this.areaAtuacao = areaAtuacao


    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int cPF) {
        CPF = cPF;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }
}
