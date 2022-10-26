public class App {
  
  public static void main(String[] args) {
    
    CustomArrayList<Integer> customArrayList = new CustomArrayList<>();
    System.out.println(customArrayList.size());

    customArrayList.add(1);
    System.out.println(customArrayList.get(0));
    System.out.println(customArrayList.size());

    customArrayList.add(2);
    System.out.println(customArrayList.get(1));
    System.out.println(customArrayList.size());

    customArrayList.add(3);
    System.out.println(customArrayList.get(2));
    System.out.println(customArrayList.size());

    System.out.println();

    CustomArrayList<String> customArrayList2 = new CustomArrayList<>();
    System.out.println(customArrayList2.size());
    
    customArrayList2.add("Hi");
    System.out.println(customArrayList2.get(0));
    System.out.println(customArrayList2.size());

    customArrayList2.add("Hello");
    System.out.println(customArrayList2.get(1));
    System.out.println(customArrayList2.size());

    customArrayList2.add("Hey");
    System.out.println(customArrayList2.get(2));
    System.out.println(customArrayList2.size());

    customArrayList2.add("Good morning");
    System.out.println(customArrayList2.get(3));
    System.out.println(customArrayList2.size());
  }
}