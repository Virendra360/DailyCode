package CollectionsInJava;

public class ArrayListInCollection{

  // Here we will store practise code of ArrayList in Collection

  //ArrayList is part of Collection fremework in Java ->java.util.ArryList

    //1. ArrayList with no type saftey i.e. can store multiple type of element in single list
    // by default ArrayList is empty i.e null values
    // ArrayList have default size of 0 or 10 and capacity 10.
    // ArrayList is dynamic in nature i.e. it can increase or decrease the size of arraylist
    // When we try add element at greater than capacity then it will create new array of double size or(1.5*capacity) .To check ArrayList capacity we dont have method.
    // ArrayList arr=new ArrayList();

    // System.out.println(arr.size());  
    // System.out.println(arr.isEmpty());
    // System.out.println(arr);

    // To add element in ArrayList we have add method with two signatures
    //1 add(Object obj) -> add element at the end of the list
    //2 add(int index,Object obj)

    // arr.add(1);    
    // arr.add("John");
    // arr.add(true);

    //to print ArrayList, it has implemented inbuild toString method
    // System.out.println(arr);

    // 2. Homeogeneous ArrayList i.e type saftey ArrayList
    // ArrayList<T> arr=new ArrayList<>();  -> use type generics 
    // T can be always object i.e int not allowed , Integer alllowed
    // In ArrayList we can define capacity also ->  new ArrayList<>(capacityNo);

    // ArrayList<Integer> arr = new ArrayList<>();

    // arr.add(3);
    // arr.add(6);

    //  When we try to acces index out of size then it will throw java.lang.IndexOutOfBoundsException
    // arr.add(3,5);
    // System.out.println(arr);

    // In ArrayList we can pass list of element also
    // ArrayList<String> arr= new ArrayList<>(Arrays.asList("John","Mary","Jane"));
    // System.out.println(arr);

    // Accessing ArrayList element we have -> get(index) method
    // arr[i] -> not allowed in ArrayList
    // System.out.println(arr.get(1));
    // System.out.println(arr.get(4));

   // Treversing in ArrayList
   // 1. for(int i=0;i<arr.size();i++)  use loop
   // 2. use for each loop (enhaanced for loop)

    // for(String name:arr){
    //    System.out.println(name);
    // }

   // 3. use of iterator() method which return iterator object
   //  Iteraotor is interface -> java.util.Iterator
    // Iterator<String> itr= arr.iterator();

    // hasNext( ) -> return true if there is next element in iterator
    // next() method returns the next element in the collection being iterated over.
    // If next() is called when there are no more elements , it will throw a NoSuchElementException
    // hence hasNext and next method are used together to avoid the exception
    // while(itr.hasNext()){
    //     System.out.println(itr.next());
    // }

    // To check element is present in ArrayList 
    // 1. iterate over list and check element
    // 2. we have -> contains(Object obj) method
    // return true or false
   // System.out.println("Is element present in ArrayList? "+arr.contains("John"));
    // System.out.println("Is element present in ArrayList? "+arr.contains(5));

    // To search element in ArrayList
    // 1. iterate over list and check element
    // 2. we have -> indexOf(Object obj) method
    // returns the index of the first occurrence of the specified element in this list, or -1 if not persent
    // System.out.println("Index of element in ArrayList? "+arr.indexOf(6));
    // System.out.println("Index of element in ArrayList? "+arr.indexOf(5));
    // System.out.println("Index of element in ArrayList? "+arr.indexOf("Mary"));

    // remove(int index): Removes the element at the specified index in the list.
    // remove(int index) retruns the removed element or exception java.lang.IndexOutOfBoundsException
    // remove(Object o): Removes the first occurrence of the specified element from the list, if it is present.
    // remove(Object o) retursn true if element is removed or false if element is not present
    // arr.remove(Integer.valueOf(3)); -> This ensures that the 3 is treated as an object rather than an index. If you use remove(3) directly, it will try to remove the element at index 3, not the element with the value 3

    // System.out.println("Removed element from ArrayList? "+ arr.remove(Integer.valueOf(5)));
    //  System.out.println("Removed element from ArrayList? "+ arr.remove(5));
    // System.out.println(arr);
  
}