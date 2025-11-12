package divisao;

import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== DIVISÃO ===");
        System.out.print("Digite o primeiro valor: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double num2 = sc.nextDouble();

        if (num2 == 0) {
            System.out.println("Erro: Divisão por zero não é permitida.");
        } else {
            double resultado = num1 / num2;
            System.out.println("Resultado da divisão = " + resultado);
        }

        sc.close();
    }
}
