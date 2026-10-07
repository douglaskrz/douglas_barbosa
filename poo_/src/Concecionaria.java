import java.util.ArrayList;
import java.util.List;

public class Concecionaria {

    private List<Veiculo> veiculos;

    public Concecionaria() {
        veiculos = new ArrayList<Veiculo>();
    }

    public void adicionarVeiculo(Veiculo v){
        veiculos.add(v);
    }

    public Veiculo obterVeiculoMaisBarato(){

        double menorPreco = Double.MAX_VALUE;
        Veiculo veiculoMaisBarato = null;

        for (Veiculo v : veiculos){
            if (v.getPreco() < menorPreco){
                menorPreco = v.getPreco();
                veiculoMaisBarato = v;
            }
        }
        return veiculoMaisBarato;
    }
    
}
