public class Solucao1d {
  public static void main(String[] args) {
      int[] numeros = {150, 90, 180, 210, 0};
      int contador = 0;

      for (int num : numeros) {
          if (num == 0) {
              break;
          }
          if (num >= 100 && num <= 200) {
              contador++;
          }
      }

      System.out.println("Números entre 100 e 200: " + contador);
  }
}
