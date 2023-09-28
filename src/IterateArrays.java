import java.util.Arrays;

public class IterateArrays{
  public static void main(String[] args){
    //create the array
    int[] numArr = {6,4,3,5,2,9};

    //iterate through the contents of the array
    for(int i=0; i < numArr.length;i++){
      System.out.print(numArr[i] + " ");      
    } System.out.println();

    //iterate from the last value of the array
    for(int i = numArr.length-1; i >= 0; i--){
      System.out.print(numArr[i] + " ");
    } System.out.println();

    //use a for-each loop
    for(int item : numArr){
      System.out.print(item + " ");
    }

    //JAVA STREAMS
    Arrays.stream(numArr).forEach(System.out::print); //print each item
    //print only the number 4 from array
    System.out.print("\nNumber ");
    Arrays.stream(numArr).filter(num -> num == 4).forEach(System.out::print);
    //sum the values of the array
    System.out.println("\nAverage of values: " + Arrays.stream(numArr).average());
    System.out.print("\nSum of values: " + Arrays.stream(numArr).sum());
  } 