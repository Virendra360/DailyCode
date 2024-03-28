package ArrayInJava;

import java.util.Arrays;

public class OneDimensionalArray {

  int size;
  int[] arr;

  // public class OneDimensionalArray<T> -> signature of class for generic class
  // T[] arr= new T[size]; -> we cant create array of generic type.
  // In Java, when you create an array, you need to specify the type of the array
  // explicitly.
  // This is because Java needs to know the actual type of the elements the array
  // will hold at compile time.
  // To work around this, you can create an array of objects and then cast it to
  // an array of the generic type.
  // @SuppressWarnings("unchecked")
  // T[] arr =(T[]) new Object[size];

  public OneDimensionalArray(int size) {
    this.size = size;
    arr = new int[size];
  }

  //method to print array
  public void printArray() {
System.out.println(Arrays.toString(this.arr));
  }

  //metthod to insert value in array
  public void insert(int location,int value){
    try{
      arr[location]=value;
}catch(ArrayIndexOutOfBoundsException e){
       System.out.println("Enter index between 0 and "+(size-1)); 
    }
  }

  // Array in Java (One-Dimensional Array)
  // dataType[] arrayName; -> declaration
  // arrayName = new dataType[size]; -> initialization
  // dataType[] arrayName = new dataType[size]; -> declaration + initialization
  // dataType[] arrayName = {value1, value2, value3, ...}; -> declaration +
  // initialization

  // int[] arr1;
  // arr1 = new int[5];
  // by default array initialize with 0

  // arr1[0]=7;
  // arr1[1]=4;
  // arr1[3]=9;

  // int arr[] ={4,5};  -> this is allowed
  // int[] arr ={4,5}; -> this is allowed
  // int arr[anyValue] ={4,5}; -> this is not allowed]

  // Print array can be done by many ways some are:
  // 1. we used Arrays.toString(arrayName) -> java.uitl.Arrays
  // Arrays.toString(arr1); -> convert to string
  // System.out.println(Arrays.toString(arr1));

  // 2. using loop
  // arr1.length -> length of array

  // for (int i = 0; i < arr1.length; i++) {
  // System.out.print(arr1[i] + " ");
  // }
  // System.out.println("");

  // 3. using for-each loop also known as enhanced for loop
  // for (int i : arr1) {
  // System.out.print(i + " ");
  // }
  // System.out.println("");

}