package linkList;

public class LinkList {
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

        public void addFirst(int data){
            //ctreate new node
            Node newNode= new Node(data);
            size++;

            if(head==null){
                head=tail=newNode;
                return;
            }

            //newnode next points to head
            newNode.next =head;

            //newnode becomes head now
            head=newNode;

        }
        public void addLast(int data){
            //create new node
            Node  newNode = new Node(data);
            size++;

            if(head==null){
                head=tail=newNode;
                return;
            }

            //tail's next that was pointing to null will now point to new node
            tail.next=newNode;

            //newNode will becomes the tail
            tail= newNode;
        }
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

        //add node in mid
        public void addMid(int idx,int data){
            if(idx==0){
                addFirst(data);
                return;
            }
            Node newNode = new Node(data);
            size++;
            Node temp = head;
            int i =0;

            while(i<idx-1){
                temp=temp.next;
                i++;
            }

            newNode.next=temp.next;
            temp.next=newNode;
            //newNode.next=temp.next;
        }
        public int removeFirst(){
            if(size==0){
                System.out.println("ll is empty");
                return Integer.MIN_VALUE;

            } else if(size==1){
                int val = head.data;
                head=tail=null;
                size=0;
                return val;
            }

            int val = head.data;
            head = head.next;
            size--;
            return val;

        }
        public int removeLast(){
            if(size==0){
                System.out.println("ll is empty");
                return Integer.MIN_VALUE;
            } else if(size==1){
                int val= head.data;
                head=tail=null;
                size=0;
                return val;

            }  
            //prev : i=size-2 //re understand
            Node prev=head;  
            for(int i=0;i<size-2;i++){
                prev= prev.next;
            }
            int val=prev.next.data;//tail.next
            prev.next=null;
            tail=prev;
            size--;
            return val;

        }
        public int itrSearch(int key){
            Node temp = head;
            int i =0;
            while (temp != null ){
                if(temp.data==key){
                    System.out.println("key founded");
                    return i;
                }
                temp= temp.next;
                i++;
            }//key not found 
            return -1;
        }

        //recursive search

        public int helper(Node head, int key){
            if(head==null){
                return -1;
            }
            else if(head.data ==key){
                return 0;
            }
            int idx = helper(head.next, key);
            if(idx == -1){
                return  -1;
            }
            return idx+1;
        }
        public int recSearch(int key){
            return helper(head,key);
        }

        public static void reverse(Node head){
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
        ll.addMid(2,7);
        printList();
        System.out.println("the size is " + ll.size);
        ll.removeFirst();
        printList();

        ll.removeLast();
        printList();

        System.out.println(ll.itrSearch(3));

        System.out.println(ll.recSearch(1));

        System.out.println("reversing link list");
        ll.reverse();
        printList();
    }
}
