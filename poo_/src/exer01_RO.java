public class exer01_RO {

    public static void main(String[] args) {

        retangulo r1 = new retangulo(1.5, 2.0);
        retangulo r2 = new retangulo(3.0, 3);
        retangulo r3 = new retangulo(30.0, 20.0);
        retangulo r4 = new retangulo(25.0, 30.0);
        retangulo r5 = new retangulo(32.0, 35.0);

        listaRetangulos lr1 = new listaRetangulos();

        lr1.adicionarRetangulos(r1);
        lr1.adicionarRetangulos(r2);

        System.out.println(lr1.maiorAreaRetangulo());
        System.out.println(lr1.maiorPerimetroRetangulo());

    }



}
