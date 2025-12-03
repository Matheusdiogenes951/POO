// Questão 12: Segundo maior valor
public class Questao12 {
    
    public static int segundoMaiorValor(int[] vetor) {
        int maior = vetor[0];
        int segundoMaior = vetor[0];
        
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                segundoMaior = maior;
                maior = vetor[i];
            } else if (vetor[i] > segundoMaior && vetor[i] != maior) {
                segundoMaior = vetor[i];
            }
        }
        
        return segundoMaior;
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
        
        int resultado = segundoMaiorValor(vetor);
        System.out.println("Segundo maior valor: " + resultado);
    }
}
