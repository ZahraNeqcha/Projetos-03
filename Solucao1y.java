public class Solucao1y {
  public static void main(String[] args) {
      int[] votos = {1, 2, 3, 4, 2, 1, 1, 3, 4, 1, -1};
      int[] contagem = new int[4];
      int totalVotos = 0;

      for (int voto : votos) {
          if (voto == -1) break;
          if (voto >= 1 && voto <= 4) {
              contagem[voto - 1]++;
              totalVotos++;
          }
      }

      System.out.println("Total de eleitores: " + totalVotos);
      for (int i = 0; i < 4; i++) {
          double percentual = (contagem[i] / (double) totalVotos) * 100;
          System.out.println("Candidato " + (i + 1) + ": " + percentual + "% dos votos.");
      }
  }
}