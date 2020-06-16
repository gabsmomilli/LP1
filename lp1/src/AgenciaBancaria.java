import java.util.*;

public class AgenciaBancaria {
    private List<Conta> conta = new ArrayList<>();
    private Set<String> CPFClientes;

    public List<Conta> getConta() {
        return conta;
    }
    public void setConta(List<Conta> conta) {
        this.conta = conta;
    }
    public Set<String> getCPFClientes() {
        return CPFClientes;
    }
    public void setCPFClientes(Set<String> CPFClientes) {
        this.CPFClientes = CPFClientes;
    }

    public void adicionarConta(Conta conta){
        System.out.println("Adicionando conta: "+ conta.getNumero());
        this.conta.add(conta);
    }
    public void apagarConta(Conta conta){
        int j = -1;
        for(int i = 0; i < this.conta.size(); i++){
            if(this.conta.get(i).getNumero() == conta.getNumero() && this.conta.get(i).getAgencia() == conta.getAgencia()) {
                j = i;
            }
        }
        if(j >= 0){
            this.conta.remove(j);
            System.out.println("Apagando conta: "+ conta.getNumero());
        }
    }
    public void listarDadosPessoa(String cpf){
        for(int i = 0; i < this.conta.size(); i++){
            if(this.conta.get(i).getTitular().getCpf().equals(cpf)){
                System.out.println(this.conta.get(i).getTitular());
            }
        }

    }
}
