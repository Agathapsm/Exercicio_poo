public class Main {
    public static void main(String[] args) {

        Carro c1, c2;
        c1 = new Carro();
        c2 = new Carro();

        c1.marca = "Chevrolet";
        c1.modelo = "Celta";
        c1.cor = "Preto";
        c1.ano = 2012;
        c1.km = 40000;
        c1.preco = 20000;

        c2.marca = "Renault";
        c2.modelo = "Sandero";
        c2.cor = "Bege";
        c2.ano = 2021;
        c2.km = 30113;
        c2.preco = 75000;

        c1.exibiranuncio();
        c2.exibiranuncio();
    }
}
