package Ejercicio4;

public class Conta {
    private String nomeCliente;
    private String numeroConta;
    private double tipoInterese;
    private double saldo;

    // Construtores
    public Conta() {
        nomeCliente = "";
        numeroConta = "";
        tipoInterese = 0.0;
        saldo = 0.0;
    }

    public Conta(String nomeCliente, String numeroConta, double tipoInterese, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
        this.tipoInterese = tipoInterese;
        this.saldo = saldo;
    }

    // Métodos
    public void ingreso(double cant) {
        if (cant > 0) saldo += cant;
    }

    public void reintegro(double cant) {
        if (cant > 0 && cant <= saldo) saldo -= cant;
    }

    public void transferencia(Conta destino, double importe) {
        if (importe > 0 && this.saldo >= importe) {
            this.saldo -= importe;
            destino.saldo += importe;
        }
    }

    // Getters e Setters
    public String getNomeCliente() { return nomeCliente; }
    public void setNomeCliente(String nomeCliente) { this.nomeCliente = nomeCliente; }

    public String getNumeroConta() { return numeroConta; }
    public void setNumeroConta(String numeroConta) { this.numeroConta = numeroConta; }

    public double getTipoInterese() { return tipoInterese; }
    public void setTipoInterese(double tipoInterese) { this.tipoInterese = tipoInterese; }

    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }
}