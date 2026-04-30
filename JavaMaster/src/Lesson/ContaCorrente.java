package Lesson;

public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    public ContaCorrente(int agencia, int numero, Cliente titular, double limiteChequeEspecial) {
        super(agencia, numero, titular);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= getSaldo() + limiteChequeEspecial) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format(
                "Agência: %d, Conta Corrente: %d, Titular: %s (CPF: %s), Saldo: R$%.2f, Limite do cheque especial: R$%.2f",
                getAgencia(),
                getNumero(),
                getTitular().getNome(),
                getTitular().getCpf(),
                getSaldo(),
                limiteChequeEspecial
        );
    }
}