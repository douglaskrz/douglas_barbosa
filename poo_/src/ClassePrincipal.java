public class ClassePrincipal {

    public static void main(String[] args) {

        Veiculo v1 = new Veiculo("Honda", "Civic", "XXX1X11", 2010, 45000);
        Veiculo v2 = new Veiculo("Mazda", "Mx3", "aaaaaa", 1997, 50000);
        Veiculo v3 = new Veiculo("Volkswagen", "Gol Polo", "KGB-1A11", 2020, 68000.0);
        Veiculo v4 = new Veiculo("Hyundai", "HB20 Sense", "QWE-4C32", 2024, 85000.0);
        Veiculo v5 = new Veiculo("Fiat", "Argo Drive", "JKL-0F98", 2019, 20000.0);

        Concecionaria c1 = new Concecionaria();

        c1.adicionarVeiculo(v1);
        c1.adicionarVeiculo(v2);

        System.out.println(c1.obterVeiculoMaisBarato());

        Concecionaria c2 = new Concecionaria();

        c2.adicionarVeiculo(v3);
        c2.adicionarVeiculo(v4);
        c2.adicionarVeiculo(v5);

        System.out.println(c2.obterVeiculoMaisBarato());
    }
}
