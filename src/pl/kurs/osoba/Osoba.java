package pl.kurs.osoba;

public class Osoba <T, S>{
    private T t;
    private S s;

    public Osoba(T t, S s) {
        this.t = t;
        this.s = s;
    }

    public T getT() {
        return t;
    }

    public S getS() {
        return s;
    }
}
