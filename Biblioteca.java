import java.util.ArrayList;

class Livro{
     private String titulo;
     private String autor;
     private int anoPublicacao;

     public Livro(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao; 
     }

       public String getTitulo(){
        return this.titulo;
       }

       public String getAutor(){
        return this.autor;
       }

        public void  setTitulo(String titulo){
            System.out.println("Digite o titulo: ");
           this.titulo = titulo;
        }
        public void setAutor(String autor){
            System.out.println("Digite o autor: ");
            this.autor = autor;

        }
        public void setAnoPublicacao(int anoPublicacao){
            System.out.println("Digite do ano publicação: ");
            if(anoPublicacao< 0){
                System.out.print("Ano não existe");
                System.out.println("Digite o ano novamente");
            }
            else{
            this.anoPublicacao = anoPublicacao;
            }
        }
    
    public void Mostrarinfo(){
        System.out.println(" Titulo: "+ titulo + "  Autor:  " + autor + " Ano: " + anoPublicacao );
    } 
}

public class Biblioteca{
    ArrayList<Livro> livros = new ArrayList<>();
    private int capacidade;
    private int max = 10;

    public void setCapacidade(int capacidade){
        if(capacidade > 0 && capacidade <= max){
        this.capacidade = capacidade;
    }
    }

 public void adicionar_livro(Livro livro){
    if(livros.size() < capacidade ){
        
        System.out.println("O livro "+ livro.getTitulo() + " Foi Adicionado com sucesso ");
        livros.add(livro);
    }else{
        System.out.println("CHEIO");
    }

}

 public void remover_livro(Livro livro){
    if(livros.size() > 0){
        livros.remove(livro);
        
        System.out.println("O livro " + livro.getTitulo() + " Foi Removido com sucesso");

     }   
    }


  public  void Mostrarinfo(){
    System.out.println("Lista de Livros:");
    for (Livro livro : livros) {
        livro.Mostrarinfo();
        
    }


  }


  public static void main(String[] args) {
      Biblioteca biblioteca = new Biblioteca();
      biblioteca.setCapacidade(10);
      
      Livro livro1 = new Livro("A"," machado de assis ", 2024);
      Livro livro2 = new Livro("B","Shakespere", 2024);

      biblioteca.adicionar_livro(livro1);
      biblioteca.adicionar_livro(livro2);
      biblioteca.Mostrarinfo();
      biblioteca.remover_livro(livro1);
      biblioteca.Mostrarinfo();

  }
}
