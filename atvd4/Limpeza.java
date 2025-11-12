public class Limpeza extends Funcionario {
    public Limpeza(String nome, int idade, String matricula) {
        super(nome, idade, matricula, "Limpeza");
    }

    public void limparEspacos() {
        System.out.println(nome + " está limpando os espaços dos animais.");
    }
}
