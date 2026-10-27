public class produtoConstrucao {

    private String nome;
    private String descricao;
    private double preco;
    private int desconto;



    public produtoConstrucao(String nome, String descricao, double preco, int desconto) {
        setNome(nome);
        setDescricao(descricao);
        setPreco(preco);
        setDesconto(desconto);
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }
}
