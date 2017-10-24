class Program {
  public static void printArray(int[] arr) {
    for (int e: arr) {
      System.out.print(e + " ");
    }
    System.out.println();  
  }
  public static void main(String[] args) {
    int[] arr = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
    int index;
    double value;
    System.out.print("Введите индекс элемента:\t");
    index = Integer.parseInt(System.console().readLine());
    System.out.print("Введите значение элемента:\t");
    value = Double.parseInt(System.console().readLine());
    Program.printArray(arr);
  }
}