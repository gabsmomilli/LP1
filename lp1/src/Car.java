import java.util.ArrayList;
import java.util.List;

public class Car {
    public static void main (String[] args){
        Carro carroA = new Carro("Hilux","GAB-2001","preto","Toyota",  119.990);
        Carro carroB = new Carro("Onix","RAM-2001","vermelho","Chevrolet",50.890);
        Carro carroC = new Carro("HB20","SHI-1965","branco","Hyundai",46.490);
        Carro carroD = new Carro("Polo","RAF-2012","cinza","Volkswagen",55.890);
        Carro carroE = new Carro("Ford Mustang","AHT-1243","preto","Ford",315.900);


        Concessionaria concessionaria = new Concessionaria();
        concessionaria.getCarros().add(carroA);
        concessionaria.getCarros().add(carroB);
        concessionaria.getCarros().add(carroC);
        concessionaria.getCarros().add(carroD);
        concessionaria.getCarros().add(carroE);

        concessionaria.getTabela_placaCar_preço().put(carroA.getPlaca(),carroA);
        concessionaria.getTabela_placaCar_preço().put(carroB.getPlaca(),carroB);
        concessionaria.getTabela_placaCar_preço().put(carroC.getPlaca(),carroC);
        concessionaria.getTabela_placaCar_preço().put(carroD.getPlaca(),carroD);
        concessionaria.getTabela_placaCar_preço().put(carroE.getPlaca(),carroE);


        concessionaria.listarCarros();
        concessionaria.imprimirTabelaPreco();
        concessionaria.listarDadosCarro();
    }
}
