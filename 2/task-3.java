import java.io.*;

class Program {
  public static int countPassedSeconds(int hour, int minute, int second) {
    return ((hour * 60 + minute) * 60 + second) % 86400;
  }
  public static double countPassedPercent(int hour, int minute, int second) {
    int passed = Program.countPassedSeconds(hour, minute, second);
    return passed * 100.0 / 86400;
  }
  public static void main(String[] args) {
    int hour, minute, second;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try {
      System.out.print("Часы: ");
      hour = Integer.parseInt(br.readLine());
      System.out.print("Минуты: ");
      minute = Integer.parseInt(br.readLine());
      System.out.print("Секунды: ");
      second = Integer.parseInt(br.readLine());
      System.out.println(Program.countPassedSeconds(hour, minute, second));
      System.out.println(Program.countPassedPercent(hour, minute, second));
    } catch (IOException e) {
      System.out.print(e);
    }
  }
}