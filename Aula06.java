/**
 * Aula 06
 * Tópico: Arrays e ArrayList
 *
 * Nesta aula, vamos abordar:
 * - Arrays e ArrayList
 * 
 * Objetivos:
 * 1. Compreender os conceitos básicos relacionados ao tópico
 * 2. Praticar com exemplos e exercícios
 * 3. Aplicar o conhecimento em um pequeno projeto
 */

import java.util.Arrays;
import java.util.ArrayList;
public class Aula06 {
    public static void main(String[] args) {
        System.out.println("Bem-vindo à Aula 06 - Arrays e ArrayList");
        // Código da aula será desenvolvido aqui

        // Arrays
        //int[] numeros = new int[6];
        //numeros[0] = 10;
        //numeros[1] = 20;
        //numeros[2] = 30;
        //numeros[3] = 40;
        //numeros[4] = 50;
        //numeros[5] = 60;
//
        //System.out.println("Array de números: " + Arrays.toString(numeros));

        // ArrayList - Array dinamico

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10); // 0
        numeros.add(20); // 1
        numeros.add(30); // 2
        numeros.add(40); // 3
        numeros.add(50); // 4
        numeros.add(60); // 5
        numeros.add(70); // 6
        numeros.add(80);
        System.out.println("ArrayList de números: " + numeros);

        System.out.println("Tamanho do ArrayList: " + numeros.size());
        numeros.remove(4);
        System.out.println("ArrayList de números: " + numeros);
        System.out.println("Tamanho do ArrayList: " + numeros.size());
        System.out.println("Elemento na posição 3: " + numeros.get(3));
    }
}
