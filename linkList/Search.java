package linkList;

public class Search {

    public static class Node{
        int data;
        Node next;
        public  Node(int data){
            this.data = data;
            this.next = null;

        }
    }
    
        public static Node head;
        public static Node tail;
        public static int size;

        public static void printList(){
            if(head==null){
                System.out.println("link list is empty");
                return;
            }
            Node temp=head;
                while(temp!=null){
                    System.out.println(temp.data);
                    temp= temp.next;
                }System.out.println();
        }

    public static void reverse(){
        Node prev=null;
        Node curr= tail=head;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            next=curr;
        }
        head=prev;
    }
    public static void main(String [] args){
        LinkList ll= new LinkList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);

        ll.reverse();
        printList();

    }
}
