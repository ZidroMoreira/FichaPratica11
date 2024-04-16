package Ex_01;

import java.util.ArrayList;

public class Catalogo {
    private ArrayList<Aviao> listaAvioes;

    public Catalogo() {
        this.listaAvioes = new ArrayList<Aviao>();
    }

    public void addavioes(Aviao aviaoAdicionar) {
        this.listaAvioes.add(aviaoAdicionar);
    }

    public void removeAvioes(Aviao aviaoRemover) {
        this.listaAvioes.remove(aviaoRemover);

    }

    public void totalCatalogo() {
        double total = 0;
        for (Aviao aviaoatual : this.listaAvioes) {
            total += aviaoatual.getPreco();

        }
        System.out.println("Total do Catalogo de Avioes :" + total +" Euros");
    }
}
