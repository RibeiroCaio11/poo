import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Sala{
    private String nome;
    private Boolean reservada;
    
    //construtor
    public Sala(String nome){
        this.nome = nome;
        this.reservada = false;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public Boolean isReservada(){
        return this.reservada;
    }
    
    public void reservar(){
        this.reservada = true;
    }
    
    public void cancelar(){
        this.reservada = false;
    }
}

class GerenciarSalas{
    private Map<String,Sala> salas = new HashMap<>();
    
    //construtor
    public GerenciarSalas(){
        salas.put("Sala A", new Sala("Sala A"));
        salas.put("Sala B", new Sala("Sala B"));
        salas.put("Sala C", new Sala("Sala C"));
        salas.put("Sala D", new Sala("Sala D"));
        salas.put("Sala E", new Sala("Sala E"));
    }
    
  
    public void listarSalas(){
        for(Sala sala: salas.values()){
            System.out.println(sala);
        }
    }
      
    public void reservarSala(String nome){
        Sala sala = salas.get(nome);
        if(sala==null){
            System.out.println("Sala não encontrada!");
        }else if(sala.isReservada()){
            System.out.println("Sala já reservada!");
        }else{
            sala.reservar();
            System.out.println("Sala reservada com sucesso!");;
        }
    }
      
    public void cancelarReserva(String nome){
        Sala sala = salas.get(nome);
        if(sala==null){
            System.out.println("Sala não encontrada!");
        }else if(!sala.isReservada()){
            System.out.println("Sala não está reservada!");
        }else{
            sala.cancelar();
            System.out.println("Sala cancelada com sucesso!");
        }      
    }
}

public class SalasProf{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        GerenciarSalas gerenciador = new GerenciarSalas();
        int opcao;
        String nome;
        do{
            System.out.println(" Menu de Opções");    
            System.out.println(" 1 - Listar Salas");    
            System.out.println(" 2 - Reservar Sala");    
            System.out.println(" 3 - Cancelar Reserva");    
            System.out.println(" 4 - Sair");    
            System.out.print("opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch(opcao){
                case 1:
                    gerenciador.listarSalas();
                    break;
                case 2:
                    System.out.print("Entre com o nome da sala: ");
                    nome = scanner.nextLine();
                    gerenciador.reservarSala(nome);
                    break;
                case 3:
                    System.out.print("Entre com o nome da sala: ");
                    nome = scanner.nextLine();
                    gerenciador.cancelarReserva(nome);
                    break;
                case 4:
                    System.out.print("Finalizando...");
                    break;
            }
            
        }while(opcao!=4);
    }
}