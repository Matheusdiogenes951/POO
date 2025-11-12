public class Funcionario extends Pessoa {
    protected String matricula;
    protected String cargo;

    public Funcionario(String nome, int idade, String matricula, String cargo) {
        super(nome, idade);
        this.matricula = matricula;
        this.cargo = cargo;
    }

    public void trabalhar() {
        System.out.println(nome + " está realizando seu trabalho como " + cargo + ".");
    }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }
    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }
}
