package media;

import java.util.Scanner;

public class media {

    public static double validarNota(double nota) throws NotaInvalidaException {
        if (nota < 0 || nota > 10) {
            throw new NotaInvalidaException("Erro: nota " + nota + " é inválida (deve estar entre 0 e 10).");
        }
        return nota;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro valor: ");
            double num1 = validarNota(sc.nextDouble());

            System.out.print("Digite o segundo valor: ");
            double num2 = validarNota(sc.nextDouble());

            System.out.print("Digite o terceiro valor: ");
            double num3 = validarNota(sc.nextDouble());

            double md = (num1 + num2 + num3) / 3;

            System.out.println("Média: " + md);

        } catch (NotaInvalidaException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
