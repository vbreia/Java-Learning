package OO.src;

import OO.src.Animais.Cachorro;

public class Main {
    public static void main(String[] args) {
        OO.src.Animais.Cachorro cachorro1 = new Cachorro();
        cachorro1.nome = "Rex";
        cachorro1.raca = "Vira-lata";
        cachorro1.idade = 3;
        cachorro1.peso = 10.5;
        cachorro1.cor = "Marrom";
        cachorro1.dono = "João";

        cachorro1.latir();
    }
}
