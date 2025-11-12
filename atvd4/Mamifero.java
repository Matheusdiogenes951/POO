public class Mamifero extends Animal {
    public Mamifero(String nome, String especie, int numeroDePatas) {
        super(nome, especie, numeroDePatas);
    }

    public void amamentar() {
        System.out.println(nome + " está amamentando seus filhotes.");
    }
}
