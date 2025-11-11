package lista6;

import entidades.*;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Animal("Cavalo", "macho");
        Animal a3 = new Animal("peixe", "menine", "beta", "10/10/1010");

        System.out.println(a1.getNCriacao());  // 1
        System.out.println(a2.getNCriacao());  // 2
        System.out.println(a3.getNCriacao());  // 3
        System.out.println(Animal.getAnimaisCriados()); // 3

        System.out.println("\nInformações dos animais criados:");
        a1.exibirInformacoes();
        a2.exibirInformacoes();
        a3.exibirInformacoes();
    }
}
