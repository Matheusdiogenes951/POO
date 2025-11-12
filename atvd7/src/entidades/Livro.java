package entidades;

public class Livro extends Produto {
    private String autor;
    private int paginas;

    public Livro(String nome, double preco, String autor, int paginas) {
        super(nome, preco);
        this.autor = autor;
        this.paginas = paginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public boolean pequeno() {
        return paginas < 100;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + paginas);
        System.out.println("É pequeno? " + (pequeno() ? "Sim" : "Não"));
        System.out.println("É barato? " + (serBarato() ? "Sim" : "Não"));
        System.out.println("----------------------");
    }
}
