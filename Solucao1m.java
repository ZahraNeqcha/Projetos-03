public class Solucao1m {
  public static void main(String[] args) {
      int num = 29;
      boolean primo = true;

      if (num < 2) primo = false;
      else {
          for (int i = 2; i <= num / 2; i++) {
              if (num % i == 0) {
                  primo = false;
                  break;
              }
          }
      }

      if (primo) System.out.println(num + " é primo.");
      else System.out.println(num + " não é primo.");
  }
}
