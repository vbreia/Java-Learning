import java.util.Random;
    //Classe
    public class Aluno2 {    
    //Atributos
    private String nome;
    private double codigo_identificador;
    private Random aleatorio;   
    //Métodos
    public Aluno2 (String nome){
         aleatorio = new Random();
         this.setNome(nome);
         this.codigo_identificador = aleatorio.nextDouble();
    }
    private void setNome (String nome) {
         this.nome = nome;
    }  
    public String getNome () {
         return this.nome;
    }
    public double getCodigoIdentificador (){
         return this.codigo_identificador;
    }   
    public static void main(String args[]){
        Aluno2 p1 = new Aluno2("Teste A");
        System.out.println("Aluno2 1: "+p1.getNome());
    }
}