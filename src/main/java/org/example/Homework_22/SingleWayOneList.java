package Homework_22;

import java.util.Iterator;



public class SingleWayOneList<T> implements Iterable<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<T> {

        private Node<T> current = head;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next(){
            T data = current.data;
            current = current.next;
            return data;
        }
    }

    private static class Node<T> {
        T data;
        Node<T> next;
        Node<T> prev;

        public Node(T data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public void addFirst(T data){
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        newNode.prev = null;

        if (tail == null) { tail = newNode;}
        head = newNode;
        size++;
    }

    public void add(T data){
        Node<T> newNode = new Node<>(data);
        if (head == null){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void removeFirst(){

        if (head.next == null){
            head = null;
        } else if (head == null){
            return;
        } else{
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    public void removeLast(){
        if (tail == head){
            head = null;
            tail = null;
        } else if (tail == null){
            return;
        } else{
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }

    public void printList(){
        Node<T> current = head;
        while (current != null){
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public T get(int index){
        if (index < 0){
            throw new IndexOutOfBoundsException();
        }
        Node<T> current = head;
        for (int i=0; i < index; i++){
            if (current == null){
                throw new IndexOutOfBoundsException();
            }
            current = current.next;
        }
        return current.data;
    }

    public int getSize(){
        return size;
    }

    public void setValue(int index, T data){
        if (index < 0){
            throw new IndexOutOfBoundsException();
        }
        Node<T> current = head;
        for (int i=0; i < index; i++){
            if (current == null){
                throw new IndexOutOfBoundsException();
            }
            current = current.next;
        }
        current.data = data;
    }

    public T getFirst(){ return head.data; }
    public T getLast(){ return tail.data; }

}
