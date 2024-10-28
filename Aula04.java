/**
 * Aula 04
 * Tópico: Estruturas de controle (if, else, switch)
 *
 * Nesta aula, vamos abordar:
 * - Estruturas de controle (if, else, switch)
 * 
 * Objetivos:
 * 1. Compreender os conceitos básicos relacionados ao tópico
 * 2. Praticar com exemplos e exercícios
 * 3. Aplicar o conhecimento em um pequeno projeto
 */

public class Aula04 {
    public static void main(String[] args) {
        System.out.println("Bem-vindo à Aula 04 - Estruturas de controle (if, else, switch)");
        // Código da aula será desenvolvido aqui

        //int idade = 10;
//
        //if(idade >= 18){
        //    System.out.println("Você é maior de idade");
        //}else{
        //    System.out.println("Você é menor de idade");
        //}

        int dia_semana = -3;
        switch(dia_semana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido");
        }

    }
}
