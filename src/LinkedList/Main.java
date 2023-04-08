package LinkedList;

public class Main {

    public static void main(String[] args) {
//        LL item1 = new LL();
//        item1.insertLast(1);
//        item1.insertLast(3);
//        item1.insertLast(5);
//        item1.insertLast(7);
//        item1.insertLast(9);
//
//        LL item2 = new LL();
//        item2.insertLast(2);
//        item2.insertLast(4);
//        item2.insertLast(6);
//        item2.insertLast(8);
//
//        LL list = LL.MergeList(item1,item2);
//        list.display();
//
//        list.reverse();
//        list.display();
//        list.reverseWithoutRec();
//        list.display();
//        list.middleElement();

        LL pli = new LL();
        pli.insertLast(1);
        pli.insertLast(1);
        pli.insertLast(2);
        pli.insertLast(3);
        pli.insertLast(2);
        pli.insertLast(1);
        pli.insertLast(1);
        pli.display();
        System.out.println(pli.palindrome());
        pli.display();
    }
}
