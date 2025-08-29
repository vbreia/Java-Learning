package hello_world;
import java.util.ArrayList;
import java.util.Arrays;

public class java4 {

    // laços de repetição
    public static void main(String[] args) {

        System.out.println("\nArray");
        // Array
        int[] numeros = new int[5];
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;
        System.out.println(Arrays.toString(numeros));

        System.out.println("\nArrayList");
        // ArrayList - Array dinâmico

        ArrayList<Integer> numeros2 = new ArrayList<Integer>();
        numeros2.add(10);
        numeros2.add(20);
        numeros2.add(30);
        numeros2.add(40);
        numeros2.add(50);
        numeros2.add(60);
        System.out.println(numeros2);
        numeros2.remove(0);
        System.out.println("\nRemovida posição [0]: " + numeros2);
    }
}
