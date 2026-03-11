# Exercício de Programação Orientada a Objetos em Java 🚗

Este projeto foi desenvolvido para praticar conceitos básicos de **Programação Orientada a Objetos (POO)** utilizando **Java**.

O programa cria objetos da classe `Carro`, define seus atributos e exibe as informações no console simulando um **anúncio de venda de carros**.

## 📚 Conceitos praticados

Neste exercício foram utilizados conceitos fundamentais de POO:

* Criação de classes
* Atributos
* Métodos
* Instanciação de objetos
* Uso do método `main`

## 📂 Estrutura do projeto

O projeto possui duas classes principais:

### Classe `Carro`

Representa um carro e contém os seguintes atributos:

* `marca`
* `modelo`
* `cor`
* `ano`
* `km`
* `preco`

Também possui o método:

`exibiranuncio()` → responsável por mostrar no console as informações do carro.

```java
public class Carro {

    String marca;
    String modelo;
    String cor;
    int ano;
    int km;
    double preco;

    void exibiranuncio() {
        System.out.println("Anuncio do Carro: ");
        System.out.println("Marca: "+marca+" - "+modelo+" - Ano: "+ano);
        System.out.println("Cor: "+cor+" - Km: "+km+ " - Preço: "+preco);
    }
}
```

### Classe `Main`

A classe `Main` cria dois objetos da classe `Carro` e define seus atributos.

```java
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
```

## ▶️ Saída esperada

Ao executar o programa, serão exibidos dois anúncios de carros no console com suas informações.

## 👩‍💻 Autora

Ágatha Paiva
Estudante de Ciência da Computação
