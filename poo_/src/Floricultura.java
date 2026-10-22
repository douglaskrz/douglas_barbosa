import java.util.ArrayList;
import java.util.List;

    public class Floricultura {

        private List<flor> flores;

        public Floricultura() {
            flores = new ArrayList<flor>();
        }

        public void adicionarFlor(flor f) {
            flores.add(f);
        }

        public List<flor> pesquisarFlores(String nomeCliente) {
            List<flor> floresPesquisa = new ArrayList<flor>();
            for (flor f : flores) {
                if (f.getNomeCliente().equals(nomeCliente)) {
                    floresPesquisa.add(f);
                }
            }
            return floresPesquisa;
        }
    }

