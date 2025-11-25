package Mediaa;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CalculadoraMedia calc = new CalculadoraMedia();

        try {
            System.out.print("Digite a primeira nota: ");
            double n1 = sc.nextDouble();

            System.out.print("Digite a segunda nota: ");
            double n2 = sc.nextDouble();

            System.out.print("Digite a terceira nota: ");
            double n3 = sc.nextDouble();

            double media = calc.calcularMedia(n1, n2, n3);
            System.out.println("A média das notas é: " + media);

        } catch (NotaInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        sc.close();
    }
}
