package Proj001;

public class Cliente extends Pessoa {
    public Cliente() {
        super();
    }
    public Cliente(String n, String f) {
        super(n, f);
    }
    public void print() {
        super.print();
        System.out.println("Dados do cliente");
    }
}

