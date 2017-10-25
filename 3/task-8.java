import java.util.HashSet;

class Program {
  public static void printArray(Object[] arr) {
    for (Object e: arr) {
      System.out.print(e + " ");
    }
    System.out.println();  
  }
  public static Object[] unique(Object[] arr) {
    HashSet<Object> set = new HashSet<Object>();
    for (Object e: arr) set.add(e);
    return set.toArray();
  }
  public static void main(String[] args) {
    Object[] arr = {1,2,3,3,4,2,5,5,1,6,7,7,3,8};
    printArray(arr);
    printArray(Program.unique(arr));
  }
}