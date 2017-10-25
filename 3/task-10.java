class Program {
  public static void printArray(int[] arr) {
    for (int e: arr) {
      System.out.print(e + " ");
    }
    System.out.println();  
  }
  public static int[] reverse(int[] arr) {
    int i, len = arr.length;
    for (i = 0; i < len / 2; ++i) {
      arr[i] ^= arr[len - (i + 1)];
      arr[len - (i + 1)] ^= arr[i];
      arr[i] ^= arr[len - (i + 1)];
    }
    return arr;
  }
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6,7};
    printArray(arr);
    printArray(Program.reverse(arr));
  }
}