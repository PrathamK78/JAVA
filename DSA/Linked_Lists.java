package DSA;

//import java.util.*;

public class Linked_Lists {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        //step1 = create a new node
        Node newNode = new Node(data);
        size++;
        if (head==null){
            head = tail = newNode;
            return;
        }
        //step2 = assign head to new Node
        newNode.next = head; //link
        //step3 = head = newNode
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if (head==null){
            head = tail = newNode;
        }
        tail.next = newNode;
        tail=newNode;
    }
    public void print(){
        if(head==null){
            System.out.println("null");
            return;
        }
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void addInMiddle(int idx,int data){
        if (idx==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i < idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){
        if (size==0){
            System.out.println("list is empty");
            return Integer.MIN_VALUE;
        } else if (size==1) {
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }
        int val = head.data;
        head =  head.next;
        size--;
        return val;
    }

//    public int removelast(){
//        if (size==0){
//            System.out.println("list is empty");
//            return Integer.MIN_VALUE;
//        } else if (size==1) {
//            int val = head.data;
//            head = tail = null;
//            size=0;
//            return val;
//        }
//        //prev i:size-2;
//
//    }

    public int iterativeSearch(int key){
        Node temp = head;
        int i = 0;
        while(head!=null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public static void main(String[] args) {
        Linked_Lists ll = new Linked_Lists();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addInMiddle(2,9);
        ll.print();
//        System.out.println(size);
        ll.removeFirst();
        ll.print();
        System.out.println(ll.iterativeSearch(3));
        System.out.println(ll.iterativeSearch(10));
    }
}
