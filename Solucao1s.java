public class Solucao1s {
  public static void main(String[] args) {
      int num = 5;
      long fatorial = 1;

      for (int i = 1; i <= num; i++) {
          fatorial *= i;
      }

      System.out.println(num + "! = " + fatorial);
  }
}