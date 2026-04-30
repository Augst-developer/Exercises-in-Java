package Lesson;

public class Conta {
    private int agencia;
    private int numero;
    private Cliente titular;
    protected double saldo;

    public Conta(int agencia, int numero, Cliente titular) {
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format(
                "Agência: %d, Conta: %d, Titular: %s (CPF: %s), Saldo: R$%.2f",
                agencia,
                numero,
                titular.getNome(),
                titular.getCpf(),
                saldo
        );
    }
}
