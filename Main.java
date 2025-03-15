class Funcionario{
    protected  String nome;
    protected  String cpf;
    protected  Double salarioBase;
    //construtor
   public Funcionario( String nome, String cpf, Double salarioBase){//argumentos
    this.nome = nome; //atributo
    this.cpf = cpf;
    this.salarioBase = salarioBase;
   }



// public abstract Double calcularSalario(); assinatura do metodo
// o abstract obriga a implementar o metodo nas sub classes.
// obrigatorio a classe ser abstrata, não deixando ela ser instanciada

public Double calcularSalario(){
    return salarioBase;

}

public void mostrarInfo(){
    System.out.println("Nome: "+ this.nome + " cpf:  " + this.cpf + " Salario R$: "+ calcularSalario());
}
}

class Administrativo extends Funcionario{ // herda funcionario
    private String departamento;
    //construtor
    public Administrativo(String nome, String cpf, Double salarioBase,String departamento){
        super(nome,cpf,salarioBase);//heranca do funcionario, sempre a primeira linha
        this.departamento = departamento;
    }   
@Override// sobrescrever o metodo antigo da super classe e colocar o nome embaixo tendo o mesmo nome 
    public Double calcularSalario(){
        return salarioBase*2.25;
    }

@Override
public void mostrarInfo(){
    super.mostrarInfo();
    System.out.println(" Departamento "+ departamento);
}
}
//static = nn precisa do objeto sendo um metodo da classe
//final = constante
//constante é maiusculo sendo global
class Professor extends Funcionario{
    private String titulacao;
    private static int horasAula;
    private static final Double VALOR_AULA = 200.00;

    public Professor(String nome, String cpf, Double salarioBase, String titulacao, int horasAula){
        super( nome,  cpf, salarioBase);
        this.titulacao = titulacao;
        this.horasAula = horasAula;

    }
    @Override
    public Double calcularSalario(){
        return salarioBase + (VALOR_AULA*horasAula);
    }

    @Override
    public void mostrarInfo(){
    super.mostrarInfo();
    System.out.println(" Titulacao "+ titulacao);
    System.out.println(" Horas " + horasAula);
}
}


class Tecnico extends Funcionario{
        String cargo;
        private static final Double ADICIONAL_TECNICO = 200.00;
        public Tecnico(String nome, String cpf, Double salarioBase, String cargo){
            super(nome,cpf,salarioBase);
            this.cargo = cargo;
        }

     @Override
    public Double calcularSalario(){
        return salarioBase + (ADICIONAL_TECNICO);
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Cargo: "+ cargo);

}   
    

}
 
public class Main{
    public static void main(String[] args){
        Administrativo adm1 = new Administrativo("Jorge","03291231", 2400.20,"RH");
        Administrativo adm2 = new Administrativo("Julio","032912", 2400.20,"RH");
        Professor prof1 = new Professor("Carlos", "09321", 2400.20,"Doutor",80);
        Tecnico tec1 = new Tecnico("Karlos","0932122",2400.20,"Estagiario");
        System.out.println("Funcionarios:");
        adm1.mostrarInfo();
        adm2.mostrarInfo();
        prof1.mostrarInfo();
        tec1.mostrarInfo();
    }
}