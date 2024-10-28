/**
 * Aula 05
 * Tópico: Loops (for, while, do-while)
 *
 * Nesta aula, vamos abordar:
 * - Loops (for, while, do-while)
 * 
 * Objetivos:
 * 1. Compreender os conceitos básicos relacionados ao tópico
 * 2. Praticar com exemplos e exercícios
 * 3. Aplicar o conhecimento em um pequeno projeto
 */

public class Aula05 {
    public static void main(String[] args) {
        System.out.println("Bem-vindo à Aula 05 - Loops (for, while, do-while)");
        // Código da aula será desenvolvido aqui
        // For
        //for(int i = 0; i <= 100; i++){
        //    System.out.println("i: " + i);
        //}

        //While
        //int i = 0;
        //while(i <= 100){
        //    System.out.println("i: " + i);
        //    i++;
        //}

        //While infinito
        //int i = 0;
        //while(true){
        //    System.out.println("i: " + i);
        //    i++;
        //    if(i == 100){
        //        break;
        //    }
        //}

        //int i = 1;
        //while(i < 1){
        //    System.out.println("i: " + i);
        //    i++;
        //}

        //Do-while
        int i = 1;
        do{
            System.out.println("i: " + i);
            i++;
        }while(i < 1);
        //int i = 0;
        //do{
        //    System.out.println("i: " + i);
        //    i++;
        //}while(i <= 100);
    }
}
