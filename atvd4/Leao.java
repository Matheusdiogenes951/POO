public class Leao extends Mamifero {
    public Leao(String nome) {
        super(nome, "Leão", 4);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " ruge alto! 🦁");
    }
}
