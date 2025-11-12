public class Pavao extends Ave {
    public Pavao(String nome) {
        super(nome, "Pavão", 2);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " emite um som agudo e exibe suas penas coloridas!");
    }
}
