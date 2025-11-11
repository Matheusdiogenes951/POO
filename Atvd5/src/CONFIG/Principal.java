package CONFIG;

public class Principal {
   public static void main(String[] args) {
	 Produto p0;
	 Produto p1 = new Produto();
	 Produto p2 = new Produto();
	 p1.setQuantidadedeEstoque(60);
	 System.out.println(p1.getQuantidadedeEstoque());
	 p1.setNome("arroz");
	 p1.setPreco(2.50);
	 System.out.println("nome do produto e: "+p1.getNome());
     System.out.println("Preço do produto e: "+p1.getPreco());
     //p1.preco = 1.500; //preco is not visible
     p1.exibirDados();
     //p0.exibirDados(); // produto 0 sem local alocado na memoria
     p2.exibirDados();
     p2.setQuantidadedeEstoque(50);
   }
   
   
}
