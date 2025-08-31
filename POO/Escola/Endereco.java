package POO.Escola;

public class Endereco {
    private String descricao;

    public Endereco() {
        this.descricao = "";
    }
    public Endereco(String descricao) {
        this.descricao = descricao;
    }
    @Override
    public String toString() {
        return descricao;
    }
}
