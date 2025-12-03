// Questão 11: Remover duplicatas
public class Questao11 {
    
    public static int[] removerDuplicatas(int[] vetor) {
        // Primeiro, contar elementos únicos
        int contador = 0;
        for (int i = 0; i < vetor.length; i++) {
            boolean existe = false;
            for (int j = 0; j < i; j++) {
                if (vetor[i] == vetor[j]) {
                    existe = true;
                }
            }
            if (!existe) {
                contador = contador + 1;
            }
        }
        
        // Criar novo vetor com elementos únicos
        int[] resultado = new int[contador];
        int indice = 0;
        for (int i = 0; i < vetor.length; i++) {
            boolean existe = false;
            for (int j = 0; j < i; j++) {
                if (vetor[i] == vetor[j]) {
                    existe = true;
                }
            }
            if (!existe) {
                resultado[indice] = vetor[i];
                indice = indice + 1;
            }
        }
        
        return resultado;
    }
    
    public static void main(String[] args) {
        // Gera um vetor aleatório com possíveis duplicatas
        int[] vetor = new int[15];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 10);
        }
        
        System.out.println("Vetor original:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
        
        int[] semDuplicatas = removerDuplicatas(vetor);
        System.out.println("Vetor sem duplicatas:");
        for (int i = 0; i < semDuplicatas.length; i++) {
            System.out.print(semDuplicatas[i] + " ");
        }
        System.out.println();
    }
}
