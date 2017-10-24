class Program {
  public static double convertToKelvin(double t) {
    return t + 273;
  }
  public static double convertoToFahrenheit(double t) {
    return 5 * t / 9 + 32;
  }
  public static void main(String[] args) {
    double[] temperature = { 0, 10, 20, 20.1, 20.2, 20.3 };
    System.out.println("Temperature, C\tTemperature, F\tTemperature, K");
    for (double t: temperature) {
      System.out.printf("%.2f\t\t%.2f\t\t%.2f\n", t, Program.convertoToFahrenheit(t), Program.convertToKelvin(t));
    }
  }
}