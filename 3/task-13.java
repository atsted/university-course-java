class Program {
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
  public static void main(String[] args) {
    double q = 1;
    int[] a = {1,5,4,6,3};
    int[] b = {9,0,2,1,2,4,5};
    int max_a = Program.findMax(a);
    int max_b = Program.findMax(b);
    System.out.println(max_a + " " + max_b);
    System.out.println("Минимум q - (a[i] + b[i]) = " + (q - a[max_a] - b[max_b]));
  }
}