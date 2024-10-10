public class Solucao1c {
  public static void main(String[] args) {
      int[] numeros = {10, 20, 30, 40, 0};
      int soma = 0, contador = 0;

      for (int num : numeros) {
          if (num <= 0) {
              break;
          }
          soma += num;
          contador++;
      }

      if (contador > 0) {
          System.out.println("Média: " + (soma / (double) contador));
      } else {
          System.out.println("Nenhum número foi digitado.");
      }
  }
}

