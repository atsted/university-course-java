class Program {
  public static void printArray(int[] arr) {
    for (int e: arr) {
      System.out.print(e + " ");
    }
    System.out.println();  
  }
  public static void swapRange(int[] arr, int start, int len) {
    int i = start;
    int j = start + len - 1;
    while (i < j) {
      arr[i] ^= arr[j];
      arr[j] ^= arr[i];
      arr[i] ^= arr[j];
      ++i; --j;
    }
  }
  public static void swapPrefixAndSuffix(int[] arr, int m) {
    if (arr.length <= m) return;
    Program.swapRange(arr, 0, m);
    Program.swapRange(arr, m, arr.length - m);
    Program.swapRange(arr, 0, arr.length);
  }
  public static void main(String[] args) {
    int m = 5;
    int[] arr = {0,1,2,3,4,5,6,7,8,9};
    Program.printArray(arr);
    Program.swapPrefixAndSuffix(arr, m);
    Program.printArray(arr);
  }
}