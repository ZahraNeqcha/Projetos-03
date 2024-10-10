public class Solucao1k {
  public static void main(String[] args) {
      int[][] consumidores = {
              {1, 200}, {2, 500}, {3, 1000}, {1, 150}, {0, 0}
      };

      double totalResidencial = 0, totalComercial = 0, totalIndustrial = 0;
      int contadorResidencial = 0, contadorComercial = 0;

      for (int[] consumidor : consumidores) {
          int tipo = consumidor[0];
          int kWh = consumidor[1];

          if (tipo == 0) break;

          double custo = 0;
          switch (tipo) {
              case 1:
                  custo = kWh * 0.3;
                  totalResidencial += kWh;
                  contadorResidencial++;
                  break;
              case 2:
                  custo = kWh * 0.5;
                  totalComercial += kWh;
                  contadorComercial++;
                  break;
              case 3:
                  custo = kWh * 0.7;
                  totalIndustrial += kWh;
                  break;
          }
          System.out.println("Custo para consumidor do tipo " + tipo + ": R$" + custo);
      }

      double mediaResidencialComercial = (totalResidencial + totalComercial) / (contadorResidencial + contadorComercial);

      System.out.println("Total consumo residencial: " + totalResidencial);
      System.out.println("Total consumo comercial: " + totalComercial);
      System.out.println("Total consumo industrial: " + totalIndustrial);
      System.out.println("Média de consumo (residencial + comercial): " + mediaResidencialComercial);
  }
}


