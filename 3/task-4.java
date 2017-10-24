class Program {
  public static void printArray(int[] arr) {
    for (int e: arr) {
      System.out.print(e + " ");
    }
    System.out.println();  
  }
  // Find the first maximum element of array
  public static int findMax(int[] arr) {
    int index = 0, len = arr.length;
    if (len == 0) return -1;
    for (int i = 1, max = arr[0]; i < arr.length; ++i) {
      if (max < arr[i]) {
        max = arr[i];
        index = i;
      }
    }
    return index;
  }
  // Find the first minimum element of array
  public static int findMin(int[] arr) {
    int index = 0, len = arr.length;
    if (len == 0) return -1;
    for (int i = 1, min = arr[0]; i < arr.length; ++i) {
      if (arr[i] < min) {
        min = arr[i];
        index = i;
      }
    }
    return index;
  }
  public static void main(String[] args) {
    int[] arr = {4, 3, 2, 1, 5, 7, 9, 8};
    System.out.print("Массив:\t"); Program.printArray(arr);

    int min, max;
    min = Program.findMin(arr);
    max = Program.findMax(arr);
    arr[max] ^= arr[min];
    arr[min] ^= arr[max];
    arr[max] ^= arr[min];

    System.out.print("Массив:\t"); Program.printArray(arr);
  }
}