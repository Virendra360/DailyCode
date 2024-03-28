package ArrayInJava;
import java.util.Arrays;

public class TwoDimensionalArray{

  int rows;
  int cols;
  int[][] arr;

  public TwoDimensionalArray(int rows, int cols){
    arr= new int[rows][cols];
  }

  public void printArray(){
    System.out.println(Arrays.deepToString(arr));
  }

  public void insert(int row, int col, int value){
    try{
      arr[row][col]=value;
    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Enter index in valid range");
    }
  }

  // Multi-Dimensional Array 
      // Two-Dimensional Array is one of the type of Multi-Dimensional Array
      // dataType[][] arrayName; -> declaration
      // arrayName = new dataType[rows][cols]; -> initialization
      // dataType[][] arrayName = new dataType[rows][cols]; -> declaration + iniitalization
      // dataType[][] arrayName = { {value1, value2, value3, ...}, {value1, value2, value3, ...},...} declaration + iniitalization

      // int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

    // in multi-dimensional array aslo can't have value in dataType arrayName[rows][cols] same 1D Array

      // Printing 2-D Array
      // Arrays.toString(arrayName) not work for multi-dimensional array
      // we used Arrays.deepToString(arrayName)
  // System.out.println(Arrays.deepToString(arr));
}