import java.util.Arrays;

public class App {

  public static Integer findSecondSmallestItem(Integer[] arr) {

    if (arr.length <= 1) {
      return null;
    } else {
      Arrays.sort(arr);
      for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] != arr[i + 1]) {
          return arr[i + 1];
        }

      }
      return null;
    }
  }

  public static Integer findSecondSmallestItem2 (Integer[] arr) {
    int smallest = Integer.MAX_VALUE;
    int secondSmallest = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++){
      int current = arr[i];
      if (current < smallest){
        secondSmallest = smallest;
        smallest = current;
      }else if(current < secondSmallest && current != smallest){
        secondSmallest = current;
      }
    }
    if (secondSmallest == Integer.MAX_VALUE) { 
      return null;
    }
    return secondSmallest;
  }

  public static void main(String args[]) {
    Integer[] arr = new Integer[] { 5, 8, 3, 2, 6 };
    System.out.println(findSecondSmallestItem(arr));

    Integer[] arr2 = new Integer[] { 3, 8, 5, 2, 6 };
    System.out.println(findSecondSmallestItem(arr2));

    Integer[] arr3 = new Integer[] { 6, 8, 5, 2, 3 };
    System.out.println(findSecondSmallestItem(arr3));

    Integer[] arr4 = new Integer[] { 3, 3, 3, 3, 3 };
    System.out.println(findSecondSmallestItem(arr4));

    Integer[] arr5 = new Integer[] { 3, 3, 3, 2, 3 };
    System.out.println(findSecondSmallestItem(arr5));

    Integer[] arr6 = new Integer[] { 3, 4, 3, 3, 3 };
    System.out.println(findSecondSmallestItem(arr6));

    Integer[] arrEmpty = new Integer[] {};
    System.out.println(findSecondSmallestItem(arrEmpty));

    Integer[] arrOne = new Integer[] { 1 };
    System.out.println(findSecondSmallestItem(arrOne));
  }
}