public class Animal {
    protected String nome;
    protected String especie;
    protected int numeroDePatas;

    public Animal(String nome, String especie, int numeroDePatas) {
        this.nome = nome;
        this.especie = especie;
        this.numeroDePatas = numeroDePatas;
    }

    public void emitirSom() {
        System.out.println(nome + " emite um som genérico.");
    }

    public void mover() {
        System.out.println(nome + " está se movendo.");
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getEspecie() { return especie; }
    public void setEspecie(String especie) { this.especie = especie; }
    public int getNumeroDePatas() { return numeroDePatas; }
    public void setNumeroDePatas(int numeroDePatas) { this.numeroDePatas = numeroDePatas; }
}
