import java.util.HashSet;
import java.util.Set;

public class Agencia {
    public static void main (String[] args){
        Pessoa pessoaA = new Pessoa ("Gabriela",19,"12345465469",988452563);
        Pessoa pessoaB = new Pessoa ("Gabi",19,"15464685687",988455445);
        Pessoa pessoaC = new Pessoa ("Ramon",19,"23465454688",988453546);
        Pessoa pessoaD = new Pessoa ("Carla",34,"35454684653",988545454);
        Pessoa pessoaE = new Pessoa ("Giuliano",32,"56484548545",988452546);

        Conta contaA = new Conta(300.00, 123, 123545678, pessoaA);
        Conta contaB = new Conta(500.00, 153, 123745678, pessoaB);
        Conta contaC = new Conta(500.00, 147, 987654324, pessoaC);
        Conta contaD = new Conta(700.00, 159, 159951125, pessoaD);
        Conta contaE = new Conta(900.00, 157, 147852369, pessoaE);

        AgenciaBancaria agenciaBancaria = new AgenciaBancaria();
        agenciaBancaria.adicionarConta(contaA);
        agenciaBancaria.adicionarConta(contaB);
        agenciaBancaria.adicionarConta(contaC);
        agenciaBancaria.adicionarConta(contaD);
        agenciaBancaria.adicionarConta(contaE);

        Set<String> CPFClientes = new HashSet<>();
        CPFClientes.add(pessoaA.getCpf());
        CPFClientes.add(pessoaB.getCpf());
        CPFClientes.add(pessoaC.getCpf());
        CPFClientes.add(pessoaD.getCpf());
        CPFClientes.add(pessoaE.getCpf());

        agenciaBancaria.listarDadosPessoa("56484548545");
        agenciaBancaria.apagarConta(contaB);




    }
}
