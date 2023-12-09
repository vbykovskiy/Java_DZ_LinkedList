import java.util.Iterator;

public class GbLL<E> implements IntLL<E>, Iterable<E> {
    private int size; // Размер списка
    private Node<E> head; // Начало списка
    private Node<E> tail; // Конец списка

    public GbLL() {
        size = 0;
        head = null;
        tail = null;
    }
    // Хранение связей
    private static class Node<E> {
        E data;
        Node<E> next;
        Node<E> prev;

        public Node(E data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    // Метод для вставки элемента в начало списка
    public void addFirst(E data) {
        Node<E> newNode = new Node<>(data);
        if (size == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    // Метод для вставки элемента в конец списка
    public void addLast(E data) {
        Node<E> newNode = new Node<>(data);
        if (size == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    // Метод для получения размера списка
    public int getSize() {
        return size;
    }

    // Метод для получения элемента по индексу
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс выходит за пределы списка");
        }
        int i = 0;
        Node<E> current = head;
        while (i < index) {
            current = current.next;
            i++;
        }
        return current.data;
    }

    // Метод для удаления элемента по индексу
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс выходит за пределы списка");
        }
        if (size == 1) {
            head = null;
            tail = null;
        } else if (index == 0) {
            head = head.next;
            head.prev = null;
        } else if (index == size - 1) {
            tail = tail.prev;
            tail.next = null;
        } else {
            int i = 0;
            Node<E> current = head;
            while (i < index) {
                current = current.next;
                i++;
            }
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        size--;
    }

    // Реализация интерфейса Iterable
    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private Node<E> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public E next() {
                E data = current.data;
                current = current.next;
                return data;
            }
        };
    }

    // Переопределение метода toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node<E> current = head;
        while (current != null) {
            sb.append(current.data);
            current = current.next;
            if (current != null) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}