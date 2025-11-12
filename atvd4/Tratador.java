public class Tratador extends Funcionario {
 public Tratador(String nome, int idade, String matricula) {
  super(nome, idade, matricula, "Tratador");

 }

 public void alimentarAnimais(Animal a) {
    System.out.println(nome + " está alimentando o " + a.getNome() + " (" + a.getEspecie() + ").");

 }

}
