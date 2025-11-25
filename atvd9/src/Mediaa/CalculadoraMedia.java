package Mediaa;

public class CalculadoraMedia {

    private double validarNota(double nota) throws NotaInvalidaException {
        if (nota < 0 || nota > 10) {
            throw new NotaInvalidaException("Nota inválida: " + nota + ". A nota deve estar entre 0 e 10, se vc conseguiu tirar menos que isso meus pesames.");
        }
        return nota;
    }

    public double calcularMedia(double n1, double n2, double n3) throws NotaInvalidaException {
        n1 = validarNota(n1);
        n2 = validarNota(n2);
        n3 = validarNota(n3);

        return (n1 + n2 + n3) / 3;
    }
}
