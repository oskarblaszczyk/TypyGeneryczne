package pl.kurs.zadania;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //	napisz metode ktora jako argument pobiera liste obiektow typu A, jakis mapper i zwraca liste obiektow typu B
//	przykladowe uzycie:
//
//	List<LocalDate> dates = transform(Arrays.asList("2020-01-01", "2015-05-05"), tu jakis mapper);
//	albo
//	List<Integer> numbers = transform(Arrays.asList("1","2","3"), tu jakis mapper);
        List<LocalDate> dates = transform(Arrays.asList("2020-01-01", "2015-05-05"), LocalDate::parse);
        List<Integer> numbers = transform(Arrays.asList("1", "2", "3"), Main::parse);

        //metod reference

    }

    // napisz metode która przyjmuje jako parametr n stringow i zwraca sume
    // dlugosci tych które sa dluzsze niz 5
    // metoda (String ... args)

    public static int zadanie2(int i, String... args) {
        int suma = 0;
        for (String arg : args) {
            if (arg.length() > i) {
                suma += arg.length();
            }
        }
        return suma;
    }

    public static <T, S> List<S> transform(List<T> lista, Mapper<T, S> m) {
        List<S> wynik = new ArrayList<>();
        for (T t : lista) {
            wynik.add(m.map(t));
        }
        return wynik;
    }

    public static int parse(String s) {
        return Integer.parseInt(s);
    }
}
