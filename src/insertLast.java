public class insertLast<T> {
    // Es el inicio de la lista
    private Node<T> head;
    // Es el final de la lista
    private Node<T> tail;
    // Cantidad de nodos en la lista
    private final int size;

    public insertLast() {
        // Como es una lista vacía, no hay primer ni último nodo
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }

    // Insertar un nodo al final
    public void insertLast(T data) {
        Node<T> newNode = new Node<>(data);

        // Si la lista está vacía, el nuevo nodo es head y tail a la vez
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            // Ya no hay que recorrer: tail nos da el último nodo directo
            tail.setNext(newNode);   // El último nodo ahora apunta al nuevo
            newNode.setPrev(tail);   // El nuevo apunta hacia atrás al que era último
            tail = newNode;          // Ahora el nuevo nodo es el último
        }
    }
}