// Questão 9: Verificar palíndromo
public class Questao9 {
    
    public static boolean verificarPalindromo(int[] vetor) {
        for (int i = 0; i < vetor.length / 2; i++) {
            if (vetor[i] != vetor[vetor.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        // Gera um vetor aleatório
        int[] vetor = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 10);
        }
        
        System.out.println("Vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
        
        boolean resultado = verificarPalindromo(vetor);
        System.out.println("É palíndromo: " + resultado);
        
        // Exemplo com palíndromo
        System.out.println("\nExemplo de palíndromo:");
        int[] palindromo = {1, 2, 3, 2, 1};
        for (int i = 0; i < palindromo.length; i++) {
            System.out.print(palindromo[i] + " ");
        }
        System.out.println();
        System.out.println("É palíndromo: " + verificarPalindromo(palindromo));
    }
}
