package produto;

public class Produto {
    private final int id;
    private String nome;
    private int quantidadeInicial;
    private double custo;
    private String categoria;

    public Produto(int id, String nome, double custo, int quantidadeInicial, String categoria) {
        this.id = id;
        this.nome = nome;
        this.custo = custo;
        this.quantidadeInicial = quantidadeInicial;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeInicial() {
        return quantidadeInicial;
    }

    public void setQuantidadeInicial(int quantidadeInicial) {
        this.quantidadeInicial = quantidadeInicial;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
