public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Pessoa titular;

    public Conta(double saldo, int agencia, int numero, Pessoa titular){
        this.saldo = saldo;
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public int getAgencia() {
        return agencia;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getNumero() {
        return numero;
    }
    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public Pessoa getTitular() {
        return titular;
    }
}
