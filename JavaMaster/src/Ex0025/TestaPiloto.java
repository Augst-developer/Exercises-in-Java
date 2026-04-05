public class TestaPiloto {
    public static void main(String [] args){
        Piloto p1 = new Piloto("Joker");
        Piloto p2 = new Piloto("Batman");

        p1.adicionaHoras(201);
        p2.adicionaHoras(199);

        p1.imprime();
        p2.imprime();
    }
}
