import java.util.*;

public class Concessionaria {
    private List<Carro> carros = new ArrayList<>();
    private Map<String, Carro> tabela_placaCar_preço = new HashMap<>();

    public Map<String, Carro> getTabela_placaCar_preço() {
        return tabela_placaCar_preço;
    }

    public void setTabela_placaCar_preço(Map<String, Carro> tabela_placaCar_preço) {
        this.tabela_placaCar_preço = tabela_placaCar_preço;
    }

    public List<Carro> getCarros() {
        return this.carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }

    public void listarCarros(){
        for (Carro carro : this.carros) {
            System.out.println("Placa: " + carro.getPlaca());
        }
    }
    public void imprimirTabelaPreco(){
        for( Map.Entry<String, Carro> entry : tabela_placaCar_preço.entrySet()) {
            System.out.println("Preço: " + entry.getValue().getPreço());
        }
    }

    public void listarDadosCarro(){
        for( Map.Entry<String, Carro> entry : tabela_placaCar_preço.entrySet()) {
            System.out.println("Carro: " + entry.getValue());
        }
    }
}


