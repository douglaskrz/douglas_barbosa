import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ExemploArrayList {

    public static void main(String[] args) {

        List<Integer> idades = new ArrayList<Integer>();

        idades.add(22);
        idades.add(13);
        idades.add(25);
        idades.add(20);
        idades.add(18);
        idades.add(29);

        System.out.println(idades);

        System.out.println(idades.contains(25));

        System.out.println(idades.indexOf(22)); // posicao

        System.out.println(idades.size()); // tamanho do arrayList

        System.out.println(idades.getLast()); // ultimo numero

        System.out.println(idades.getFirst()); // primeiro numero

        Collections.sort(idades);


    }
}
