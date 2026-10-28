import java.util.ArrayList;
import java.util.List;

public class Loja {

    private List<Produto> produtos;

    public Loja() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto p) {
        produtos.add(p);
    }

    public Produto produtoMaisCaro() {
        Produto produtoMaisCaro = null;
        double precoMaior = Double.MIN_VALUE;
        for (Produto p : produtos) {
            if (marca.equals(p.getMarca()) && p.getPreco() > precoMaior) {
                produtoMaisCaro = p;
                precoMaior = p.getPreco();
            }
        }
        return produtoMaisCaro;
    }
    public List<Produto> buscaEstoque(double precoInicial, double precoFinal, String marca) {
        List<Produto> buscaEstoque = new ArrayList<>();
        for (Produto p : produtos) {
            if (marca.equals(p.getMarca()) && p.getPreco() >= precoInicial && p.getPreco() <= precoFinal) {
                buscaEstoque.add(p);
            }
        }
        return buscaEstoque;
    }
}


