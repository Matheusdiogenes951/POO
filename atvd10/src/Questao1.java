// Questão 1: Soma de elementos
public class Questao1 {
    
    public static int soma(int[] vetor) {
        int resultado = 0;
        for (int i = 0; i < vetor.length; i++) {
            resultado = resultado + vetor[i];
        }
        return resultado;
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
        
        int resultado = soma(vetor);
        System.out.println("Soma dos elementos: " + resultado);
    }
}
