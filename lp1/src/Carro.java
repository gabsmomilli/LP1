import java.util.Objects;

public class Carro {
    private String modelo;
    private String cor;
    private String placa;
    private String marca;
    private double preço;

    public Carro(String modelo, String placa, String cor, String marca, double preço){
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
        this.marca = marca;
        this.preço = preço;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getModelo() {
        return modelo;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getCor() {
        return cor;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getPlaca() {
        return placa;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getMarca() {
        return marca;
    }
    public void setPreço(double preço) {
        this.preço = preço;
    }
    public double getPreço() {
        return preço;
    }

    @Override
    public String toString() {
        return "placa = "+ placa + " ; " +
                "modelo = " + modelo + " ; " +
                "cor = " + cor + " ; " +
                "marca = " + marca + " ; " +
                "preço = " + preço;
    }
}
