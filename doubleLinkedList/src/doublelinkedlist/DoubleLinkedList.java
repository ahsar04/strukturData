/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublelinkedlist;

/**
 *
 * @author Ahmad Saifur Rohman
 */
public class DoubleLinkedList {

    Node first;
    Node last;

    //Konstruktor
    //Set nilai awal adalah null
    public DoubleLinkedList() {
        first = null;
        last = null;
    }

    //Mengecek apakah linked list kosong atau tidak
    public boolean isEmpty() {
        return (first == null);
    }

    //Method untuk menginsert data dari pertama
    public void insertFirst(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            last = node;
        } else {
            first.prev = node;
        }

        node.next = first;
        first = node;
    }

    //Method untuk menginsert data dari terakhir
    public void insertLast(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            first = node;
        } else {
            last.next = node;
            node.prev = last;
        }
        last = node;
    }

    //Method untuk menghapus data pertama
    public Node deleteFirst() {
        Node temp = first;
        if (first.next == null)
            last = null;
        else
            first.next.prev = null;
        first = first.next;
        return temp;
    }

    //method untuk menghapus data terakhir
    public Node deleteLast() {
        Node temp = last;
        if (first.next == null)
            first = null;
        else
            last.prev.next = null;
        last = last.prev;
        return temp;
    }

    //method untuk menginsert data di tengah
    public boolean insertAfter(int key, int data) {
        Node current = first;
        while (current.data != key) {
            current = current.next;
            if (current == null)
                return false;
        }
        Node node = new Node(data);

        if (current == last) {
            node.next = null;
            last = node;
        } else {
            node.next = current.next;

            current.next.prev = node;
        }
        node.prev = current;
        current.next = node;
        return true;
    }

    //method untuk menghapus data yang dipilih
    public Node deleteKey(int key) {
        Node current = first;
        while (current.data != key) {
            current = current.next;
            if (current == null)
                return null;
        }
        if (current == first)
            first = current.next;
        else
            current.prev.next = current.next;
        if (current == last)
            last = current.prev;
        else
            current.next.prev = current.prev;
        return current;
    }

    //menampilkan data
    public void display() {
        System.out.print("Data : ");
        Node current = first;
//        int size = 0;
        while (current != null) {
            current.tampil();
            current = current.next;
//            size++;
        }
        System.out.println("");
//        System.out.println("Size = "+size);
    }
    //panjang node
    public void size() {
        Node current = first;
        int size = 0;
        while (current != null) {
            current = current.next;
            size++;
        }
        System.out.println("");
        System.out.println("Panjang Linked List adalah = "+size);
    }
    
}
