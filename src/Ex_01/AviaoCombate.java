package Ex_01;

import Ex_01.Enum.Armas;

import java.util.ArrayList;

public class AviaoCombate extends Aviao {
    private String paisOrigem;
    private Boolean camuflagem;
    private ArrayList<Armas> armamento;

    public AviaoCombate(int numSerie, String modelo, int anoFabrico, double peso, double fuselagem, double envergadura, int nMotores, double autonomia, double velocidade_max, double preco, String paisOrigem, Boolean camuflagem) {
        super(numSerie, modelo, anoFabrico, peso, fuselagem, envergadura, nMotores, autonomia, velocidade_max, preco);
        this.paisOrigem = paisOrigem;
        this.camuflagem = camuflagem;
        this.armamento = new ArrayList<Armas>();
    }

    public void adicionarArmas(Armas armas) {
        if (this.armamento.size()<3){
            this.armamento.add(armas);
        }else{
            System.out.println("Capacidade Armamento maximo atinjido ");
        }
    }
    public void verDetalhes(){



    }

    public void removerArmas(Armas armas) {
        this.armamento.remove(armas);
    }

}
