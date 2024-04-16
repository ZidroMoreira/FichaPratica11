package Ex_01;

import Ex_01.Enum.Armas;
import Ex_01.Enum.Instalacoes;

import java.util.ArrayList;

public class JatoPrivado extends Aviao {
    private int lotacao;
    private double capacidadeBagagem;
    private ArrayList<Instalacoes> instalacoes;

    public JatoPrivado(int numSerie, String modelo, int anoFabrico, double peso, double fuselagem, double envergadura, int nMotores, double autonomia, double velocidade_max, double preco, int lotacao, double capacidadeBagagem) {
        super(numSerie, modelo, anoFabrico, peso, fuselagem, envergadura, nMotores, autonomia, velocidade_max, preco);
        this.lotacao = lotacao;
        this.capacidadeBagagem = capacidadeBagagem;
        this.instalacoes = new ArrayList<Instalacoes>();
    }
    public void addInstalacoes(Instalacoes adicionarInstalacoes){
        this.instalacoes.add(adicionarInstalacoes);

    }


}
