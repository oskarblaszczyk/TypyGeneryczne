package pl.kurs.listcreator;

public interface Mapper<T, S> {
    S map(T t);
}
//interfejs funkcyjny- jedna metoda abstrakcyjna