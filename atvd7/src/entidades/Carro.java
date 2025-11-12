package entidades;

public class Carro extends Produto {
    private int rodas;
    private int portas;

    public Carro(String nome, double preco, int rodas, int portas) {
        super(nome, preco);
        this.rodas = rodas;
        this.portas = portas;
    }

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    @Override
    public boolean serBarato() {
        return getPreco() < 10000;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Rodas: " + rodas);
        System.out.println("Portas: " + portas);
        System.out.println("É barato? " + (serBarato() ? "Sim" : "Não"));
        System.out.println("----------------------");
    }
}
