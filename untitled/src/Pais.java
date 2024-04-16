public class Pais {
    private String nome;
    private int populacao;
    private int dimensao;

    public Pais(String nome, int populacao, int dimensao) {
        this.nome = nome;
        this.populacao = populacao;
        this.dimensao = dimensao;
    }

    public String getNome() {
        return nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public int getDimensao() {
        return dimensao;
    }
}

