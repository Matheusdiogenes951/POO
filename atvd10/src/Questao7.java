// Questão 7: Positivos e negativos
public class Questao7 {
    
    public static void contarPositivosNegativos(int[] vetor) {
        int positivos = 0;
        int negativos = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > 0) {
                positivos = positivos + 1;
            } else if (vetor[i] < 0) {
                negativos = negativos + 1;
            }
        }
        System.out.println("Números positivos: " + positivos);
        System.out.println("Números negativos: " + negativos);
    }
    
    public static void main(String[] args) {
        // Gera um vetor aleatório
        int[] vetor = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 200) - 100;
        }
        
        System.out.println("Vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
        
        contarPositivosNegativos(vetor);
    }
}
