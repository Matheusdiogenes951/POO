package entidades;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean serBarato() {
        return preco < 50;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
    }
}
