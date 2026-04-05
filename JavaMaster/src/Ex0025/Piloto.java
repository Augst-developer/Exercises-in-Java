public class Piloto {
    //atributo
    private int qtdHoras;
    private String nome;

    //construtor
    public Piloto(String nome){
        this.nome = nome;
        qtdHoras = 0;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void adicionaHoras(int horas){
        qtdHoras = qtdHoras + horas;
    }

    public void imprime(){
        System.out.println("Nome "+ nome);
        System.out.println("Horas "+ qtdHoras);
        if(qtdHoras > 200) {
            System.out.println("Comandante");
        }else{
            System.out.println("Co-Piloto");
        }
    }
}
