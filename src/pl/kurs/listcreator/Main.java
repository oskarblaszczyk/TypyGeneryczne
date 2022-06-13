//https://sdkp.pjwstk.edu.pl/html/staskshtml/S_GENERICS/S_GENERICS.html
package pl.kurs.listcreator;

import java.util.Arrays;
import java.util.List;

public class Main {
    public Main() {
        List<Integer> src1 = Arrays.asList(1, 7, 9, 11, 12);
        System.out.println(test1(src1));

        List<String> src2 = Arrays.asList("a", "zzzz", "vvvvvvv");
        System.out.println(test2(src2));
    }

    public List<Integer> test1(List<Integer> src) {
        Selector<Integer> sel = i -> i < 10;
        Mapper<Integer, Integer> map = i -> i + 10;
        return ListCreator.collectFrom(src).when(sel).mapEvery(map);
    }

    public List<Integer> test2(List<String> src) {
        Selector<String> sel = s -> s.length() < 3;
        Mapper<String, Integer> map = s -> s.length() + 10;
        return ListCreator.collectFrom(src).when(sel).mapEvery(map);
    }


    public static void main(String[] args) {
        new Main();
    }
}


//        Gdy w metodzie test1 selektor wybiera z listy liczby < 10, a mapper zwraca liczbę-argument powiększoną o 10, to na konsoli powinniśmy zobaczyć:
//[11, 17, 19]
//
//        Gdy w metodzie test2  selektor wybiera z listy napisy, których długiość jest  większa od 3 znakow, a mapper dzwraca dlugość przekazanego napisu, powiększoną o 10, to na konsoli zobaczymy:
//[14, 17]
//
//        Należy obowiązkowo zapewnić takie właśnie działanie programu..
