class Program {
  public static void main(String[] args) {
    int[][] a = {
      {0,1,1,1,0,0,0,1,1,1,1,0,0,0},
      {0,1,1,1,0,1,0,1,1,1,1,0,0,0},
      {0,0,0,0,0,1,0,0,0,0,0,0,1,1},
      {0,0,0,0,0,1,0,0,0,0,0,0,1,1},
      {0,0,0,0,0,1,0,0,0,0,0,0,1,1}
    };
    int c = 0;
    int m = a.length;
    int n = a[0].length;
    int[][] visited = new int[m][n];
    for (int i = 0; i < m; ++i) {
      for (int j = 0; j < n; ++j) {
        int oi = i, oj = j;
        if ((a[i][j] == 1) && (visited[i][j] == 0)) {
          while ((i < m) && (a[i][j] == 1)) {
            while ((j < n) && (a[i][j] == 1)) {
              visited[i][j] = 1;
              ++j;
            }
            ++i; j = oj;
          }
          ++c;
        }
        i = oi; j = oj;
      }
    }
    System.out.println(c);
  }
}