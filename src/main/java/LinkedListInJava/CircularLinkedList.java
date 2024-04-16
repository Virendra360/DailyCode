package LinkedListInJava;

// Circular Linked List example can be ludo game where player 1 plays then p2 , p3 , p4 after p4 then p1 again.
// In this case we can use circular linked list.

public class CircularLinkedList<T> {

  Node<T> head;
  Node<T> tail;
  int size;

  public CircularLinkedList() {
    this.head = null;
    this.tail = null;
    this.size = 0;
  }

  // Insertion in Circular L.L.
  public void insert(int location, T value) {
    // exit if given location out of range
    if (location > size) {
      System.out.println("Pls. Enter location in range");
      return;
    }
    // create new node with value given
    Node<T> newNode = new Node<>(value);

    // Insertion at beginning
    if (location == 0) {
      // case 1: size of C.L.L is 0
      if (size == 0) {
        head = newNode;
        tail = newNode;
        newNode.next = newNode;
        size++;
        return;
      }
      // case 2: size of C.L.L is greater than 0
      newNode.next = head;
      head = newNode;
      tail.next = newNode;
      size++;
      return;
    }

    // insertion in last
    if (location == size) {
      // case 1: size of C.L.L is 0
      if (size == 0) {
        head = newNode;
        tail = newNode;
        newNode.next = newNode;
        size++;
        return;
      }
      // case 2: size of C.L.L is greater than 0
      tail.next = newNode;
      tail = newNode;
      newNode.next = head;
      size++;
      return;
    }

    // in middle
    Node<T> prevNode = head;
    // traverse to prev node i.e prev index of location
    for (int i = 0; i < location - 1; i++) {
      prevNode = prevNode.next;
    }
    newNode.next = prevNode.next;
    prevNode.next = newNode;
    size++;
  }

  // traverse in C.L.L
  // 1. use loop based on size
  // 2. use temp=head -> loop unitl temp.next != head -> and temp=temp.next

  // priting C.L.L
  public void printCLL() {

    if (head == null) {
      System.out.println("Empty list");
      return;
    }

    Node<T> temp = head;
    // used do while bcs at start temp==head but we want to avoid that start check
    do {
      System.out.print(temp.value);
      temp = temp.next;
      if (temp != head) {
        System.out.print("->");
      }
    } while (temp != head);
    System.out.println("");
  }

  // deletion in C.L.L
  public T remove(int location) {
   
    if (location<0 || location >= size) {
      throw new IllegalArgumentException("Pls. Enter location in range");
    }

    // At beginning
    if(location==0){
      T elem=head.value;
      // case1: size=1
      if(size==1){
        // we want garbage collector to take care 
        // as first node has reference to itself we need to remove that
        head.next=null;
        head=null;
        tail=null;
        size--;
        return elem;
      }
     // case2: size>1
      head=head.next;
      tail.next=head;
      size--;
      return elem;
    }

    // At last
    if(location==size-1){
      T elem=tail.value;
      // case1: size=1
      if(size==1){
        head.next=null;
        head=null;
        tail=null;
        size--;
        return elem;
      }
     // case2: size>1
      Node<T> prevNode=head;
      while(prevNode.next!=tail){
        prevNode=prevNode.next;
      }
      prevNode.next=head;
      tail=prevNode;
      size--;
      return elem;
    }

    //In middle
    // find prev node before location
    Node<T> prevNode= head;
    for(int i=0;i<location-1;i++){
      prevNode=prevNode.next;
    }
    T elem=prevNode.next.value;
    prevNode.next=prevNode.next.next;
    
    size--;
   return elem;
  }
  
}
