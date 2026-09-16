public class aeronave {

    String modelo;
    int passageiros;
    double velocidadeMax;
    double capacidadeCombustivel;
    double queimaCombustivel;

    public aeronave(String modelo, int passageiros, double velocidadeMax, double capacidadeCombustivel, double queimaCombustivel) {
        this.modelo = modelo;
        this. passageiros = passageiros;
        this.velocidadeMax = velocidadeMax;
        this.capacidadeCombustivel = capacidadeCombustivel;
        this.queimaCombustivel = queimaCombustivel;
    }

    public double calcularAutonomia(){
        return capacidadeCombustivel/queimaCombustivel;
    }

    public double calcularDistanciaMaxima (){
        return calcularAutonomia()*velocidadeMax;
    }

    @Override
    public String toString() {
        return "aeronave{" +
                "modelo='" + modelo + '\'' +
                ", passageiros=" + passageiros +
                ", velocidadeMax=" + velocidadeMax +
                ", capacidadeCombustivel=" + capacidadeCombustivel +
                ", queimaCombustivel=" + queimaCombustivel +
                '}';
    }
}