import java.io.*;

class Program {
  public static String american(int dd, int mm, int yyyy) {
    String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    return String.format("%s %d, %d", month[mm - 1], dd, yyyy);
  }
  public static String european(int dd, int mm, int yyyy) {
    return String.format("%d/%d/%d", dd, mm, yyyy);
  }
  public static void main(String[] args) {
    int day, month, year;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try {
      System.out.print("День недели: ");
      day = Integer.parseInt(br.readLine());
      System.out.print("Месяц: ");
      month = Integer.parseInt(br.readLine());
      System.out.print("Год: ");
      year = Integer.parseInt(br.readLine());
      System.out.println(Program.american(day, month, year));
      System.out.println(Program.european(day, month, year));
    } catch (IOException e) {
      System.out.print(e);
    }
  }
}