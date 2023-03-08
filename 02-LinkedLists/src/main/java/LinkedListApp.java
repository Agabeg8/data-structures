public class LinkedListApp {
    public static void main(String[] args) {
        MySinglyLinkedList list1=new MySinglyLinkedList();
        //int[] numbers={1,1,2,2,2,3,4,4,4,4,5,6,6};
        for(int i=0;i<11;i++) list1.add(i);
        list1.printNodes();
        System.out.println("Kth item from last is: "+ list1.getKthFromLast(4));
        //System.out.println("Size before deletion is: "+ list1.size);

        list1.removeKthFromLast(3);
        //System.out.println("With duplicates");
        //list1.printNodes();
        //System.out.println("Without duplicates");
        //list1.removeDuplicatesFromLinkedList();
        //list1.printNodes();
       //System.out.println("After reverse in one pass");
       //list1.reverse();
       list1.printNodes();

    }
}
