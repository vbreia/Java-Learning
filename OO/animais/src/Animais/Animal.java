package OO.animais.src.Animais;

public class Animal {
    protected String nome;
    protected String raca;
    protected int idade;
    protected double peso;
    protected String cor;
    protected String dono;
    protected String estadoDeEspirito;


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


public void soar() {
        System.out.println("");
    }


}
