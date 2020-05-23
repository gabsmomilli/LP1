public class Calçado {
    private String marca;
    private int num;
    private String sexo;
    private String tipo;
    private double preço;
    private Calçado nivel;

    public Calçado(String marca, int num, String sexo, String estilo, int preço){
        this.marca = marca;
        this.num = num;
        this.sexo = sexo;
        this.tipo = estilo;
        this.preço = preço;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getMarca(){
        return marca;
    }
    public void setNum(int num){
        this.num = num;
    }
    public int getNum(){
        return num;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public String getSexo(){
        return sexo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setPreço(double preço) {
        this.preço = preço;
    }
    public double getPreço() {
        return preço;
    }
    public void setNivel(Calçado nivel) {
        this.nivel = nivel;
    }
    public Calçado getNivel() {
        return nivel;
    }
    public void mostrarNivel() {
        System.out.println(marca+" "+num+" "+sexo+" "+ tipo+" "+preço);
        if(nivel != null) {
            nivel.mostrarNivel();
        }
    }

    public void mostrarNIvel() {
    }
}