public class Lugar {
    private String nome;
    private Lugar nivel;

    public Lugar(String nome, Lugar nivel){
        this.nome = nome;
        this.nivel = nivel;
    }
    public Lugar(String nome){
        this.nome = nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNivel(Lugar nivel){
        this.nivel = nivel;
    }
    public Lugar getNivel() {
        return nivel;
    }
    public void mostrarNivel() {
        System.out.println(nome);
        if(nivel != null) {
            nivel.mostrarNivel();
        }
    }
}