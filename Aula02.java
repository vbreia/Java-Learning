/**
 * Aula 02
 * Tópico: Variáveis e tipos de dados primitivos
 *
 * Nesta aula, vamos abordar:
 * - Variáveis e tipos de dados primitivos
 * - inteiros, reais, caracteres, booleanos
 * - Conversão entre tipos de dados
 * 
 * Objetivos:
 * 1. Compreender os conceitos básicos relacionados ao tópico
 * 2. Praticar com exemplos e exercícios
 * 3. Aplicar o conhecimento em um pequeno projeto
 * 
 *  javac --release 21 Aula02.java
 *  java Aula02
 */

public class Aula02 {
    public static void main(String[] args) {
        System.out.println("Bem-vindo à Aula 02 - Variáveis e tipos de dados primitivos");
        // Código da aula será desenvolvido aqui

        // Tipos de dados primitivos
        int idade = 25; // int representa um número inteiro
        double altura = 1.75; // double representa um número real (em alguns lugares é chamado de float)
        double peso = 70.5; // double representa um número real (em alguns lugares é chamado de float)
        double imc = peso / (altura * altura); // double representa um número real (em alguns lugares é chamado de float)
        char genero = 'M'; // char representa um caractere
        boolean ativo = true; // boolean representa um valor lógico (true ou false)

        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Gênero: " + genero);
        System.out.println("Ativo: " + ativo);
        

        // converter imc para 2 casas decimais
        imc = Math.round(imc * 100.0) / 100.0;
        System.out.println("IMC: " + imc);
         
        // 23.020408163265305
        // 2302.0408163265305 -> round transforma em inteiro, apenas a parte antes da virgula
        // 2302
        // 23.02 -> divide por 100 para voltar a casa decimal

        // converter inteiro para decimal
        int numero = 10;
        double numeroDecimal = numero;
        System.out.println("Número decimal: " + numeroDecimal);

        int a = 10;
        double b = 2.0;

        double resultado = b / a;
        System.out.println("Resultado: " + resultado);

        char c = '9';
        int d = 10; 
        int e = d + Integer.parseInt(String.valueOf(c)); //converter para inteiro
        
        System.out.println("E: " + e);

        // Diferença de string e char - char não pode ser concatenado com string, necessita de um espaço
        // char não suportar mais de um caractere
        String ola = "Olá";
        char o = 'O';
        String oi = ola + " " + o;
        System.out.println(oi);
    }
}