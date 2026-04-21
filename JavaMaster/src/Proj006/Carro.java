package Proj006;

class Carro{
        private String nome;
        private int ano;
        private String marca;
        private String modelo;

        public Carro(String nome, int ano, String marca, String modelo){
            this.nome = nome;
            this.ano = ano;
            this.marca = marca;
            this.modelo = modelo;
        }

        public Carro(){

        }

        //métodos

        public void acelerar(){
            System.out.println("Acelerando...");
        }

        public void parar(){
            System.out.println("Parando...");
        }

        public void buzinar(){
            System.out.println("Buzina falhou, tente novamente...");
        }
}