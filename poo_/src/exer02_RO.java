public class exer02_RO {

        public static void main(String[] args) {

            flor f1 = new flor("Rosa1", 60, "B");
            flor f2 = new flor("Rosa2", 50, "A");
            flor f3 = new flor("Lírio", 40, "Lara");
            flor f4 = new flor("Rosa3", 100, "Joao");

            Floricultura floricultura = new Floricultura();

            floricultura.adicionarFlor(f1);
            floricultura.adicionarFlor(f2);
            floricultura.adicionarFlor(f3);
            floricultura.adicionarFlor(f4);

            System.out.println(floricultura.pesquisarFlores("Caio"));
        }
    }

