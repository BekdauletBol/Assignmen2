public class MyQueue<E> {
    private MyLinkedList<E> list;

    public MyQueue() {
        list = new MyLinkedList<>();
    }

    public void enqueue(E element) {
        list.add(element);
    }

    public E dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return list.remove(0);
    }

    public E peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return list.get(0);
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public int size() {
        return list.size();
    }
}
/*
 * Custom queue implementation using MyLinkedList.
 * Follows the FIFO (First In, First Out) principle.
 */