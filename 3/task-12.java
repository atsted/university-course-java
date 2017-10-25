class Program {
  public static double computePV(int[] a, double x) {
    double b = a[0];
    for (int i = 1; i < a.length; ++i) {
      b = b * x + a[i];
    }
    return b;
  }
  public static void main(String[] args) {
    int[] arr = {1, 2, 3};
    System.out.println(Program.computePV(arr, 0));
    System.out.println(Program.computePV(arr, 1));
    System.out.println(Program.computePV(arr, 2));
  }
}