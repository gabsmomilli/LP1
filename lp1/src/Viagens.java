import java.util.HashSet;
import java.util.Set;

public class Viagens {
    public static void main(String[] args) {
        Pessoa pessoaA = new Pessoa ("Gabriela",19,"12345465469",988452563);
        Pessoa pessoaB = new Pessoa ("Gabi",19,"15464685687",988455445);
        Pessoa pessoaC = new Pessoa ("Ramon",19,"23465454688",988453546);
        Pessoa pessoaD = new Pessoa ("Carla",34,"35454684653",988545454);
        Pessoa pessoaE = new Pessoa ("Giuliano",32,"56484548545",988452546);

        Lugar lugarA = new Lugar ("Brasil","São Paulo", "São José dos Campos","Goiania",147,"12785236", pessoaA);
        Lugar lugarB = new Lugar ("Japão","Tokai", "Nagoya","Uonotana-dari",158,"20464646", pessoaB);
        Lugar lugarC = new Lugar ("Brasil","Parana", "Ibaiti","Treze de Maio",135,"12525445", pessoaC);
        Lugar lugarD = new Lugar ("Brasil","Alagoas", "Maceio","Hamilton de Barros Soutinho",9856,"12547896", pessoaD);
        Lugar lugarE = new Lugar ("Brasil","São Paulo", "São José dos Campos","Petunias",77,"12785245", pessoaE);

        AgenciaViagens agenciaViagens = new AgenciaViagens();
        agenciaViagens.adicionarViagem(lugarA);
        agenciaViagens.adicionarViagem(lugarB);
        agenciaViagens.adicionarViagem(lugarC);
        agenciaViagens.adicionarViagem(lugarD);
        agenciaViagens.adicionarViagem(lugarE);

        Set<String> CPFClientes = new HashSet<>();
        CPFClientes.add(pessoaA.getCpf());
        CPFClientes.add(pessoaB.getCpf());
        CPFClientes.add(pessoaC.getCpf());
        CPFClientes.add(pessoaD.getCpf());
        CPFClientes.add(pessoaE.getCpf());

        agenciaViagens.listarDadosDestino("12785245");
        agenciaViagens.listarDadosPessoa("12345465469");
    }
}
