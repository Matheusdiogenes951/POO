public class Guia extends Funcionario {
    public Guia(String nome, int idade, String matricula) {
        super(nome, idade, matricula, "Guia");
    }

    public void realizarPasseio() {
        System.out.println(nome + " está realizando um passeio guiado pelo zoológico.");
    }
}
