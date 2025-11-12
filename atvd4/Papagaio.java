public class Papagaio extends Ave {
    public Papagaio(String nome) {
        super(nome, "Papagaio", 2);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " fala: 'Olá, tudo bem?' 🦜");
    }
}
