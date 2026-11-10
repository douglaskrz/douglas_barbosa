public class Produto {

    private String modelo;
    private String marca;
    private double preco;
    private int qtdEstoque;

    public Produto(String modelo, String marca, double preco, int qtdEstoque) {
        setModelo(modelo);
        setMarca(marca);
        setPreco(preco);
        setQtdEstoque(qtdEstoque);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.isBlank()) {
            throw new IllegalArgumentException("nome invalido");
        }
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.isBlank()) {
            throw new IllegalArgumentException("nome invalido");
        }
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco <= 0) {
            throw new IllegalArgumentException("preco ta errado");
        }
        this.preco = preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        if (qtdEstoque < 0) {
            throw new IllegalArgumentException("invalido");
        }
        this.qtdEstoque = qtdEstoque;
    }

    @Override
    public String toString() {
        return "Produtos{" + "modelo='" + modelo + '\'' + ", marca='" + marca + '\'' + ", preco=" + preco
                + ", qtdEstoque=" + qtdEstoque + '}';
    }

    public void aumentarQuantidadeDoEstoque(int aumento) {
        if (aumento <= 0) {
            throw new IllegalArgumentException("Erro, quantidade de aumento inválida");
        }
        qtdEstoque = qtdEstoque + aumento;
    }

    public void venderQuantidadeDeEstoque(int venda) {
        if (venda > qtdEstoque || venda <= 0) {
            throw new IllegalArgumentException("Erro, quantidade de venda inválida");
        }
        qtdEstoque = qtdEstoque - venda;
    }
}