// Questão 14: Busca linear
public class Questao14 {
    
    public static boolean buscaLinear(int[] vetor, int alvo) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == alvo) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        // Gera um vetor aleatório
        int[] vetor = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 50);
        }
        
        System.out.println("Vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
        
        int alvo = (int) (Math.random() * 50);
        boolean encontrado = buscaLinear(vetor, alvo);
        System.out.println("Buscando elemento: " + alvo);
        System.out.println("Elemento encontrado: " + encontrado);
    }
}
