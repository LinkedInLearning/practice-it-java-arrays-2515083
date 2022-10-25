import java.util.Arrays;

public class App {

  public static Object[] rotateRight(Object[] arr) {
    if (arr == null) {
      return null;
    }
    Object[] result = new Object[arr.length];
    // Result[] -> {null, null, null, null, null}
    for (int i = 0; i < arr.length; i++) {
      // arr[] --> {1, 2, 3, 4, 5}
      // result[] -> {5, 1, 2, 3, 4}
      result[(i+1) % result.length] = arr[i];
    }
    return result;
  }

  public static void main(String args[]) {
    Object[] arr = new Integer[] { 1, 2, 3, 4, 5 };

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

    Object[] arr2 = new String[] { "Hello", "there", "my friend" };

    arr2 = rotateRight(arr2);
    System.out.println(Arrays.toString(arr2));
    arr2 = rotateRight(arr2);
    System.out.println(Arrays.toString(arr2));
    arr2 = rotateRight(arr2);
    System.out.println(Arrays.toString(arr2));
  }
}