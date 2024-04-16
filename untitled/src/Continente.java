import java.util.ArrayList;
import java.util.List;

public class Continente {
    private String nome;
    private List<Pais> paises;

    public Continente(String nome) {
        this.nome = nome;
        this.paises = new ArrayList<>();
    }

    public void adicionarPais(Pais pais) {
        paises.add(pais);
    }

    public int getDimensaoTotal() {
        int dimensaoTotal = 0;
        for (Pais pais : paises) {
            dimensaoTotal += pais.getDimensao();
        }
        return dimensaoTotal;
    }

    public int getPopulacaoTotal() {
        int populacaoTotal = 0;
        for (Pais pais : paises) {
            populacaoTotal += pais.getPopulacao();
        }
        return populacaoTotal;
    }

    public double getDensidadePopulacional() {
        return (double) getPopulacaoTotal() / getDimensaoTotal();
    }

    public Pais getPaisComMaiorPopulacao() {
        Pais paisComMaiorPopulacao = paises.get(0);
        for (Pais pais : paises) {
            if (pais.getPopulacao() > paisComMaiorPopulacao.getPopulacao()) {
                paisComMaiorPopulacao = pais;
            }
        }
        return paisComMaiorPopulacao;
    }

    public Pais getPaisComMenorPopulacao() {
        Pais paisComMenorPopulacao = paises.get(0);
        for (Pais pais : paises) {
            if (pais.getPopulacao() < paisComMenorPopulacao.getPopulacao()) {
                paisComMenorPopulacao = pais;
            }
        }
        return paisComMenorPopulacao;
    }

    public Pais getPaisDeMaiorDimensao() {
        Pais paisDeMaiorDimensao = paises.get(0);
        for (Pais pais : paises) {
            if (pais.getDimensao() > paisDeMaiorDimensao.getDimensao()) {
                paisDeMaiorDimensao = pais;
            }
        }
        return paisDeMaiorDimensao;
    }

    public Pais getPaisDeMenorDimensao() {
        Pais paisDeMenorDimensao = paises.get(0);
        for (Pais pais : paises) {
            if (pais.getDimensao() < paisDeMenorDimensao.getDimensao()) {
                paisDeMenorDimensao = pais;
            }
        }
        return paisDeMenorDimensao;
    }

    public double getRazaoTerritorial() {
        return (double) getPaisDeMaiorDimensao().getDimensao() / getPaisDeMenorDimensao().getDimensao();
    }
}
