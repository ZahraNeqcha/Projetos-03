public class Solucao1x {
  public static void main(String[] args) {
      double[][] compras = {
              {50.0, 2}, {30.0, -1}, {20.0, 3}, {100.0, 0}
      };

      double total = 0;

      for (double[] compra : compras) {
          double preco = compra[0];
          int quantidade = (int) compra[1];

          if (quantidade == 0) {
              break;
          }
          if (preco < 0 || quantidade < 0) {
              System.out.println("Valores negativos inválidos. Ignorado.");
              continue;
          }

          total += preco * quantidade;
      }

      System.out.println("Total a ser pago: R$ " + total);
  }
}
