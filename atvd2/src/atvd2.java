import java.util.Scanner;

public class atvd2 {
    public static void main(String[] args) {

        // ===== 1. Operadores e Variáveis =====
        System.out.println("=== 1. Operadores e Variáveis ===");
        int a = 15;
        int b = 7;

        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão inteira: " + (a / b));
        System.out.println("Resto da divisão inteira: " + (a % b));

        double resultadoDivisao = (double) a / b;
        System.out.println("Divisão com ponto flutuante: " + resultadoDivisao);

        a++;
        System.out.println("Novo valor de a (incrementado): " + a);

        // ===== 2. Estrutura de Decisão (if-else) =====
        System.out.println("\n=== 2. Estrutura if-else (Par ou Ímpar) ===");
        int numero = 8;

        if (numero % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é ímpar");
        }

        // ===== 3. Operador Ternário =====
        System.out.println("\n=== 3. Operador Ternário ===");
        int numero2 = 9;
        String resultado = (numero2 % 2 == 0) ? "par" : "ímpar";
        System.out.println("O número " + numero2 + " é " + resultado);

        // ===== 4. Estrutura de Decisão Aninhada (if-else-if) =====
        System.out.println("\n=== 4. Estrutura if-else-if (Notas) ===");
        double nota = 85.0;

        if (nota >= 90) {
            System.out.println("Excelente");
        } else if (nota >= 70) {
            System.out.println("Bom");
        } else if (nota >= 50) {
            System.out.println("Regular");
        } else {
            System.out.println("Insuficiente");
        }

        // ===== 5. Estrutura de Repetição (for) =====
        System.out.println("\n=== 5. Estrutura de Repetição (for) ===");
        System.out.println("Ordem crescente:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\nOrdem decrescente:");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }

        // ===== 6. Estrutura de Repetição Condicional (while) =====
        System.out.println("\n\n=== 6. Estrutura de Repetição Condicional (while) ===");
        int numeroCorreto = 5;
        int tentativa = 2;

        while (tentativa != numeroCorreto) {
            System.out.println("Tentativa incorreta! Tente novamente...");
            tentativa++; // apenas para não travar o loop
        }

        System.out.println("Parabéns! Você acertou!");
    }
}
