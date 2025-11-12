package executar;

import entidades.*;

public class Principal {
    public static void main(String[] args) {
        Livro l = new Livro("O Pequeno Príncipe", 39.90, "Antoine de Saint-Exupéry", 96);
        Carro c = new Carro("Fusca", 8500.00, 4, 2);
        System.out.println("Informações do Livro:");
        l.exibirInfo();

        System.out.println("Informações do Carro:");
        c.exibirInfo();
    }
}
