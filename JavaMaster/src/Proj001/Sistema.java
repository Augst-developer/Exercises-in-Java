package Proj001;

public class Sistema {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Bruce Wayne Junior", "11 98765-4321");
        Fornecedor fornecedor1 = new Fornecedor("Empresa XYZ", "11 2345-6789");
        cliente1.print();
        System.out.println();
        fornecedor1.print();
    }
}
