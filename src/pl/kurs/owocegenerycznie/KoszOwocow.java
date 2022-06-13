package pl.kurs.owocegenerycznie;

public class KoszOwocow <T> {
    private T t;

    public KoszOwocow(T t) {
        this.t = t;
    }

    public T getObject() {
        return t;
    }
}
