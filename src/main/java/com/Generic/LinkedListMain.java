package com.Generic;
    public class LinkedListMain<E extends Comparable<E> > {
    public static Node head=null;
    public static Node tail=null;

    public static <E extends Comparable<E>> Boolean isEmpty() {

            return length() == 0;
        }

        public static <E extends Comparable<E>> int length() {
            int size = 0;
            Node current = head; // Starts counting from head - first node
            if (current != null) {
                size++;
                current = current.next;
            }
            return size;
        }

        public <E extends Comparable<E> > E add(E data) {
            Node getNewNode=new Node(data);

            if(head==null){
                head=getNewNode;
                tail=getNewNode;
            }
            tail.next=getNewNode;
            tail=getNewNode;
            return data;
        }
}
