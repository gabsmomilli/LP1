public class Aluno{
    private String nome;
    private int idade;
    private String RA;
    private String curso;
    private Aluno nivel;

    public Aluno(String nome, int idade, String RA, String curso){
        this.nome = nome;
        this.idade = idade;
        this.RA = RA;
        this.curso = curso;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return idade;
    }
    public void setRA(String Ra){
        this.RA = RA;
    }
    public String getRA(){
        return RA;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }
    public String getCurso(){
        return curso;
    }
    public void setNivel(Aluno nivel){
        this.nivel = nivel;
    }
    public Aluno getNivel() {
        return nivel;
    }
    public void mostrarNivel() {
        System.out.println(nome+" "+idade+" "+RA+" "+curso);
        if(nivel != null){
            nivel.mostrarNivel();
        }
    }
}
