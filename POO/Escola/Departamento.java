package POO.Escola;

public class Departamento {

    private String nomeDepartamento;

    public Departamento(String nomeDepartamento) {
        this.nomeDepartamento = nomeDepartamento;
    }

    @Override
    public String toString() {
        return nomeDepartamento;
    }

}
