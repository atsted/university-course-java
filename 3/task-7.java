class Program {
  public static void main(String[] args) {
    int[][][] matr = {
      {
        {0, 1, 2},
        {0, 1, 2},
        {0, 1, 2},
      },
      {
        {0, 1, 2}
      }
    };
    int sum = 0;
    for (int i = 0; i < matr.length; ++i) {
      for (int j = 0; j < matr[i].length; ++j) {
        for (int k = 0; k < matr[i][j].length; ++k) {
          sum += matr[i][j][k];
        }
      }
    }
    System.out.println(sum);
  }
}