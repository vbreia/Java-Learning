package OO.animais.src;

import OO.animais.src.Animais.Cachorro;
import OO.animais.src.Animais.Gato;

public class Main {
// Constructor default
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("Java", "Pinscher", 7, 2.5, "Preto", "Victor");

        System.out.println(cachorro1.getNome());

        Gato gato1 = new Gato("Python", "tomba-lixo", 3, 1.5, "Preto", "Victor");

        System.out.println(gato1.getNome());
    }
}

// continuar da aula 7 (19:00)

// atalho compilar: javac OO/animais/src/Main.java && javac OO/animais/src/Animais/Cachorro.java && java OO.animais.src.Main