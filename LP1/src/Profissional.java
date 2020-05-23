public class Profissional {
    private String nome;
    private String profissão;
    private int idade;
    private Profissional nivel;

    public Profissional(String nome, String profissão, int idade){
        this.nome = nome;
        this.profissão = profissão;
        this.idade = idade;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setProfissão(String profissão){
        this.profissão = profissão;
    }
    public String getProfissão(){
        return profissão;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return idade;
    }
    public void setNivel(Profissional nivel) {
        this.nivel = nivel;
    }
    public Profissional getNivel() {
        return nivel;
    }
    public void mostrarNivel() {
        System.out.println(nome+" "+profissão+" "+idade);
        if(nivel != null){
            nivel.mostrarNivel();
        }
    }
}
