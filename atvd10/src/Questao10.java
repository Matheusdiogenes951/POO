// Questão 10: Multiplicar elementos
public class Questao10 {
    
    public static int[] multiplicarPorDois(int[] vetor) {
        int[] resultado = new int[vetor.length];
        for (int i = 0; i < vetor.length; i++) {
            resultado[i] = vetor[i] * 2;
        }
        return resultado;
    }
    
    public static void main(String[] args) {
        // Gera um vetor aleatório
        int[] vetor = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 50);
        }
        
        System.out.println("Vetor original:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
        
        int[] multiplicado = multiplicarPorDois(vetor);
        System.out.println("Vetor multiplicado por 2:");
        for (int i = 0; i < multiplicado.length; i++) {
            System.out.print(multiplicado[i] + " ");
        }
        System.out.println();
    }
}
