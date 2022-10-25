import java.util.Arrays;

public class App {

  public static Object[] rotateRight(Object[] arr) {
    if (arr == null) {
      return null;
    }

    Object[] result = new Object[arr.length];
    for (int i = 0; i < arr.length; i++) {
      result[(i + 1) % result.length] = arr[i];
    }
    // {1, 2, 3, 4, 5}
    // {null, 1, 2, 3, 4} 5?
    // {5, 1, 2, 3, 4}
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