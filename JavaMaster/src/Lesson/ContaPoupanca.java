package Lesson;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int agencia, int numero, Cliente titular) {
        super(agencia, numero, titular);
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= getSaldo()) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format(
                "Agência: %d, Conta Poupança: %d, Titular: %s (CPF: %s), Saldo: R$%.2f",
                getAgencia(),
                getNumero(),
                getTitular().getNome(),
                getTitular().getCpf(),
                getSaldo()
        );
    }
}
