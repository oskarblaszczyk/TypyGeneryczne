package pl.kurs.osoba;

public class Main {
    public static void main(String[] args) {
        //Napisz klase Osoba która ma 2 parametry ktore moga byc roznymi typami, np String int, String String.

        Osoba<String, Integer> o1 = new Osoba<>("String", 9);
        Osoba<Integer, Integer> o2 = new Osoba<>(1, 2);
        Osoba<String, String> o3 = new Osoba<>("tekst", "tekst2");



    }
}
