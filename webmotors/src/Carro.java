public class Carro {

    // Atributos - Características

    String marca;
    String modelo;
    String cor;
    int ano;
    int km;
    double preco;

    // "Botão" para executar

    void exibiranuncio() {
        System.out.println("Anuncio do Carro: ");
        System.out.println("Marca: "+marca+" - "+modelo+" - Ano: "+ano);
        System.out.println("Cor: "+cor+" - Km: "+km+ " - Preço: "+preco);
    }

}
