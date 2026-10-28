public class Produto {

    private String modelo;
    private String marca;
    private Double preco;
    private int qntEstoque;



    public Produto(String modelo, String marca, Double preco, int qntEstoque ) {
        setMarca(marca);
        setModelo(modelo);
        setPreco(preco);
        setQntEstoque(qntEstoque);
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

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        if (preco <= 0) {
            throw new IllegalArgumentException("preco ta errado");
        }
        this.preco = preco;
    }

    public int getQntEstoque() {
        return qntEstoque;
    }

    public void setQntEstoque(int qntEstoque) {
        if (qntEstoque < 0) {
            throw new IllegalArgumentException("invalido");
        }
        this.qntEstoque = qntEstoque;
    }


    public void aumentarQuantidadeEstoque(int aumento){
        if (aumento <= 0){
            throw new IllegalArgumentException("Erro, quantidade inválida.");
        }
            qntEstoque = qntEstoque + aumento;
        // qtdEstoque += aumento;
    }

    public void vendas(int subtracao){
        if (subtracao  > qntEstoque || subtracao <= 0){
            throw new IllegalArgumentException("Erro, quantidade inválida.");
        }
            qntEstoque = qntEstoque - subtracao;
        // qtdestoque -= venda;
    }



    @Override
    public String toString() {
        return "Produtos{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", preco=" + preco +
                ", qntEstoque=" + qntEstoque +
                '}';
    }
}
