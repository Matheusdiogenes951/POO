package equacao;

import java.util.Scanner;

public class EquacaoSegundoGrau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== EQUAÇÃO DO 2º GRAU ===");
        System.out.print("Informe o valor de a: ");
        double a = sc.nextDouble();

        System.out.print("Informe o valor de b: ");
        double b = sc.nextDouble();

        System.out.print("Informe o valor de c: ");
        double c = sc.nextDouble();

        if (a == 0) {
            System.out.println("Não é equação do 2º grau, pois a = 0.");
        } else {
            double delta = b * b - 4 * a * c;
            System.out.println("Delta = " + delta);

            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Duas raízes reais:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Raiz única: x = " + x);
            } else {
                double real = -b / (2 * a);
                double imag = Math.sqrt(-delta) / (2 * a);
                System.out.println("Raízes complexas:");
                System.out.println("x1 = " + real + " + " + imag + "i");
                System.out.println("x2 = " + real + " - " + imag + "i");
            }
        }

        sc.close();
    }
}
