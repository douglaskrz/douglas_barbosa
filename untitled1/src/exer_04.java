public class exer_04 {
    public static void main(String[] args) {

        Produto p1 = new Produto("", "Riachuelo", 9.99, 10);
        Produto p2 = new Produto("", "Rihappy", 10.99, 10);
        Produto p3 = new Produto("", "", 12.99, 15);
        Produto p4 = new Produto("", "", 900, 69);
        Produto p5 = new Produto("", "", 16.99, 32);

        p1.venderQuantidadeDeEstoque(5);
        System.out.println(p1);

        Loja l1 = new Loja();

        l1.adicionarProduto(p1);
        l1.adicionarProduto(p2);
        l1.adicionarProduto(p3);
        l1.adicionarProduto(p4);
        l1.adicionarProduto(p5);

        System.out.println(l1.produtoMaisCaro("Rihappy"));
        System.out.println(l1.buscaEstoque(11, 20, "Rihappy"));
    }
}