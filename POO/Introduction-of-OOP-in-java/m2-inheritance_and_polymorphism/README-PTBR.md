# Aula 2 - Herança e Polimorfismo

[Leia em português](./README-PTBR.md)

---

## Temas

- [Aula 2 - Herança e Polimorfismo](#aula-2---herança-e-polimorfismo)
  - [Temas](#temas)
  - [Herança: aspectos elementares](#herança-aspectos-elementares)
    - [Elementos básicos da herança](#elementos-básicos-da-herança)
    - [Como lidar com mais de uma superclasse](#como-lidar-com-mais-de-uma-superclasse)
    - [Exemplo de herança de interfaces](#exemplo-de-herança-de-interfaces)
    - [Comentários sobre interfaces](#comentários-sobre-interfaces)
  - [Herança e visibilidade](#herança-e-visibilidade)
    - [Quatro níveis de acesso em Java](#quatro-níveis-de-acesso-em-java)
    - [Comentários sobre visibilidade](#comentários-sobre-visibilidade)
    - [Comentários sobre pacotes](#comentários-sobre-pacotes)
    - [Exemplo de declaração de pacote](#exemplo-de-declaração-de-pacote)
  - [Polimorfismo](#polimorfismo)
    - [Motivação](#motivação)
    - [Palavras-chave](#palavras-chave)
  - [Classes Abstratas](#classes-abstratas)
    - [Exemplo de Classe Abstrata](#exemplo-de-classe-abstrata)
    - [Comentários sobre Classes Abstratas](#comentários-sobre-classes-abstratas)

## Herança: aspectos elementares

O termo herança em OO define um tipo de relacionamento entre classes baseado em hierarquia. Dentro dessa relação hierárquica, as classes podem herdar características de outras classes acima delas ou transmitir suas características para classes subsequentes abaixo delas.

### Elementos básicos da herança

- Generalização de comportamentos
- Herança de superclasses e subclasses
- Manutenção simples do código

![https://cdn-conteudo.ensineme.com.br/03_fb717d2b7f.png](https://cdn-conteudo.ensineme.com.br/03_fb717d2b7f.png)

Na imagem, vemos que "**Empregado**" é o pai (superclasse) das classes "**Professor**", "**Diretor**", "**Coordenador**" e "**Secretário**". Estas últimas são filhas (subclasses) da classe **"Empregado"**.

> ⚠️ Um objeto instanciado a partir da subclasse também é um objeto do tipo da superclasse

### Como lidar com mais de uma superclasse

- O Java não suporta herança múltipla de classes
- No entanto, uma classe pode implementar múltiplas interfaces

![https://cdn-conteudo.ensineme.com.br/04_513b030266.png](https://cdn-conteudo.ensineme.com.br/04_513b030266.png)

Ao analisar a genealogia das classes, observamos que, ao descer na hierarquia, encontramos classes cada vez mais específicas. Por outro lado, ao subir na hierarquia, encontramos classes cada vez mais gerais. As características refletem os conceitos fundamentais de generalização e especialização em OO.

### Exemplo de herança de interfaces

```java
public interface ProfessorComissionado extends Professor, Diretor{
    // ...
}
```

### Comentários sobre interfaces

- Interfaces são um recurso importante para o arquiteto de software
- As classes Java podem "implementar" uma ou mais interfaces

---

## Herança e visibilidade

Quando dizemos que uma classe "Pessoa" é uma generalização da classe "Empregado", isso significa que ela reúne atributos e comportamentos para outras subclasses.
Esses comportamentos podem ser especializados nas subclasses, ou seja, as subclasses podem sobrescrever o comportamento modelado na superclasse.

### Quatro níveis de acesso em Java

1. **default**: define a visibilidade como restrita ao pacote Java
2. **private**: a visibilidade de atributos e métodos é restrita à própria classe
3. **protected**: a visibilidade é restrita ao pacote e a todas as subclasses
4. **public**: não há restrições de visibilidade

### Comentários sobre visibilidade

- A visibilidade pode estar relacionada aos conceitos de herança e encapsulamento em POO
- Códigos mais organizados e seguros

### Comentários sobre pacotes

- Pacotes organizam unidades lógicas
- Facilitam a manutenção e legibilidade do código
- Oferecem mais segurança

> ⚠️ O impacto positivo de uma boa escolha de modificadores:
> ajuda a estabelecer um comportamento previsível para um objeto

### Exemplo de declaração de pacote

```java
package com.example.meuapp;
```

---

## Polimorfismo

Polimorfismo é a propriedade de um mesmo método se comportar de maneiras diferentes. Ele pode ser expresso de diversas formas.
Sobrecarga de funções e herança são formas de dar ao objeto capacidade polimórfica.

### Motivação

- Polimorfismo é a propriedade mais sofisticada da POO
- Existem casos em que é muito útil
- Pode ser combinado com outras propriedades (herança e encapsulamento)

### Palavras-chave

- **extends**: permite que uma classe herde propriedades e métodos de outra classe

Exemplo de uso:

```java
public class Diretor extends Empregado {
    // ...
}
```

- **super**: refere-se à superclasse (classe pai) do objeto atual

Exemplo de uso:

```java
//Métodos
public Diretor(String nome, Calendar dataNascimento, long CPF, Endereco endereco) {
    super(nome, dataNascimento, CPF, endereco);
}
```

- **this**: refere-se ao objeto atual

Exemplo de uso:

```java
private void setNome (String nome) {
         this.nome = nome;
    }  
```

- **instanceof**: testa se um objeto é uma instância de uma classe específica ou implementa uma interface específica

Exemplo de uso:

```java
if (empregado instanceof Gerente) {
    // ...
}
```

---

## Classes Abstratas

Uma **classe abstrata** é uma classe que não pode ser instanciada por si só e é destinada a ser estendida. Ela pode conter métodos abstratos (sem implementação) que devem ser implementados por suas subclasses, bem como métodos concretos (com implementação) que podem ser herdados pelas subclasses.

### Exemplo de Classe Abstrata

```java
// Classe Abstrata
public abstract class Animal {
    public abstract void fazerSom();

    public void dormir() {
        System.out.println("Dormindo...");
    }
}

// Subclasse Concreta
class Cachorro extends Animal {
    public void fazerSom() {
        System.out.println("Latido");
    }
}

// Subclasse Concreta
class Gato extends Animal {
    public void fazerSom() {
        System.out.println("Miau");
    }
}
```

### Comentários sobre Classes Abstratas

- Para obter escalabilidade é essencial utilizar generalização
- A POO oferece diversos recursos para generalização, entre eles as Classes Abstratas
- Classes abstratas são úteis para definir uma interface comum para um grupo de classes relacionadas
- Permitem fornecer comportamento padrão enquanto obrigam as subclasses a implementar funcionalidades específicas
