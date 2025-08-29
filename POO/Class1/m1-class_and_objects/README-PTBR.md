# Aula 1 - Módulo 1 - Introdução à Programação Orientada a Objetos

[Read in English](./README.md)

---

## Temas

- [Aula 1 - Módulo 1 - Introdução à Programação Orientada a Objetos](#aula-1---módulo-1---introdução-à-programação-orientada-a-objetos)
  - [Temas](#temas)
  - [Classes e objetos em java](#classes-e-objetos-em-java)
    - [exemplo de notação: @](#exemplo-de-notação-)
    - [public, protect e private](#public-protect-e-private)
    - [abstract e final](#abstract-e-final)
    - [static](#static)
    - [strictfp](#strictfp)
  - [Objetos: os produtos das classes](#objetos-os-produtos-das-classes)
    - [Conteúdo da classe](#conteúdo-da-classe)
    - [Motivações](#motivações)
    - [Exemplo de instanciação de classe](#exemplo-de-instanciação-de-classe)
      - [Exemplos](#exemplos)
      - [Exemplo de código que usa construtor](#exemplo-de-código-que-usa-construtor)
        - [Comentários sobre construtor](#comentários-sobre-construtor)
    - [Estados de um objeto](#estados-de-um-objeto)
      - [Exemplo](#exemplo)
        - [lembrando](#lembrando)
  - [Encapsulamento da classe e do objeto](#encapsulamento-da-classe-e-do-objeto)
    - [Encapsulamento em POO](#encapsulamento-em-poo)
      - [Comentários sobre encapsulamento](#comentários-sobre-encapsulamento)
    - [Exemplo de encapsulamento](#exemplo-de-encapsulamento)
  - [Relação entre objetos](#relação-entre-objetos)
    - [Motivação](#motivação)
  - [Usando referências de objetos em Java](#usando-referências-de-objetos-em-java)
    - [Análise do Exemplo](#análise-do-exemplo)

---

## Classes e objetos em java

### exemplo de notação: @

modificadores de acesso

### public, protect e private

modificadores de acesso

### abstract e final

modificadores de classe e método

exemplo:

```java
abstract class A { } final void m() { }
```

### static

afeta o ciclo de vida da classe e de seus membros
exemplo:

```java
class A {
    static int x;
    void m() {
        x = 5;
    }
}
```

### strictfp

torna a implementação de cálculos de ponto flutuante previsível entre diferentes plataformas

---

## Objetos: os produtos das classes

### Conteúdo da classe

- Instanciação de classe
- Exemplo de código que usa construtores
- Estados de um objeto

### Motivações

- A POO é muito eficaz para escalar soluções
- O Java fornece todos os elementos essenciais para implementar conceitos de POO
- É necessário partir das definições para a implementação prática

### Exemplo de instanciação de classe

```java
Aluno objetoAluno = new Aluno();
```

- **"Aluno objetoAluno":** declaração de variável
- **"=":** inicialização da variável
- **"new Aluno()":** chamada do construtor da classe Aluno

#### Exemplos

- Modo 1
  ```java
  Aluno objetoAluno = new Aluno();
  ```

- Modo 2
  ```java
  Aluno objetoAluno;
  objetoAluno = new Aluno();
  ```

#### Exemplo de código que usa construtor

```java
import java.util.Random;
public class Aluno{
//Atributos
private String nome;
private int idade;
private double id_codigo;
private Random random;

    //Construtor
    public Aluno(String nome, int idade){
        random = new Random();
        this.nome = nome;
        this.idade = idade;
        this.id_codigo = random.nextDouble();
    }

    //Métodos
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public double getIdCodigo() {
        return id_codigo;
    }

}
```

##### Comentários sobre construtor

- O construtor é um método especial responsável por estabelecer o comportamento inicial de um objeto
- O método construtor e a classe têm o mesmo nome
- Se o desenvolvedor não definir explicitamente o uso do construtor, o Java criará o construtor padrão

### Estados de um objeto

- O estado de um objeto é definido por seus atributos e seus valores em um determinado momento.
- Objetos podem mudar seu estado modificando seus atributos por meio de métodos.
- O estado de um objeto é encapsulado dentro do próprio objeto, promovendo ocultação de dados e abstração.

#### Exemplo

```java
Aluno objetoAluno = new Aluno("João", 20);
```

##### lembrando

- **"Aluno objetoAluno"**: declaração de variável
- **"=":** inicialização da variável
- **"new Aluno("João", 20)":** chamada do construtor da classe Aluno

---

## Encapsulamento da classe e do objeto

Do ponto de vista da POO, o encapsulamento visa esconder do mundo exterior os atributos e funcionalidades de uma classe.

No entanto, ainda temos outras formas de tornar métodos visíveis que restringem o acesso a eles.

Tudo isso é o que chamamos de contrato, estabelecido entre a classe e o código que a utiliza.

A ideia por trás do encapsulamento é fornecer aos outros módulos do sistema apenas o que eles precisam para realizar suas tarefas.

Portanto, o conceito de encapsulamento está intimamente ligado ao de visibilidade.

A visibilidade de um método ou atributo determina como ele pode ser acessado de outras classes ou pacotes. Em Java, temos vários modificadores de acesso que controlam a visibilidade dos membros da classe:

- **public:** O membro é acessível de qualquer outra classe.
- **protected:** O membro é acessível dentro do próprio pacote e por subclasses.
- **private:** O membro é acessível apenas dentro da própria classe.
- **default (sem modificador):** O membro é acessível apenas dentro do próprio pacote.

### Encapsulamento em POO

- Disponibilizar para outros módulos do sistema apenas o que é necessário para realizar suas tarefas.
- O Java fornece três tipos de modificadores de visibilidade: **public**, **protected** e **private**.

#### Comentários sobre encapsulamento

- Necessidade de instalar alguns softwares
- Desenvolvimento local
- Opcional: extensão de navegador web e escolha de IDE

É um mecanismo que permite agrupar dados e métodos em uma única classe, que serve a dois propósitos principais: ocultação de dados e abstração.

- Para acessar esses membros, precisamos usar os métodos **getter** e **setter**.
- O objeto é exposto aos desenvolvedores apenas o essencial para suas tarefas.

### Exemplo de encapsulamento

```java
import java.util.Random;
    //Classe
    public class Pessoa {
        //Atributos
        private String nome;
        private double id_codigo;
        private Random random;  

        //Métodos 
        public Pessoa (String nome){
            random = new Random();
            this.setNome(nome);
            this.setIdCodigo(random.nextDouble());
        }

        //Setters
        private void setNome(String nome){
            this.nome = nome;
        }
        public String getNome(){
            return this.nome;
        }

        //Getters
        private void setIdCodigo(double id_codigo){
            this.id_codigo = id_codigo;
        }
        public double getIdCodigo(){
            return this.id_codigo;
        }

        public static void main(String args[]){
            Pessoa pessoa = new Pessoa("Alice");
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("ID Código: " + pessoa.getIdCodigo());
        }   
    }
```

- Precisamos observar os modificadores private e public.
- O objeto "pessoa" pode ser instanciado no método main.

---

## Relação entre objetos

### Motivação

- As classes têm objetivos específicos
- A interação entre objetos é uma necessidade
- O Java fornece recursos para gerenciar essas relações

**Tipos de relação entre objetos**
Em POO, temos os seguintes tipos de relação entre objetos:

1. **Associação**: Uma relação onde um objeto usa ou interage com outro objeto. Por exemplo, um objeto `Professor` pode estar associado a um objeto `Aluno`.

2. **Agregação**: Uma forma especial de associação que representa uma relação "todo-parte". Na agregação, o tempo de vida da parte não está estritamente ligado ao todo. Por exemplo, um objeto `Biblioteca` pode conter objetos `Livro`, mas os livros podem existir independentemente da biblioteca.

3. **Composição**: Uma forma mais forte de agregação onde o ciclo de vida da parte está ligado ao do todo. Se o todo for destruído, as partes também são destruídas. Por exemplo, um objeto `Casa` pode conter objetos `Quarto`, e se a casa for destruída, os quartos também serão destruídos.

**Como implementar isso em Java**
No Java, podemos implementar essas relações usando atributos e métodos de classe. Aqui estão alguns exemplos:

```java
class Escola{
    // Atributos
    private String nome, CNPJ;
    private Endereco endereco;
    private Departamento departamentos[];
    private Aluno alunos[];
    private int numAlunos, numDepartamentos;

    // Métodos
    public Escola(String nome, String CNPJ, Endereco endereco, Departamento[] departamentos, Aluno[] alunos) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.endereco = endereco;
        this.departamentos = new Departamento[10];
        this.alunos = new Aluno[100];
        this.numDepartamentos = 0;
        this.numAlunos = 0;
    }

    public void addDepartamento(Departamento departamento) {
        if (numDepartamentos < departamentos.length) {
            departamentos[numDepartamentos++] = departamento;
        }
    } else {
        System.out.println("Máximo de departamentos atingido");
    }
    public void addAluno(Aluno aluno) {
        if (numAlunos < alunos.length) {
            alunos[numAlunos++] = aluno;
        }
    } else {
        System.out.println("Máximo de alunos atingido");
    }
}
```

---

## Usando referências de objetos em Java

No Java, não é possível criar variáveis ponteiro. Em vez disso, o Java utiliza referências de objetos.

### Análise do Exemplo

```java
public class Referencia{
    private Aluno aluno1, aluno2;
        public Referencia(){
        aluno1 = new Aluno("Alice", 20);
        aluno2 = new Aluno("Bob", 23);
        System.out.println("Aluno 1: " + aluno1.getNome() + ", Idade: " + aluno1.getIdade());
        System.out.println("Aluno 2: " + aluno2.getNome() + ", Idade: " + aluno2.getIdade());

        aluno2 = aluno1;
        aluno2.setNome("Carlos");
        aluno2.setIdade(25);
        System.out.println("Aluno 1: " + aluno1.getNome() + ", Idade: " + aluno1.getIdade());
        ref.manipularAlunos(aluno1);
        System.out.println("Aluno 1: " + aluno1.getNome() + ", Idade: " + aluno1.getIdade());
    }
    public void manipularAlunos(Aluno aluno){
        aluno.setNome("David");
        aluno.setIdade(30);
    }
    public static void main(String args[]){
        Referencia ref = new Referencia();
        System.out.println("Fim da execução");
    }
}
```

O resultado será:

```output
Aluno 1: Alice, Idade: 20
Aluno 2: Bob, Idade: 23
Aluno 1: Carlos, Idade: 23
Aluno 1: David, Idade: 30
Fim da execução
```
