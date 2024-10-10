public class Solucao1f {
  public static void main(String[] args) {
      int[] numeros = {4, 16, 25, -999};

      for (int num : numeros) {
          if (num == -999) {
              break;
          }
          System.out.println("Número: " + num);
          if (num >= 0) {
              System.out.println("Raiz quadrada: " + Math.sqrt(num));
          } else {
              System.out.println("Número negativo, sem raiz quadrada.");
          }
          System.out.println("Inverso: " + (1.0 / num));
      }
  }
}
