/*
Descrição: Você foi encarregado de criar um sistema de reservas simples para as salas de reunião de uma empresa.
 O sistema deve permitir que um usuário possa visualizar as salas disponíveis, fazer uma reserva ou cancelar uma reserva existente.
Especificações:
Salas Disponíveis: A empresa possui 5 salas de reunião nomeadas: Sala A, Sala B, Sala C, Sala D e Sala E.
Menu de Opções: Quando o programa iniciar, o usuário deve ser apresentado a um menu com as seguintes opções:
1. Listar salas disponíveis.
2. Reservar uma sala.
3. Cancelar reserva de uma sala.
4. Sair.
Listar Salas Disponíveis: Ao selecionar esta opção, o programa deve mostrar todas as salas e indicar se estão disponíveis ou reservadas.
Reservar uma Sala: O usuário deve ser capaz de selecionar uma sala disponível e reservá-la.
 Se a sala já estiver reservada, o programa deve informar ao usuário que a sala não está disponível.
Cancelar Reserva de uma Sala: O usuário deve ser capaz de selecionar uma sala reservada e cancelar sua reserva. 
Se a sala não tiver uma reserva, o programa deve informar ao usuário.
*/
import java.util.ArrayList;

class Salas {
   private boolean disponivel;
   private String reservado;
    String sala;

    public Salas(String sala,boolean disponivel, String reservado){
         this.sala = sala;
         this.disponivel = true;
         this.reservado = "";
    }
    //metodos

      ArrayList.


 void   Listar(){
    System.out.println("Salas:")
    ;
 }
    
 


  void Reservar(){
    if(disponivel == true){
        disponivel = false;
        reservado = "Reservado";
        System.out.println("Sala Reservada com Sucesso");

 }
    else{
    System.out.println("Sala já reservada");
 }
  }

 void Cancelar(){
    if(disponivel == false){
        disponivel = true;
        reservado = "Não Reservado";
        System.out.println("Reserva Cancelada com sucesso");

    }
    else{
        System.out.println("Essa sala não esta reservada"); 

    }

 }
}
 













