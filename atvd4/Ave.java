public class Ave extends Animal {
    public Ave(String nome, String especie, int numeroDePatas) {
        super(nome, especie, numeroDePatas);
    }

    public void voar() {
        System.out.println(nome + " está voando pelos céus!");
    }
}
