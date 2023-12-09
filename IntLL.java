import java.util.Iterator;

public interface IntLL<E> {
    public void addFirst(E data);
    public void addLast(E data);
    public void remove(int index);
    public E get(int index);
    public int getSize();
    public Iterator<E> iterator();
    public String toString();
}