public class Solucao1n {
  public static void main(String[] args) {
      int[] numeros = {3, 5, 10, 17, -1};
      int contadorPrimos = 0;

      for (int num : numeros) {
          if (num <= 0) break;

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

          if (primo) contadorPrimos++;
      }

      System.out.println("Quantidade de números primos: " + contadorPrimos);
  }
}


