public class aeronave {

    private String modelo;
    private int passageiros;
    private double velocidadeMax;
    private double capacidadeCombustivel;
    private double queimaCombustivel;



        public aeronave(String modelo, int passageiros, double velocidadeMax, double capacidadeCombustivel, double queimaCombustivel){
            setModelo(modelo);
            setPassageiros(passageiros);
            setVelocidadeMax(velocidadeMax);
            setCapacidadeCombustivel(capacidadeCombustivel);
            setQueimaCombustivel(queimaCombustivel);
        }



    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.isBlank()){
            System.out.println("Erro, modelo inválido.");
        }else {
            this.modelo = modelo;
        }
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(double velocidadeMax) {
        if (velocidadeMax == 0){
            System.out.println("Erro, velocidade inválida.");
        }else {
            this.velocidadeMax = velocidadeMax;
        }
    }

    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) {
        if (passageiros < 0){
            System.out.println("Erro, quantidade inválida.");
        }else {
            this.passageiros = passageiros;
        }
    }

    public double getCapacidadeCombustivel() {
        return capacidadeCombustivel;
    }

    public void setCapacidadeCombustivel(double capacidadeCombustivel) {
        if (capacidadeCombustivel == 0){
            System.out.println("Erro, quantidade de combustível inválida.");
        }else {
            this.capacidadeCombustivel = capacidadeCombustivel;
        }
    }

    public double getQueimaCombustivel() {
        return queimaCombustivel;
    }

    public void setQueimaCombustivel(double queimaCombustivel) {
        if (queimaCombustivel == 0){
            System.out.println("Erro, quantidade de queima de combustível inválida.");
        }else {
            this.queimaCombustivel = queimaCombustivel;
        }
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