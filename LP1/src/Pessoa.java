public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
    private int telefone;
    private Pessoa nivel;

    public Pessoa(String nome, int idade, String cpf, int telefone){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.telefone = telefone;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return idade;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getCpf(){
        return cpf;
    }
    public void setTelefone(int telefone){
        this.telefone = telefone;
    }
    public int getTelefone(){
        return telefone;
    }
    public void setNivel(Pessoa nivel){
        this.nivel = nivel;
    }
    public Pessoa getNivel() {
        return nivel;
    }
    public void mostrarNivel() {
        System.out.println(nome+" "+idade+" "+cpf+" "+telefone);
        if(nivel != null){
            nivel.mostrarNivel();
        }
    }
}