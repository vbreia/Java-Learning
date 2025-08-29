      import java.util.Random;
      public class Aluno1{    
      //Atributos
      private String nome;
      private int idade;
      private double codigo_identificador;
      private Random aleatorio;
      //Construtor
      public Aluno1(String nome, int idade){
           aleatorio = new Random();
           this.nome = nome;
           this.idade = idade;
           this.codigo_identificador = aleatorio.nextInt();
      }
      //Métodos
      public void definirNome(String nome){
           this.nome = nome;
      }  
      public void definirIdade( int idade){
           this.idade = idade;
      }
      
      // Métodos getter
      public String getNome(){
           return this.nome;
      }
      
      public int getIdade(){
           return this.idade;
      }
      
      public double getCodigoIdentificador(){
           return this.codigo_identificador;
      }
      
      // Método toString para exibir informações do aluno
      public String toString(){
           return "Aluno: " + nome + ", Idade: " + idade + ", Código: " + String.format("%.6f", codigo_identificador);
      }
      
      // Método main para testar a classe
      public static void main(String[] args){
           // Criando um objeto Aluno1
           Aluno1 aluno = new Aluno1("João Silva", 20);
           
           // Testando os métodos
           System.out.println("Informações iniciais:");
           System.out.println(aluno.toString());
           
           // Modificando dados
           aluno.definirNome("Maria Santos");
           aluno.definirIdade(22);
           
           System.out.println("\nInformações após modificação:");
           System.out.println(aluno.toString());
           
           // Testando getters individualmente
           System.out.println("\nTestando getters:");
           System.out.println("Nome: " + aluno.getNome());
           System.out.println("Idade: " + aluno.getIdade());
           System.out.println("Código: " + aluno.getCodigoIdentificador());
      }
    }