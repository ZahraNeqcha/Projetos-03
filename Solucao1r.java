public class Solucao1r {
  public static void main(String[] args) {
      int limiteInferior = 0, limiteSuperior = 100, incremento = 10;

      for (int f = limiteInferior; f <= limiteSuperior; f += incremento) {
          double c = 5 * (f - 32) / 9.0;
          System.out.println(f + "°F = " + c + "°C");
      }
  }
}

