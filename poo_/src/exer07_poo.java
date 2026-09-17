public class exer07_poo {

    public static void main(String[] args) {

    aeronave zeroUm = new aeronave("zeroUM", 500, 1000.00, 300000.00, 67.00);
    aeronave zeroDois = new aeronave("zeroDOIS", 988, 1.00,250000.00, 45.00);
    aeronave zeroTres = new aeronave("zeroTRES", 876, 1.00, 200000.00, 50.00);
    aeronave zeroQuatro = new aeronave("zeroQUATRO", 700, 1.00, 290000.00, 33.00);

        zeroUm.setModelo("zeroUmUm");
        System.out.println(zeroUm.getModelo());

        zeroDois.setPassageiros(-30);
        System.out.println(zeroDois.getPassageiros());

        zeroTres.setVelocidadeMax(3);
        System.out.println(zeroDois.getVelocidadeMax());

        zeroQuatro.setCapacidadeCombustivel(2);
        System.out.println(zeroQuatro.getCapacidadeCombustivel());


        aeronave[] aeronaves = { zeroUm, zeroDois, zeroTres, zeroQuatro};

        double maiorPassageiros =0;
        aeronave aeronaveMaiorPassageiros = null;

        for (int i = 0; i < aeronaves.length; i++){

            if (aeronaves[i].getPassageiros() > maiorPassageiros){
                maiorPassageiros = aeronaves[i].getPassageiros();
                aeronaveMaiorPassageiros = aeronaves[i];
            }
        }

        double maiorAutonomia = 0;
        aeronave aeronaveMaiorAutonomia = null;

        for (int i = 0; i < aeronaves.length; i++){
            if (aeronaves[i].calcularAutonomia() > maiorAutonomia){
                maiorAutonomia = aeronaves[i].calcularAutonomia();
                aeronaveMaiorAutonomia = aeronaves[i];
            }
        }

        double maiorDistancia = 0;
        aeronave aeronaveMaiorDistancia = null;

        for (int i = 0; i < aeronaves.length; i++){
            if (aeronaves[i].calcularDistanciaMaxima() > maiorDistancia){
                maiorDistancia = aeronaves[i].calcularDistanciaMaxima();
                aeronaveMaiorDistancia = aeronaves[i];
            }
        }

    }

}
