public class Visitante extends Pessoa {
 private boolean socio;
 private String ingresso;


 public Visitante(String nome, int idade, boolean socio ,String ingresso) {
    super(nome, idade);
    this.socio = socio;
    this.ingresso = ingresso;
 }

 public boolean isSocio() { return socio; }
 public void setSocio(boolean socio) { this.socio = socio; }
 public String getIngresso() { return ingresso; }
 public void setIngresso(String ingresso) { this.ingresso = ingresso; }


}