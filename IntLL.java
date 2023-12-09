import java.util.Iterator;

public interface IntLL<E> {
    GbLL<E> addFirst(E data);
    GbLL<E> addLast(E data);
    GbLL<E> remove(int index);
    E get(int index);
    int getSize();
    Iterator<E> iterator();
    String toString();
}