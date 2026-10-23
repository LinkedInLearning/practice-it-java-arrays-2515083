import java.util.Arrays;

public class App {
  
  public static Object[] rotateRight(Object[] arr) {
   int len= arr.length;
   Object temp=arr[len-1];
   for(int i=1;i<len&&i>0;i++){
     arr[len-i] = arr[len -i-1];
   }
   arr[0]=temp;
    
	return arr;
  }
  
  public static void main(String args[]) {
    Object[] arr = new Integer[] {1, 2, 3, 4, 5};
      
    arr = rotateRight(arr);
    System.out.println(Arrays.toString(arr));
    arr = rotateRight(arr);
    System.out.println(Arrays.toString(arr));
    arr = rotateRight(arr);
    System.out.println(Arrays.toString(arr));
    arr = rotateRight(arr);
    System.out.println(Arrays.toString(arr));
    arr = rotateRight(arr);
    System.out.println(Arrays.toString(arr));
    
    Object[] arr2 = new String[] {"Hello", "there", "my friend"};
    
    arr2 = rotateRight(arr2);
    System.out.println(Arrays.toString(arr2));
    arr2 = rotateRight(arr2);
    System.out.println(Arrays.toString(arr2));
    arr2 = rotateRight(arr2);
    System.out.println(Arrays.toString(arr2));
  }
}