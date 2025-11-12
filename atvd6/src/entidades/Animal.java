package entidades;

public class Animal {
    private String especie;
    private String sexo;
    private String nome;
    private String dataDeNascimento;
    private int nCriacao;

    // 🔹 Agora é estático (compartilhado por todos)
    private static int animaisCriados = 0;
    
    public Animal() {
        animaisCriados++;
        this.nCriacao = animaisCriados;
        System.out.println("Animal criado com sucesso!");
    }

    public Animal(String especie, String sexo) {
        this();
        this.especie = especie;
        this.sexo = sexo;
    }

    public Animal(String especie, String sexo, String nome, String dataDeNascimento) {
        this(especie, sexo);
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }

    public int getNCriacao() {
        return this.nCriacao;
    }

    public static int getAnimaisCriados() {
        return animaisCriados;
    }

    public void exibirInformacoes() {
        System.out.println("🐾 Animal nº " + nCriacao);
        System.out.println("📚 Espécie: " + especie);
        System.out.println("♂️ Sexo: " + sexo);
        System.out.println("📛 Nome: " + nome);
        System.out.println("🎂 Data de Nascimento: " + dataDeNascimento);
        System.out.println("-----------------------------");
    }
}
