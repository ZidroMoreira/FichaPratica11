package Ex_01;

public class Aviao {
    private int numSerie;
    private String modelo;
    private int anoFabrico;
    private double peso;
    private double fuselagem;
    private double envergadura;
    private int nMotores;
    private double autonomia;
    private double velocidade_max;
    private double preco;

    public Aviao(int numSerie, String modelo, int anoFabrico, double peso, double fuselagem, double envergadura, int nMotores, double autonomia, double velocidade_max, double preco) {
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.peso = peso;
        this.fuselagem = fuselagem;
        this.envergadura = envergadura;
        this.nMotores = nMotores;
        this.autonomia = autonomia;
        this.velocidade_max = velocidade_max;
        this.preco = preco;
    }

    public void imprimeDetalhes() {
        System.out.println("Nr.Serie:" + this.numSerie);
        System.out.println("Modelo:" + this.modelo);
        System.out.println("Ano Fabrico " + this.anoFabrico);
        System.out.println("Peso" + this.peso);
        System.out.println("Fuselagem" + this.fuselagem);
        System.out.println("Envergadura" + this.envergadura);
        System.out.println("NºMotores" + this.nMotores);
        System.out.println("Autonomia" + this.autonomia);
        System.out.println("Velocidade Maxima" + this.velocidade_max);
        System.out.println("Preço" + this.preco);

    }

    public double getPreco() {
        return preco;
    }
}
