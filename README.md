# Curso Intensivo de Java

Bem-vindo ao Curso Intensivo de Java! Este curso foi projetado para fornecer uma introdução abrangente à programação Java, cobrindo desde os conceitos básicos até tópicos mais avançados de Programação Orientada a Objetos.

## Estrutura do Curso

O curso é dividido em 10 aulas, cada uma focando em um tópico específico:

1. Introdução ao Java e Hello World
2. Variáveis e tipos de dados primitivos
3. Operadores e expressões
4. Estruturas de controle (if, else, switch)
5. Loops (for, while, do-while)
6. Arrays e ArrayList
7. Funções e métodos
8. Programação Orientada a Objetos - Introdução
9. Classes e objetos
10. Herança e polimorfismo

## Objetivos de Cada Aula

Cada aula do curso segue uma estrutura consistente com os seguintes objetivos:

1. Compreender os conceitos básicos relacionados ao tópico
2. Praticar com exemplos e exercícios
3. Aplicar o conhecimento em um pequeno projeto

## Como Usar Este Repositório

Cada aula tem seu próprio arquivo Java (por exemplo, `Aula01.java`, `Aula02.java`, etc.). Você pode navegar por esses arquivos para ver o conteúdo de cada aula.

Para começar:

1. Clone este repositório
2. Certifique-se de ter o JDK (Java Development Kit) instalado em seu sistema
3. Compile e execute cada arquivo de aula usando os comandos:
   ```
   javac AulaXX.java
   java AulaXX
   ```
   (Substitua XX pelo número da aula)

## Instalação do Java e Javac

Para participar deste curso, você precisará instalar o Java Development Kit (JDK), que inclui o compilador Java (javac). Siga as instruções abaixo de acordo com seu sistema operacional:

### Windows

1. Visite o site oficial da Oracle: https://www.oracle.com/java/technologies/javase-jdk11-downloads.html
2. Baixe o instalador do JDK para Windows
3. Execute o instalador e siga as instruções na tela
4. Após a instalação, adicione o caminho do bin do JDK ao PATH do sistema:
   - Pesquise por "Variáveis de Ambiente" no menu Iniciar
   - Clique em "Editar as variáveis de ambiente do sistema"
   - Clique em "Variáveis de Ambiente"
   - Em "Variáveis do Sistema", encontre a variável PATH e clique em "Editar"
   - Adicione o caminho para o diretório bin do JDK (geralmente C:\Program Files\Java\jdk-11\bin)
   - Clique em "OK" para salvar as alterações

### macOS

1. Instale o Homebrew se ainda não tiver: https://brew.sh/
2. Abra o Terminal e execute:
   ```
   brew install openjdk@11
   ```
3. Adicione o Java ao seu PATH executando:
   ```
   echo 'export PATH="/usr/local/opt/openjdk@11/bin:$PATH"' >> ~/.zshrc
   ```
   (Se estiver usando bash, substitua .zshrc por .bash_profile)

### Linux (Ubuntu/Debian)

1. Abra o Terminal
2. Atualize o índice de pacotes:
   ```
   sudo apt update
   ```
3. Instale o OpenJDK:
   ```
   sudo apt install openjdk-11-jdk
   ```

Após a instalação, verifique se o Java e o Javac estão instalados corretamente executando:

```
java -version
javac -version
```

Ambos os comandos devem exibir informações sobre a versão instalada.

## Pré-requisitos

- Conhecimento básico de programação é útil, mas não obrigatório
- JDK instalado em seu sistema (veja a seção de instalação acima)

## Contribuições

Contribuições para melhorar o curso são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.

## Licença

[Insira aqui informações sobre a licença do seu curso]

Esperamos que você aproveite este curso intensivo de Java e desenvolva uma base sólida na linguagem!
