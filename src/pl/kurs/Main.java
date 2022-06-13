package pl.kurs;

import pl.kurs.owocegenerycznie.*;

public class Main {
    public static void main(String[] args) {
        /*
         * Stwórz klase KoszOwocow ktora jako swoje pole przyjmuje Object.
         * Stworz klase Pomarancza i KoszPomaranczy która jako pole przyjmuje Pomarancze
         * Stworz klase Jablko i KoszJabłek ktora jako pole przyjmuje Jablko
         */
        Jablko j1 = new Jablko();
        Pomarancza p1 = new Pomarancza();

        KoszJablek kj1 = new KoszJablek(j1);
        KoszPomaranczy kp1 = new KoszPomaranczy(p1);

        KoszOwocow ko1 = new KoszOwocow(j1);

        Pomarancza p2 = kp1.getPomarancza();

        //Pomarancza p3 = kj1.getJablko();

        Jablko j2 = (Jablko) ko1.getObject();
        Pomarancza p3 = (Pomarancza) ko1.getObject();

    }
}
