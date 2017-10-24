class Program {
  public static void printArray(int[] arr) {
    for (int e: arr) {
      System.out.print(e + " ");
    }
    System.out.println();  
  }
  public static double sumOfEven(int[] arr) {
    int sum = 0;
    for (int e: arr) if (e % 2 == 0) {
      sum += e;
    }
    return sum;
  }
  public static double sumOfOdd(int[] arr) {
    int sum = 0;
    for (int e: arr) if (e % 2 == 1) {
      sum += e;
    }
    return sum;
  }
  public static void main(String[] args) {
    int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    System.out.print("Массив: "); Program.printArray(arr);
    System.out.println("Сумма четных элементов:\t\t" + Program.sumOfEven(arr));
    System.out.println("Сумма нечетных элементов:\t" + Program.sumOfOdd(arr));
  }
}