package LinkedList;

import javax.sound.midi.Soundbank;

public class DLL {
        private Node head;
        private Node tail;
        private int size;

        private class Node{
            private int value;
            Node next;
            Node prev;

            public Node(int value){
                this.value = value;
            }
        }
        public DLL(){
            this.size=0;
        }

        public void size(){
            System.out.println("Size of this Doubly linked list is -> " + size);
        }
        public void display(){
            Node temp = head;
            System.out.println("Forward traversal 👉");
            System.out.print("👉 ");
            while (temp!=null){
                System.out.print(temp.value + " -> ");
                temp=temp.next;
            }
            System.out.println("END");

            size();
            System.out.println();

            Node revtemp = tail;
            System.out.println("Backward traversal 👈");
            System.out.print("END ");
            while (revtemp!=null){
                System.out.print(revtemp.value + " <- ");
                revtemp=revtemp.prev;
            }
            System.out.print("👈");
            System.out.println();
            size();
            System.out.println("-----------------------------------------------------------------");
            System.out.println();
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
            temp.next.prev=node;
            node.prev = temp;
            temp.next=node;
            size++;
        }

        public void insertLast(int val){
            if(tail==null){
                insertFirst(val);
                return;
            }
            Node node = new Node(val);
            tail.next=node;
            node.prev = tail;
            tail=node;
            node.next=null;

            size++;
        }

        public void insertFirst(int val){
            Node node = new Node(val);
            node.next = head;
            if(head!=null){
                head.prev=node;
            }
            node.prev = null;
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
            temp2.prev = temp1;
            size--;
        }
    }
