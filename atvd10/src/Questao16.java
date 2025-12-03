// Questão 16: Produto escalar
public class Questao16 {
    
    public static int produtoEscalar(int[] vetor1, int[] vetor2) {
        int resultado = 0;
        int tamanho = vetor1.length;
        if (vetor2.length < tamanho) {
            tamanho = vetor2.length;
        }
        
        for (int i = 0; i < tamanho; i++) {
            resultado = resultado + (vetor1[i] * vetor2[i]);
        }
        
        return resultado;
    }
    
    public static void main(String[] args) {
        // Gera dois vetores aleatórios
        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];
        
        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = (int) (Math.random() * 20);
        }
        
        for (int i = 0; i < vetor2.length; i++) {
            vetor2[i] = (int) (Math.random() * 20);
        }
        
        System.out.println("Vetor 1:");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print(vetor1[i] + " ");
        }
        System.out.println();
        
        System.out.println("Vetor 2:");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print(vetor2[i] + " ");
        }
        System.out.println();
        
        int resultado = produtoEscalar(vetor1, vetor2);
        System.out.println("Produto escalar: " + resultado);
    }
}
