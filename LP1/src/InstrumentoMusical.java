public class InstrumentoMusical {
    private String nome;
    private int cordas;
    private String marca;
    private double preço;
    private InstrumentoMusical nivel;

    public InstrumentoMusical(String nome, int cordas, String marca, double preço){
        this.nome = nome;
        this.cordas = cordas;
        this.marca = marca;
        this.preço = preço;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setCordas(int cordas){
        this.cordas = cordas;
    }
    public int getCordas(){
        return cordas;
    }
    public void setNivel(InstrumentoMusical nivel){
        this.nivel = nivel;
    }
    public InstrumentoMusical getNivel(){
        return nivel;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return marca;
    }
    public void setPreço(double preço){
        this.preço= preço;
    }
    public double getPreço(){
        return preço;
    }
    public void mostrarNivel() {
        System.out.println(nome+" "+cordas+" "+marca+" R$"+preço);
        if(nivel != null){
            nivel.mostrarNivel();
        }
    }

}
