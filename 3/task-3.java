class Program {
  public static void printArray(int[] arr) {
    for (int e: arr) {
      System.out.print(e + " ");
    }
    System.out.println();  
  }
  public static void main(String[] args) {
    int[] arr = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
    int index, value, len = arr.length;
    for (;;) {
      System.out.print("Введите индекс элемента:\t");
      index = Integer.parseInt(System.console().readLine());
      System.out.print("Введите значение элемента:\t");
      value = Integer.parseInt(System.console().readLine());
      if (index < 0 || index >= len) {
        System.out.printf("Значение индекса должно лежать в интревале [0;%d]\n", len - 1);
        continue;
      } else {
        arr[index] = value;
        System.out.print("Массив:\t"); Program.printArray(arr);
      }
      System.out.print("Вы хотите продолжить? [y/n] ");
      if (System.console().readLine().equals("n")) break;
    }
  }
}