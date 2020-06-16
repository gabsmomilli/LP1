import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class AgenciaViagens {
    private List<Lugar> lugares = new ArrayList<>();
    private Set<String> CPFClientes;

    public List<Lugar> getLugares() {
        return lugares;
    }
    public void setLugares(List<Lugar> lugares) {
        this.lugares = lugares;
    }
    public Set<String> getCPFClientes() {
        return CPFClientes;
    }
    public void setCPFClientes(Set<String> CPFClientes) {
        this.CPFClientes = CPFClientes;
    }

    public void adicionarViagem(Lugar lugar){
        System.out.println("Adicionando viagem: "+ lugar.getCep());
        this.lugares.add(lugar);
    }
    public void listarDadosDestino(String cep){
        for(Lugar lug : this.lugares){
            if(lug.getCep().equals(cep)){
                System.out.println(lug.toString());
            }
        }

    }
    public void listarDadosPessoa(String cpf) {
        for(Lugar lug : this.lugares){
            if(lug.getPessoa().getCpf().equals(cpf)){
                System.out.println(lug.getPessoa().toString());
            }
        }
    }
}
