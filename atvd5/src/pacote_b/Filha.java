package pacote_b;

import pacote_a.Base;

public class Filha extends Base{
	 public void testarAcesso() {
	        System.out.println("Acessando atributos herdados da classe Base:");
	        System.out.println("attPublico: " + attPublico);
	        System.out.println("attProtegido: " + attProtegido);

	        //atributo com visibilidade padrão (default)
	        // não é acessível fora do pacote pacote_a
	        // System.out.println("attPadrao: " + attPadrao);

	        //atributo private só é acessível dentro da própria classe Base
	        // System.out.println("attPrivado: " + attPrivado);
	     
	        }
	

}
