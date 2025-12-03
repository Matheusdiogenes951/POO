// Questão 18: União de vetores
public class Questao18 {
    
    public static int[] uniao(int[] vetor1, int[] vetor2) {
        // Primeiro, contar elementos únicos
        int contador = vetor1.length;
        for (int i = 0; i < vetor2.length; i++) {
            boolean existe = false;
            for (int j = 0; j < vetor1.length; j++) {
                if (vetor2[i] == vetor1[j]) {
                    existe = true;
                }
            }
            if (!existe) {
                contador = contador + 1;
            }
        }
        
        // Criar novo vetor com elementos da união
        int[] resultado = new int[contador];
        int indice = 0;
        
        // Adicionar todos os elementos do vetor1
        for (int i = 0; i < vetor1.length; i++) {
            resultado[indice] = vetor1[i];
            indice = indice + 1;
        }
        
        // Adicionar elementos de vetor2 que não existem em vetor1
        for (int i = 0; i < vetor2.length; i++) {
            boolean existe = false;
            for (int j = 0; j < vetor1.length; j++) {
                if (vetor2[i] == vetor1[j]) {
                    existe = true;
                }
            }
            if (!existe) {
                resultado[indice] = vetor2[i];
                indice = indice + 1;
            }
        }
        
        return resultado;
    }
    
    public static void main(String[] args) {
        // Gera dois vetores aleatórios
        int[] vetor1 = new int[8];
        int[] vetor2 = new int[8];
        
        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = (int) (Math.random() * 10);
        }
        
        for (int i = 0; i < vetor2.length; i++) {
            vetor2[i] = (int) (Math.random() * 10);
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
        
        int[] resultado = uniao(vetor1, vetor2);
        System.out.println("União:");
        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i] + " ");
        }
        System.out.println();
    }
}
