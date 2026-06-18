package other;

public class LinkedList {
    public static void main(String[] args) {
        Node n1=new Node(5);

        System.out.println(n1.data);
        System.out.println(n1.next);

        Node n2=new Node(4);
        n1.next = n2;

        System.out.println(n2.data);
        System.out.println(n2.next);
        System.out.println(n1.next.data);

    }
}
class Node{
    int data;
    Node next;

    Node(int d){
        data=d;
    }
}
