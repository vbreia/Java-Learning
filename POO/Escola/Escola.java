package POO.Escola;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Escola{
    //Atributos
    private String nome,CNPJ;   
    private Endereco endereco;
    private List<Departamento> departamentos;
    private List<Aluno> discentes;
    //Métodos
    public Escola(String nome,String CNPJ){
        this.nome=nome;
        this.CNPJ=CNPJ;
        this.departamentos=new ArrayList<Departamento>();
        this.discentes=new ArrayList<Aluno>();
    }
    public void criarDepartamento(String nomeDepartamento){
            departamentos.add(new Departamento(nomeDepartamento));
    }
    public void fecharDepartamento(Departamento departamento){
            departamentos.remove(departamento);
    }
    public void matricularAluno(Aluno novoAluno){
            discentes.add(novoAluno);
    }
    public void trancarMatriculaAluno(Aluno aluno){
            discentes.remove(aluno);
    }
    public void agruparAlunos() {
            Map<String,List<Aluno>> agrupamento=
            discentes.stream().collect(Collectors.groupingBy(Aluno::recuperarNaturalidade));
            System.out.println("Resultado do agrupamento por naturalidade: ");
            agrupamento.forEach((String chave,List<Aluno> lista)->System.out.println(chave+" = "+lista));
    }
} 