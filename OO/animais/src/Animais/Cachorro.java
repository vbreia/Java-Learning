package OO.animais.src.Animais;

public class Cachorro {
    public String nome;
    public String raca;
    public int idade;
    public double peso;
    public String cor;
    public String dono;

    public void comer() {
    }

    public String estadoDeEspirito;

    public String interagir(String acao){
        if (acao.equals("carinho")){
            this.estadoDeEspirito = "está feliz";
        }else if(acao.equals("dormir")){
            this.estadoDeEspirito = "deitou para dormir.";
        }
         else{
            this.estadoDeEspirito = "neutro";
        }
        return estadoDeEspirito;
    }

    public void latir() {
        System.out.println("Au au");
    }

    public String pegar() {
        return "Bolinha";
    }
}
