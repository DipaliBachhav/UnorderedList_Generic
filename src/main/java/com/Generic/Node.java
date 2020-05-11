package com.Generic;

class Node<E extends Comparable<E> >{
    E data;
    Node next;
    Node(E data){
        this.data=data;
        this.next=null;
    }
}
