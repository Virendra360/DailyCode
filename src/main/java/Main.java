// import java.util.Arrays;
// import ArrayInJava.OneDimensionalArray;
// import ArrayInJava.TwoDimensionalArray;
// import java.util.ArrayList;
// import java.util.Iterator;
// import LinkedListInJava.SinglyLinkedList;

public class Main {
  public static void main(String[] args) {


    
    // LinkedList is a linear data structure which is a collection of nodes.
    // Nodes in LinkedList are independent which store value and refernece to next node.
    // LinkedList is of 4 types: Singly L.L. , Circular L.L. , Doubly L.L. , Circular Doubly L.L.

    // Singly L.L. -> each node has only one reference to next node.

    // SinglyLinkedList<Integer> sll= new SinglyLinkedList<>();
    // insert to add new element , not replace existing
    // sll.insert(0,3);
    // sll.insert(1,5);
    // sll.insert(2,6);
    // sll.insert(3,8);
    // sll.insert(1,4);
    // print and traverse implementation
    // sll.printLL();

    // search implementation
    // System.out.println("Element is present at index: "+sll.search(7));

    // delete i.e. remove element at index
    // sll.remove(6);  -> thorws exception as index is out of range
    // System.out.println("Element is removed: "+sll.remove(0));
    // System.out.println("Element is removed: "+sll.remove(sll.size-1));
    // System.out.println("Element is removed: "+sll.remove(2));
    // sll.printLL();

    // To delete LinkedLsit just head=null and tail=null
    // so garbage collector will automatically delete the nodes
    
    // ArrayList<Integer> arr = new ArrayList<>();
    
    // arr.add(3);
    // arr.add(6);
    // while(itr.hasNext()){
    //     System.out.println(itr.next());
    // }
    // System.out.println("Removed element from ArrayList? "+ arr.remove(Integer.valueOf(5)));
    //  System.out.println("Removed element from ArrayList? "+ arr.remove(5));
    // System.out.println(arr);
    
    
   // TwoDimensionalArray arr=new TwoDimensionalArray(2,2); 

   //  arr.insert(0,0,9);
   //  arr.insert(1,1,5);
   //  arr.insert(1,2,3);
   //  arr.printArray();
      

   // OneDimensionalArray arr=new OneDimensionalArray(5);
   //  arr.insert(0,6);
   //  arr.insert(3,13);
   //  arr.insert(1,9); 
   //  arr.insert(5,2);
    
   //  arr.printArray();
  }
}