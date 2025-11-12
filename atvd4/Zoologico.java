public class Zoologico {
    public static void main(String[] args) {
        // Criando funcionários
        Tratador t1 = new Tratador("Carlos", 35, "T001");
        Guia g1 = new Guia("Mariana", 29, "G002");
        Limpeza l1 = new Limpeza("João", 40, "L003");

        // Criando animais
        Leao leao = new Leao("Simba");
        Macaco macaco = new Macaco("George");
        Papagaio papagaio = new Papagaio("Loro");
        Pavao pavao = new Pavao("Azulão");
        Tilapia tilapia = new Tilapia("Tila");
        Beta beta = new Beta("Bolt");

        // Ações simuladas
        System.out.println("=== Ações no Zoológico ===");
        t1.trabalhar();
        g1.trabalhar();
        l1.trabalhar();

        t1.alimentarAnimais(leao);
        g1.realizarPasseio();
        l1.limparEspacos();

        leao.emitirSom();
        macaco.emitirSom();
        papagaio.voar();
        tilapia.nadar();

        leao.mover();
        macaco.amamentar();
    }
}
