import java.util.ArrayList;
import java.util.List;

public class listaRetangulos {

    private List<retangulo> retangulos;

    public listaRetangulos(){
        retangulos = new ArrayList<retangulo>();
    }

    public void adicionarRetangulos(retangulo r){
        retangulos.add(r);
    }

    public retangulo maiorAreaRetangulo(){

        double  maiorArea = Double.MIN_VALUE;
        retangulo retanguloMaior = null;

        for (retangulo r : retangulos){
            if (r.area()>maiorArea){
            maiorArea = r.area();
            retanguloMaior = r;
            }
        }

        return retanguloMaior;
    }

    public retangulo maiorPerimetroRetangulo(){

        double  maiorPerimetro = Double.MIN_VALUE;
        retangulo perimetroMaior = null;

        for (retangulo r : retangulos){
            if (r.perimetro()>maiorPerimetro){
                maiorPerimetro = r.perimetro();
                perimetroMaior = r;
            }
        }

        return perimetroMaior;
    }
    }



