public class Solucao1j {
  public static void main(String[] args) {
    int[] numeros = { 12, 18, -999 };

    for (int num : numeros) {
      if (num == -999) {
        break;
      }
      System.out.println("Divisores de " + num + ":");
      for (int i = 1; i <= num; i++) {
        if (num % i == 0) {
          System.out.println(i);
        }
      }
    }
  }
}