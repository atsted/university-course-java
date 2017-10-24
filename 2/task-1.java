import java.io.*;

class Program {
  public static void main(String[] args) {
    System.out.print("Введите температуру (градусы Цельсия): ");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try {
      float temperature = Float.parseFloat(br.readLine());
      System.out.println("C\t" + (temperature));
      System.out.println("F\t" + (temperature * 5 / 9 + 32));
      System.out.println("K\t" + (temperature + 273));
    } catch (IOException e) {
      System.out.print(e);
    }
  }
}