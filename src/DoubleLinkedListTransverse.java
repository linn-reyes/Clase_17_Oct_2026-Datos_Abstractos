public class DoubleLinkedListTransverse <T>{
    // Es el inicio de la lista
    private Node<T> head;
    // Es el final de la lista
    private Node<T> tail;
    // Cantidad de nodos en la lista
    private int size;

    public DoubleLinkedListTransverse() {
        // Como es una lista vacía, no hay primer ni último nodo
        head = null;
        tail = null;
        size = 0;
    }

    // Recorre la lista de inicio a fin y muestra sus datos
    public void traverse() {
        // Variable de trabajo LOCAL para empezar en el primer nodo
        Node<T> current = head;

        // Recorremos hasta pasar el último nodo
        while (current != null) {
            System.out.print(current + ", ");
            // Avanzamos current al siguiente nodo
            current = current.getNext();
        }

        System.out.println();
    }

    // Recorre la lista de fin a inicio (esto es lo nuevo de la doble)
    public void traverseBackward() {
        // Variable de trabajo LOCAL para empezar en el último nodo
        Node<T> current = tail;

        // Recorremos hacia atrás hasta pasar el primer nodo
        while (current != null) {
            System.out.print(current + ", ");
            // Retrocedemos current al nodo anterior
            current = current.getPrev();
        }

        System.out.println();
    }
}
