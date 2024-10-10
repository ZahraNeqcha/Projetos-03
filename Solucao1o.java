public class Solucao1o {
  public static void main(String[] args) {
      int[] numeros = {10, 15, 22, -9999};
      int maior = Integer.MIN_VALUE;

      for (int num : numeros) {
          if (num == -9999) break;
          if (num > maior) maior = num;
      }

      System.out.println("Maior número: " + maior);
  }
}
