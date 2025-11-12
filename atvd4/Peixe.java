public class Peixe extends Animal {
    public Peixe(String nome, String especie) {
        super(nome, especie, 0); // Peixes não têm patas
    }

    public void nadar() {
        System.out.println(nome + " está nadando no aquário.");
    }
}
