# Java Learning Repository
Este é o meu repositório de estudos de Java. Nele estarão todos os meus projetos de estudo.

Estou seguindo o curso de Java oferecido gratuitamente pelo professor [Marcos Aurelio](https://github.com/aureliowozhiak/intensivo_java) no canal do YouTube da plataforma DataEngineer.help. [Clique aqui para acessar o curso!](https://www.youtube.com/watch?v=4ODg1D2970E&list=PLRCKdG6PaMS02zE-ctR0ZHZUhcsx_yj-V&index=1)

## Índice do repositório

- [hello world](/hello_world) - Passos iniciais do Java
- [OO](/OO) - Orientação a Objetos
  - [animais](/OO/animais/) - Utilizando classes
- [POO](/POO) - Programação Orientada a Objetos (Aulas da Faculdade)
  - [Class1](/POO/Class1) - Módulos de estudo POO
    - [m1-class_and_objects](/POO/Class1/m1-class_and_objects) - Classes e Objetos
    - [m2-inheritance_and_polymorphism](/POO/Class1/m2-inheritance_and_polymorphism) - Herança e Polimorfismo

## Índice dos tutoriais básicos de Java

- [Java Learning Repository](#java-learning-repository)
  - [Índice do repositório](#índice-do-repositório)
  - [Índice dos tutoriais básicos de Java](#índice-dos-tutoriais-básicos-de-java)
  - [Instalação do Java e Javac no Linux](#instalação-do-java-e-javac-no-linux)
  - [Documentação do Java](#documentação-do-java)
  - [Compilação e Execução de Programas Java](#compilação-e-execução-de-programas-java)
    - [Compilando um Arquivo Java](#compilando-um-arquivo-java)
    - [Executando uma Classe Java](#executando-uma-classe-java)
    - [Compilando e Executando com um Único Comando](#compilando-e-executando-com-um-único-comando)
    - [Compilando Todos os Arquivos .java de um Diretório](#compilando-todos-os-arquivos-java-de-um-diretório)
    - [Executando a Classe Principal](#executando-a-classe-principal)

## Instalação do Java e Javac no Linux

Para instalar o Java e o compilador `javac` no Linux, siga os passos abaixo:

1. Atualize o repositório de pacotes:
   ```bash
   sudo apt update
   ```

2. Instale o JDK (Java Development Kit):
   ```bash
   sudo apt install default-jdk
   ```

3. Verifique a instalação:
   ```bash
   java -version
   javac -version
   ```

## Documentação do Java

Para mais informações, consulte a [documentação oficial do Java](https://docs.oracle.com/javase/8/docs/).

## Compilação e Execução de Programas Java

### Compilando um Arquivo Java

Para compilar um arquivo Java, use o comando `javac` seguido do nome do arquivo:
```bash
javac arquivo.java
```

### Executando uma Classe Java

Para executar uma classe Java compilada, use o comando `java` seguido do nome da classe:
```bash
java Classe
```

### Compilando e Executando com um Único Comando

Você pode compilar e executar um programa Java com um único comando usando `&&`:
```bash
javac arquivo.java && java Classe
```

### Compilando Todos os Arquivos .java de um Diretório

Para compilar todos os arquivos `.java` de um diretório e colocar os arquivos compilados em um diretório `bin`, use o comando:
```bash
javac -d bin src/**/*.java
```

### Executando a Classe Principal

Após compilar os arquivos, você pode executar a classe principal com:
```bash
java -cp bin NomeDaClassePrincipal
```

Certifique-se de substituir `NomeDaClassePrincipal` pelo nome da sua classe principal.



| <a  href="https://www.linkedin.com/in/victor-breia/"> <img  style="border-radius: 50%;"  src="https://raw.githubusercontent.com/vbreia/vbreia/main/Sem%20T%C3%ADtulo-2.png" width="100px;"  alt=""/> |<h1> [Victor Breia](https://www.linkedin.com/in/victor-breia/)</a>                                                                      </h1>                                                                                                                                                                                    |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Contate-me:                                                                                                                                                                                                                   | [![LinkedIn Badge](https://img.shields.io/badge/linkedin-blue?logo=linkedin&style=for-the-badge&logoColor=white)](https://www.linkedin.com/in/victor-breia/) [![Outlook badge](https://img.shields.io/badge/outlook-blue?logo=microsoftoutlook&style=for-the-badge&logoColor=white)](mailto:victordaschagas@outlook.com) |