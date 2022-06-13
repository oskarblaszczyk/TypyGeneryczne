package pl.kurs.listcreator;

import java.util.ArrayList;
import java.util.List;

public class ListCreator<T> {
    private List<T> lista;

    public ListCreator(List<T> lista) {
        this.lista = lista;
    }

    public static <S> ListCreator<S> collectFrom(List<S> lista) {
        return new ListCreator<>(lista);
    }

    public ListCreator<T> when(Selector<T> s) {
        List<T> wynik = new ArrayList<>();
        for (T t : lista) {
            if (s.select(t)) {
                wynik.add(t);
            }
        }
        return new ListCreator<>(wynik);
    }


    public <S> List<S> mapEvery(Mapper<T, S> m) {
        List<S> wynik = new ArrayList<>();
        for (T t : lista) {
            wynik.add(m.map(t));
        }
        return wynik;
    }


}
