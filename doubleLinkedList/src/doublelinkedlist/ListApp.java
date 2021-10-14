/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublelinkedlist;

import java.util.Scanner;

/**
 *
 * @author Ahmad Saifur Rohman
 */
public class ListApp {
    public static void main(String[] args) {

        DoubleLinkedList theList = new DoubleLinkedList();
        System.out.println("Masukkan panjang node");
        Scanner data = new Scanner(System.in);
        int length = data.nextInt();
        for (int i = 0; i <= length-1; i++) {
        System.out.print("Masukan data ke-"+i+" : ");
        Scanner list = new Scanner(System.in);
        int nodeList = list.nextInt();
        theList.insertFirst(nodeList);
        }
        theList.display();  
        
        //Menambahkan Node Di Belakang
        System.out.println("");
        System.out.print("Tambah Node di Belakang :");
        Scanner listLast = new Scanner(System.in);
        int nodeLast = listLast.nextInt();
        theList.insertLast(nodeLast);
        theList.display();
        //Menambahkan Node di Depan
        System.out.println("");
        System.out.print("Tambah Node di Depan :");
        Scanner listFirst = new Scanner(System.in);
        int nodeFirst = listFirst.nextInt();
        theList.insertFirst(nodeFirst);
        theList.display();
        //Menambahkan node di tengah
        System.out.println("");
        System.out.print("Tambah Node Setelah :");
        Scanner listAfter = new Scanner(System.in);
        int nodeAfter = listAfter.nextInt();
        System.out.print("Masukkan data Node :");
        Scanner listData = new Scanner(System.in);
        int nodeData = listData.nextInt();
        theList.insertAfter(nodeAfter,nodeData);
        theList.display();
        //Menghapus node paling akhir
        System.out.println("");
        System.out.println("Hapus Node di Paling Akhir");
        theList.deleteLast();
        theList.display();
        //Menghapus node paling pertama
        System.out.println("");
        System.out.println("Hapus Node di Paling Pertama");
        theList.deleteFirst();
        theList.display();
        //Menghapus node di salah satu posisi
        System.out.println("");
        System.out.print("Hapus Node :");
        Scanner listDel = new Scanner(System.in);
        int nodeDel = listDel.nextInt();
        theList.deleteKey(nodeDel);
        theList.display();
        //Menghitung Panjang Linked List
        theList.size();
    }
    
}
