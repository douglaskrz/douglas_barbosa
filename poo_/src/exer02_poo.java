public class exer02_poo {

    public static void main(String[] args) {

        mercado unidadeJoinville = new mercado("Giassi", 500, 2, 400, 2.5);
        mercado unidadeBlumenau = new mercado("Angeloni", 450, 1.8, 420, 2.2);
        mercado unidadeFlorianopolis = new mercado("Fort", 500, 2, 470, 2.4);

        mercado mercados[] = { unidadeBlumenau, unidadeFlorianopolis, unidadeJoinville };

        double maiorReceitaMacas = 0;

        mercado mercadoMaiorReceitaMacas = null;

        for (int i = 0; i < mercados.length; i++) {

            if (mercados[i].calcularReceitaMacas() > maiorReceitaMacas) {
                maiorReceitaMacas = mercados[i].calcularReceitaMacas();
                mercadoMaiorReceitaMacas = mercados[i];
            }
        }

        System.out.println("Quem teve a maior receita de maçãs: " + mercadoMaiorReceitaMacas + " faturou: "
                + mercadoMaiorReceitaMacas.calcularReceitaMacas());

        double menorReceitaLaranjas = Double.MAX_VALUE;

        mercado mercadoMenorReceitaLaranjas = null;


        for (int i = 0; i < mercados.length; i++) {

            if (mercados[i].calcularReceitaLaranjas() < menorReceitaLaranjas) {

                menorReceitaLaranjas = mercados[i].calcularReceitaLaranjas();

                mercadoMenorReceitaLaranjas = mercados[i];
            }
        }

        System.out.println("Quem teve a menor receita de laranjas: " + mercadoMenorReceitaLaranjas
                + " que vendeu R$" + mercadoMenorReceitaLaranjas.calcularReceitaLaranjas());

        double segundaMaiorReceitaTotal = 0;

        mercado mercadoSegundaMaiorReceitaTotal = null;

        double maiorReceitaTotal = 0;

        for (int i = 0; i < mercados.length; i++) {

            if (mercados[i].calcularReceitaTotal() > maiorReceitaTotal) {

                maiorReceitaTotal = mercados[i].calcularReceitaTotal();
            }
        }

        for (int i = 0; i < mercados.length; i++) {

            if (mercados[i].calcularReceitaTotal() > segundaMaiorReceitaTotal
                    && mercados[i].calcularReceitaTotal() != maiorReceitaTotal) {

                segundaMaiorReceitaTotal = mercados[i].calcularReceitaTotal();
                mercadoSegundaMaiorReceitaTotal = mercados[i];
            }
        }

        System.out.println(
                "Mercado que teve a segunda maior receita total: " + mercadoSegundaMaiorReceitaTotal);

        double receitaGeralMacas = 0;
        double receitaGeralLaranjas = 0;

        for (int i = 0; i < mercados.length; i++) {
            receitaGeralLaranjas += mercados[i].calcularReceitaLaranjas();
            receitaGeralMacas += mercados[i].calcularReceitaMacas();
        }

        if (receitaGeralMacas > receitaGeralLaranjas) {
            System.out.println("A franquia teve uma receita maior com maçãs");
        } else if (receitaGeralLaranjas > receitaGeralMacas) {
            System.out.println("A franquia teve uma receita maior com laranjas");
        } else {
            System.out.println("As receitas foram iguais");
        }
    }
}


