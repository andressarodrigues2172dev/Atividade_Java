public class Main {
    public static void main(String[] args) {

        Continente continente = new Continente("América");

        Pais brasil = new Pais("Brasil", 213000000, 8515767);
        Pais argentina = new Pais("Argentina", 44940000, 2780400);
        Pais canada = new Pais("Canadá", 37960000, 9984670);

        continente.adicionarPais(brasil);
        continente.adicionarPais(argentina);
        continente.adicionarPais(canada);


        System.out.println("População total do continente: " + continente.getPopulacaoTotal());
        System.out.println("País com maior população: " + continente.getPaisComMaiorPopulacao().getNome());
        
    }
}