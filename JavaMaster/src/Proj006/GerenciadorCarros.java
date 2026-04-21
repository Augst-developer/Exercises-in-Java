package Proj006;

public class GerenciadorCarros{
    public static void main(String[] args) {
        
        Carro car1 = new Carro("CarroNovo", 2025, "Ferrari", "296 GTS");
        Carro car2 = new Carro("", 2025,"Lamborghini","Temerario");

        car1.acelerar();
        car2.acelerar();

        car1.parar();
        car2.parar();

        car1.buzinar();
        car2.buzinar();

    }
}