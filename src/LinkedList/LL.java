package LinkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    private class Node{
        private int value;
        Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    public LL(){
        this.size=0;
    }

    public void size(){
        System.out.println("Size of this linked list is -> " + size);
    }
    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.value + "-> ");
            temp=temp.next;
        }
        System.out.println("END");
        size();
        System.out.println("--------------------------------------------------------------------------------");
    }

    public void insertAt(int val,int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }
        Node node = new Node(val);
        node.next=temp.next;
        temp.next=node;
        size++;
    }

//    insert using recursion
    public void insertRec(int val,int index){
        if(index>size){
            System.out.println("❌❌❌ Index out of range | "+val+" inserted at last ❌❌❌");
            head = insertAtRecursion(val,size,head);
            return;
        }
        head = insertAtRecursion(val,index,head);
    }

    private Node insertAtRecursion(int val,int index,Node node){
        if(index==0){
            Node temp = new Node(val,node);
            size++;
            return temp;
        }

       node.next =  insertAtRecursion(val,index-1,node.next);
       return node;
    }

    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next=node;
        tail=node;
        node.next=null;
        size++;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        size++;
        if(tail==null){
            tail=head;
        }
    }

    public void deleteAt(int index){
        if(index==0){
            System.out.println("❌ " + head.value + " Deleted from the linked list ❌");
            head=head.next;
            size--;
            return;
        }
        if (index==size){
            Node temp = head;
            for (int i = 1; i < size; i++) {
                temp = temp.next;
            }
            temp.next=null;
            System.out.println("❌ " + tail.value + " Deleted from the linked list ❌");
            tail=temp;
            size--;
            return;
        }
        Node temp1 = head;
        Node temp2 = head.next;
        for(int i=1;i<index;i++){
            temp1=temp1.next;
            temp2=temp2.next;
        }
        System.out.println("❌ " + temp2.value + " Deleted from the linked list ❌");
        temp1.next=temp2.next;
        size--;
    }

//    questions ---------------------------------------------------------------questions
    public void removeDuplicate(){
        Node node = head;
        Node temp = head.next;

        while (temp!=null) {
            if(node.value==temp.value){
                if(temp.next==null){
                    node.next=null;
                    tail=node;
                    size--;
                    temp=temp.next;
                }else{
                    temp=temp.next;
                    size--;
                }
            }else{
                node.next=temp;
                node=temp;
                temp=temp.next;
            }
        }
    }

    public static LL MergeList(LL first, LL second) {
        Node f = first.head;
        Node s = second.head;
        LL newList = new LL();
        while (f != null && s != null) {
            if (f.value < s.value) {
                newList.insertLast(f.value);
                f = f.next;
            } else {
                newList.insertLast(s.value);
                s = s.next;
            }
        }
        while (f != null) {
            newList.insertLast(f.value);
            f = f.next;
        }
        while (s != null) {
            newList.insertLast(s.value);
            s = s.next;
        }

        return newList;
    }

    private void reverseList(Node node){
        if(node == tail){
            head=tail;
            return;
        }

        reverseList(node.next);
        tail.next=node;
        tail=node;
        tail.next=null;
    }

    private Node reverseListfromNode(Node node){
        if(node == tail){
            return node;
        }

        Node newHead = reverseListfromNode(node.next);
        tail.next=node;
        tail=node;
        tail.next=null;
        return newHead;
    }

    public void reverse(){
        Node temp = head;
        reverseList(temp);
    }
    public Node reverse(Node node){
        return reverseListfromNode(node);
    }

    public void reverseWithoutRec(){
        Node prev = null;
        Node present = head;
        Node next = head.next;

        while(next!=null){
            present.next=prev;
            prev=present;
            present=next;
            next=next.next;
        }
        present.next=prev;

        head = present;
    }

    public Node middleElement(){
        Node s = head;
        Node f = head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        System.out.println("Middle element is "+s.value);
        return s;
    }


    public Boolean palindrome(){
        Node middle = middleElement();
        Node newHead = reverse(middle);
        Node reverseHead = newHead;
        Node temp = head;
        display();
//        compare firsthand and secondhand
        while(temp!=null && newHead!=null){
            if(temp.value!=newHead.value){
                break;
            }
            temp=temp.next;
            newHead=newHead.next;
        }

        reverse(reverseHead);
        return temp==null || newHead==null;
    }
}
