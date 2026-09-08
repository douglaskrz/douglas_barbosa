public class exer02_poo {

    public static void main(String[] args) {

        mercado unidadeJoinville = new mercado();

        unidadeJoinville.nomeMercado = "Carol";
        unidadeJoinville.macasVendidas = 350;
        unidadeJoinville.precoMaca = 2;
        unidadeJoinville.laranjasVendidas = 200;
        unidadeJoinville.precoLaranja = 2;

        mercado unidadeBlumenau = new mercado();

        unidadeBlumenau.nomeMercado = "Giassi";
        unidadeBlumenau.macasVendidas = 250;
        unidadeBlumenau.precoMaca = 1.9;
        unidadeBlumenau.laranjasVendidas = 750;
        unidadeBlumenau.precoLaranja = 2.7;

        mercado unidadeFlorianopolis = new mercado();

        unidadeFlorianopolis.nomeMercado = "Cooper";
        unidadeFlorianopolis.macasVendidas = 700;
        unidadeFlorianopolis.precoMaca = 2;
        unidadeFlorianopolis.laranjasVendidas = 670;
        unidadeFlorianopolis.precoLaranja = 2.5;

        System.out.println(unidadeBlumenau.nomeMercado + " vendeu " + unidadeBlumenau.macasVendidas + " maçãs a R$"
                + unidadeBlumenau.precoMaca);

        System.out.println(unidadeFlorianopolis.nomeMercado + " vendeu " + unidadeFlorianopolis.laranjasVendidas + " laranjas a R$"
                + unidadeFlorianopolis.precoLaranja);

    }
}


