package LinkedListInJava;

// Only one class in a Java file can be declared as public, and the name of the file must match the name of this public class
// you can have as many non-public classes as you want in the same file. These classes can't be accessed from outside the file in which they are defined.
class Node<T>{
    public  T value;
    public Node<T> next;

  public Node(T value){
    this.value=value;
    this.next=null;
  }
}

public class SinglyLinkedList<T>{

     // LinkedList is a linear data structure which is a collection of nodes.
  // Nodes in LinkedList are independent which store value and refernece to next node.
  // In LinkedList we can traverse by two ways
    // 1. loop using size 
    // 2. using iterating node by node until itrNode.next= null then its last node

  // Singly L.L. -> each node has only one reference to next node.

  public Node<T> head;
  public Node<T> tail;
  public int size;

  // Constructor
  public SinglyLinkedList(){
    this.head=null;
    this.tail=null;
    this.size=0;
  }

  //Insertion in Singly L.L.
  public void insert(int location,T value){

    // incorrect location
    if(location<0 || location>size){
      System.out.println("Pls enter valid index/location");
      return;
    }
    
    Node<T> newNode =new Node<>(value);
    
    // Insertion at begining 
    // case 1: size of S.L.L is 0
    if(location==0 && size==0){
       head=newNode;
       tail=newNode;
       size++;
      return;
    }
    //case2: size grater than 0
    if(location==0 && size>0){
       newNode.next=head;
       head=newNode;
        size++;
        return;
    }

    // Insertion at last
    if(location==size){
      tail.next = newNode;
      tail = newNode;
      size++;
      return;
    }

    // insertion in between begining and last
    Node<T> prevNode=head;
    int i=0;
    while(i<location-1){
      prevNode=prevNode.next;
      i++;
    }
    newNode.next=prevNode.next;
    prevNode.next=newNode;
    size++;
    
  }

  //Print S.L.L.
  public void printLL(){
     // check if list is empty 
    if(head==null){
      System.out.println("Empty list");
    }

    // In LinkedList we can traverse by two ways
    // 1. loop using size 
    // 2. using iterating node by node until itrNode.next= null then its last node
     Node<T> itrNode =head;
    while(itrNode!=null){
       System.out.print(itrNode.value+"->");
       itrNode=itrNode.next;
    }System.out.println("");
   }

  //searching in linkedlist
  // we will return index of first occcurence if present else -1
  public int search(T value){
    Node<T> prevNode=head;
    int i=0;
     while(prevNode!=null){
        if(prevNode.value==value){
           return i;
        }
        prevNode=prevNode.next;
       i++;
     }
     return -1;
  }

  // Deletion in S.L.L.
  public T remove(int location) {
        if(location<0 || location>=size){
          throw new IllegalArgumentException("Pls enter valid index/location");
        }

    // deleting element at beginning
    // case 1: size of S.L.L. is 1
    if(size==1 && location==0){
         T element=head.value;
         head=null;
         tail=null;
      return element;
    }
    // case 2: size of S.L.L. is greater than 1
    if(location==0 && size>1){
      T element=head.value;
      head=head.next;
      return element;
    }

    // deleting element at last
    // case 1: size of S.L.L. is greater than 1
    if(location==size-1 && size>1){
      Node<T> prevNode=head;
      while( prevNode.next!=tail){
        prevNode=prevNode.next;
      }
      T element=tail.value;
      prevNode.next=null;
      tail=prevNode;
      return element;
    }

    // deleting element in between
    Node<T> prevNode=head;
    int i=0;
    while(i<location-1)
      {
        prevNode=prevNode.next;
        i++;
      }
     Node<T> currNode=prevNode.next;
     T element = currNode.value;
     currNode=currNode.next;
     prevNode.next=currNode;
     return element;
  }
  
}