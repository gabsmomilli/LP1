public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
    private long telefone;

    public Pessoa (String nome, int idade, String cpf, long telefone){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCpf() {
        return cpf;
    }
    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public long getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cpf='" + cpf + '\'' +
                ", telefone=" + telefone +
                '}';
    }
}

