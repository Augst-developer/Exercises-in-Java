package Proj001;

public class Fornecedor extends Pessoa {
    public Fornecedor() {
        super();
    }
    public Fornecedor(String n, String f) {
        super(n, f);
    }
    public void print() {
        super.print();
        System.out.println("Dados do fornecedor");
    }
}

