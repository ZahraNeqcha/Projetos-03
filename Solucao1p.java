public class Solucao1p {
  public static void main(String[] args) {
      int limite = 50;
      int a = 0, b = 1;

      while (a <= limite) {
          System.out.println(a);
          int temp = a;
          a = b;
          b = temp + b;
      }
  }
}
