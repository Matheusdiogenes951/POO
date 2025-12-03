// Questão 17: Interseção de vetores
public class Questao17 {
    
    public static int[] intersecao(int[] vetor1, int[] vetor2) {
        // Primeiro, contar elementos comuns
        int contador = 0;
        for (int i = 0; i < vetor1.length; i++) {
            for (int j = 0; j < vetor2.length; j++) {
                if (vetor1[i] == vetor2[j]) {
                    // Verificar se já foi contado
                    boolean jaContado = false;
                    for (int k = 0; k < i; k++) {
                        if (vetor1[k] == vetor1[i]) {
                            jaContado = true;
                        }
                    }
                    if (!jaContado) {
                        contador = contador + 1;
                    }
                }
            }
        }
        
        // Criar novo vetor com elementos comuns
        int[] resultado = new int[contador];
        int indice = 0;
        for (int i = 0; i < vetor1.length; i++) {
            for (int j = 0; j < vetor2.length; j++) {
                if (vetor1[i] == vetor2[j]) {
                    // Verificar se já foi adicionado
                    boolean jaAdicionado = false;
                    for (int k = 0; k < indice; k++) {
                        if (resultado[k] == vetor1[i]) {
                            jaAdicionado = true;
                        }
                    }
                    if (!jaAdicionado) {
                        resultado[indice] = vetor1[i];
                        indice = indice + 1;
                    }
                }
            }
        }
        
        return resultado;
    }
    
    public static void main(String[] args) {
        // Gera dois vetores aleatórios
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        
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
        
        int[] resultado = intersecao(vetor1, vetor2);
        System.out.println("Interseção:");
        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i] + " ");
        }
        System.out.println();
    }
}
