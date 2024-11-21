package OO.animais.src;

import OO.animais.src.Animais.Cachorro;

public class Main {
    public static void main(String[] args) {
        OO.animais.src.Animais.Cachorro cachorro1 = new Cachorro();
        cachorro1.nome = "Rex";
        cachorro1.raca = "Vira-lata";
        cachorro1.idade = 3;
        cachorro1.peso = 10.5;
        cachorro1.cor = "Marrom";
        cachorro1.dono = "João";

        cachorro1.latir();

        System.out.println(cachorro1.nome +  " pegou uma " + cachorro1.pegar());
        
        System.out.println(cachorro1.nome+" "+cachorro1.interagir("carinho")); // Ações: carinho / dormir
    
    }
}

// atalho compilar: javac OO/animais/src/Main.java && javac OO/animais/src/Animais/Cachorro.java && java OO.animais.src.Main