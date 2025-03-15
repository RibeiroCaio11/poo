import java.util.ArrayList;

class MaterialBiblioteca{
    protected String titulo;
    protected String autor;
    protected int anoPublicacao;

    public MaterialBiblioteca(String titulo,String autor,int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;

    }

    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public int getAnoPublicacao(){
        return anoPublicacao;
    }

    public void exibirInfo(){
        System.out.println("Titulo do livro: " + getTitulo() + ", Autor: " + getAutor() + " Ano do publicacao: " +getAnoPublicacao());
    }


    
}

class Livro extends MaterialBiblioteca{
    protected  int numeroPaginas;

    public Livro(String titulo,String autor,int anoPublicacao, int numeroPaginas){
        super(titulo, autor,anoPublicacao);
        this.numeroPaginas = numeroPaginas;
    }
   @Override
   public void exibirInfo(){
    super.exibirInfo();
    System.out.println("Numero de paginas: " + numeroPaginas);

   } 
}

class Revista extends MaterialBiblioteca{
    protected int edicao;

    public Revista(String titulo, String autor, int anoPublicacao, int edicao){
        super(titulo,autor,anoPublicacao);
        this.edicao = edicao;
    }
    @Override
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Numero da edicao: " + edicao);
    }
}

class Ebook extends MaterialBiblioteca{
    protected String formatoArquivo;
    public Ebook(String titulo,String autor,int anoPublicacao, String formatoArquivo){
        super(titulo, autor, anoPublicacao);
        this.formatoArquivo = formatoArquivo;
    }

   @Override
   public void exibirInfo(){
    super.exibirInfo();
    System.out.println("Formato: " + formatoArquivo );
   } 
}


class AudioLivro extends MaterialBiblioteca{
     int duracaoMinutos;

     public AudioLivro(String titulo, String autor, int anoPublicacao, int duracaoMinutos){
        super(titulo, autor, anoPublicacao);
        this.duracaoMinutos = duracaoMinutos;
     }

     @Override
     public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Duracao: " + duracaoMinutos);
     }
}

class Biblioteca{

    ArrayList<MaterialBiblioteca> materiais ;

    public Biblioteca(){
       materiais= new ArrayList<>();
    }

    public void exibirInformacoesMaterial(String titulo){
        for (MaterialBiblioteca material : materiais) {
            if(material.getTitulo().equals(titulo)){
                material.exibirInfo();               
            }
        }

    }

    public void adicionarMaterial(MaterialBiblioteca material){
            materiais.add(material);
    }

    public void removerMaterial(String titulo){
        for (MaterialBiblioteca material : materiais) {
            if(material.getTitulo().equals(titulo)){
                materiais.remove(material);
            }
            
        }
    }
       
    }
     
      
 public class exv{
    public static void main(String[] args) {
              Livro livro = new Livro("Andorinha", "Jorge", 2020, 300);
        Revista revista = new Revista("Bola", "Julia", 2021, 5);
        Ebook ebook = new Ebook("Marketing Digital", "Carlos", 2022, "PDF");
        AudioLivro audioLivro = new AudioLivro("Podcast", "Daniel", 2023, 120);

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarMaterial(livro);
        biblioteca.adicionarMaterial(revista);
        biblioteca.adicionarMaterial(ebook);
        biblioteca.adicionarMaterial(audioLivro);

        System.out.println("Materiais da Biblioteca:");
        biblioteca.exibirInformacoesMaterial("Andorinha");
        biblioteca.exibirInformacoesMaterial("Bola");
        biblioteca.exibirInformacoesMaterial("Marketing Digital");
        biblioteca.exibirInformacoesMaterial("Podcast");

        biblioteca.removerMaterial("Bola");
        
}
 }
  
      