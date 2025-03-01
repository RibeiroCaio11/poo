import java.util.Scanner;


 
public class Animal{
    
        String nome;
        String tipo;
        private String som;

        Scanner leitor = new Scanner(System.in);
    
    public void AdicionarInfo(){
        System.out.println("Nome:");
        nome =leitor.nextLine();
        System.out.println("Som:");
        som = leitor.nextLine();
        System.out.println("Tipo:");
        tipo = leitor.nextLine();
    }
    
    public void setSom(String som){
        this.som = som;
    }

    public void dormir(){
        System.out.println("O "+ nome + " Dormindo");
        System.out.println("zZZZ");
    }


    public void Mostrarinfo(){ 
        
        System.out.println("Nome:"+ nome +",Som:"+ som +",Tipo:"+ tipo);
 }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.AdicionarInfo();
        
        animal.Mostrarinfo();
        
        animal.dormir();

        animal.setSom("miau");
        
        animal.Mostrarinfo();
    





    }
}