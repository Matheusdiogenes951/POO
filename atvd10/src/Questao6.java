// Questão 6: Contar ímpares
public class Questao6 {
    
    public static int contarImpares(int[] vetor) {
        int contador = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 != 0) {
                contador = contador + 1;
            }
        }
        return contador;
    }
    
    public static void main(String[] args) {
        // Gera um vetor aleatório
        int[] vetor = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 100);
        }
        
        System.out.println("Vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
        
        int resultado = contarImpares(vetor);
        System.out.println("Quantidade de números ímpares: " + resultado);
    }
}
