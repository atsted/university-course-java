class Program {
  public static void main(String[] args) {
    int[][] matr = {
      {0, 1, 2, 3, 4},
      {0, 1, 2, 3, 4},
      {0, 1, 2, 3, 4},
      {0, 1, 2, 3, 4},
      {0, 1, 2, 3, 4}
    };
    for (int i = 0; i < 5; ++i) {
      System.out.print(matr[i][i] + " ");
    }
    System.out.println();
    for (int i = 0; i < 5; ++i) {
      System.out.print(matr[i][5 - (i + 1)] + " ");
    }
    System.out.println();
  }
}