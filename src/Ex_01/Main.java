package Ex_01;

import Ex_01.Enum.Armas;
import Ex_01.Enum.Instalacoes;

public class Main {

    public static void main(String[] args) {
        JatoPrivado cr7 = new JatoPrivado(541212,"Famel",1989,1000,20,20,4,1000,500,100000,10,500);
        cr7.addInstalacoes(Instalacoes.Cinema);
        cr7.addInstalacoes(Instalacoes.WC);
        cr7.addInstalacoes(Instalacoes.Cozinha);

        AviaoCombate Flecha = new AviaoCombate(156321,"Ferrari",1880,2000,5,5,4,500,300,20000,"Portugal",true);
        Flecha.adicionarArmas(Armas.Bombas);
        Flecha.adicionarArmas(Armas.Foguetes);
        Flecha.adicionarArmas(Armas.Metralhadoras);
        Flecha.adicionarArmas(Armas.Torpedos);

        Catalogo catalogo2024 = new Catalogo();
        catalogo2024.addavioes(cr7);
        catalogo2024.addavioes(Flecha);

        catalogo2024.totalCatalogo();
    }
}
