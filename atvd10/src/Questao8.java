// Questão 8: Inverter lista
public class Questao8 {
    
    public static int[] inverterLista(int[] vetor) {
        int[] invertido = new int[vetor.length];
        for (int i = 0; i < vetor.length; i++) {
            invertido[i] = vetor[vetor.length - 1 - i];
        }
        return invertido;
    }
    
    public static void main(String[] args) {
        // Gera um vetor aleatório
        int[] vetor = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 100);
        }
        
        System.out.println("Vetor original:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
        
        int[] invertido = inverterLista(vetor);
        System.out.println("Vetor invertido:");
        for (int i = 0; i < invertido.length; i++) {
            System.out.print(invertido[i] + " ");
        }
        System.out.println();
    }
}
