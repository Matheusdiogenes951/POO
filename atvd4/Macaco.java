public class Macaco extends Mamifero {
    public Macaco(String nome) {
        super(nome, "Macaco", 2);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " grita: Uh uh ah ah!");
    }
}
