public class Carro {
    String marca;
    String modelo;
    int ano;
    boolean ligado;

    Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.ligado = false;

    }


    public void Ligar(){
        ligado = true;
        System.out.println("Carro ligado!");
    }   
    public void Desligar(){
        ligado = false;
        System.out.println("Carro desligado!");
        
    }   


    public void Mostrarinfo(){
        System.out.println(" Marca: " + marca + " Modelo " + modelo + " Ano "+ ano + " Ligado: " + ligado);
    }

public static void main(String[] args){
    Carro carro = new Carro("Ford", "Fiesta", 2020);    
    carro.Mostrarinfo();
    carro.Ligar();
    carro.Mostrarinfo();
    carro.Desligar();
    carro.Mostrarinfo();
}

}