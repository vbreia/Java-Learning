package OO.animais.src.Animais;

//Atributos
public class Cachorro extends Animal  {


//Construtores
public Cachorro(String nome, String raca, int idade, double peso, String cor, String dono){
    this.nome = nome;
    this.raca = raca;
    this.idade = idade;
    this.peso = peso;
    this.cor = cor;
    this.dono = dono;


}


//Métodos
public String getNome(){
    return this.nome;
}    

public void setNome(String nome){
    this.nome = nome;
}

public String getRaca() {
    return this.raca;
}

public void setRaca(String raca) {
    this.raca = raca;
}

public int getIdade() {
    return this.idade;
}

public void setIdade(int idade) {
    this.idade = idade;
}

public double getPeso() {
    return this.peso;
}

public void setPeso(double peso) {
    this.peso = peso;
}

public String getCor() {
    return this.cor;
}

public void setCor(String cor) {
    this.cor = cor;
}

public String getDono() {
    return this.dono;
}

public void setDono(String dono) {
    this.dono = dono;
}


    public void comer() {
    }

    public String estadoDeEspirito;

    public String interagir(String acao) {
        switch (acao) {
            case "carinho":
                this.estadoDeEspirito = "está feliz";
                break;
            case "dormir":
                this.estadoDeEspirito = "deitou para dormir";
                break;
            default:
                this.estadoDeEspirito = "Neutro";
                break;
        }
        return this.estadoDeEspirito;
    }


    public void soar() {
        System.out.println("Au au");
    }

    public String pegar() {
        return "Bolinha";
    }
}
