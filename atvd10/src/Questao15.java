// Questão 15: Contar ocorrências
public class Questao15 {
    
    public static int contarOcorrencias(int[] vetor, int valor) {
        int contador = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                contador = contador + 1;
            }
        }
        return contador;
    }
    
    public static void main(String[] args) {
        // Gera um vetor aleatório
        int[] vetor = new int[15];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 10);
        }
        
        System.out.println("Vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
        
        int valor = (int) (Math.random() * 10);
        int ocorrencias = contarOcorrencias(vetor, valor);
        System.out.println("O valor " + valor + " aparece " + ocorrencias + " vez(es)");
    }
}
