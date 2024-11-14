package hello_world;
public class java5 {
    public static void main(String[] args) {
        // Funções e Métodos
        System.out.println("\nFunções e Métodos");

        int numa = 10;
        int numb = 20;
        // Chamando a função soma
        System.out.println("\nSoma de " + numa + " + " + numb + " = " + soma(numa, numb));

        String nome = "Breia";
        // Chamando a função saudacao
        System.out.println("\n" + saudacao(nome));

        // Lista de 30 nomes
        String[] nomes = { "Breia", "Carlos", "Cristina", "Daniel", "Eduardo", "Fernanda", "Gabriel", "Hugo", "Isabela",
                "João", "Kátia", "Lucas", "Mariana", "Nathalia", "Otávio", "Paula", "Quiteria", "Rafael", "Sandra",
                "Tatiana", "Ubirajara", "Vitor", "Wagner", "Xuxa", "Yuri", "Zeca", "Ana", "Bianca", "Cleber", "Davi" };

        // Chamando a função saudacao
        for (String n : nomes) {
            if (n.startsWith("B")) {
                System.out.println("\n" + saudacao(n));
            }
        }
    }

    // Função para somar dois números
    public static int soma(int a, int b) {
        return a + b;
    }

    // Função para subtrair dois números
    public static int subtracao(int a, int b) {
        return a - b;
    }

    // Função para multiplicar dois números
    public static int multiplicacao(int a, int b) {
        return a * b;
    }

    // Função para dividir dois números
    public static int divisao(int a, int b) {
        return a / b;
    }

    // Função para receber um nome e retornar uma saudação
    public static String saudacao(String nome) {
        return "Olá, " + nome + "!";
    }
}