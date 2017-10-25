class Program {
  public static void printArray(int[] arr) {
    for (int e: arr) {
      System.out.print(e + " ");
    }
    System.out.println();  
  }
  public static void main(String[] args) {
    int i = 0;
    int[] arr1 = {0, 1, 2, 3, 4};
    int[] arr2 = {5, 6, 7, 8, 9};
    int[] result, tmp = new int[arr1.length + arr2.length];
    System.out.print("Массив 1:\t"); Program.printArray(arr1);
    System.out.print("Массив 2:\t"); Program.printArray(arr2);
    for (int e: arr1) if (e % 2 == 0) {
      tmp[i++] = e;
    }
    for (int e: arr2) if (e % 2 == 1) {
      tmp[i++] = e;
    }
    result = new int[i];
    System.arraycopy(tmp, 0, result, 0, i);
    System.out.print("Результат:\t"); Program.printArray(result);
  }
}