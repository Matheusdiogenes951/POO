package CONFIG;

public class Produto {
  private String nome;
  private double preco;
  private int quantidadeEstoque;
  
  public void setNome(String nome) {
	  this.nome = nome;
  }
  public String getNome() {
	  return this.nome;
  }
  public void setPreco(double preco) {
	  this.preco = preco;
  }
  public double getPreco() {
	  return this.preco;
  }
  public int getQuantidadedeEstoque() {
	  return this.getQuantidadedeEstoque();
  }
  public void setQuantidadedeEstoque(int quantidadedeEstoque) {
	  if(quantidadedeEstoque>0) {
		  this.quantidadeEstoque = quantidadedeEstoque;
	  }else {
		  System.out.println("Quantidade deve ser positiva");
	  }
  }
  public double calcularValorTotal() {
	  return quantidadeEstoque*preco;
  }
  public double calcularValorTotal(int quantidadeAdicional) {
	  return (quantidadeEstoque+quantidadeAdicional)*preco;
  }
  public void exibirDados () {
	  System.out.printf("Nome: %s%nPreço:%.2f%nQuantidade: %d%n",nome, preco, quantidadeEstoque);
  }
  }
  