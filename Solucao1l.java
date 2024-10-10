public class Solucao1l {
  public static void main(String[] args) {
      int[] idades = {15, 22, 30, 55, 19, 51, 130};

      int menosDe21 = 0, maisDe50 = 0;

      for (int idade : idades) {
          if (idade < 0 || idade > 120) break;
          if (idade < 21) menosDe21++;
          if (idade > 50) maisDe50++;
      }

      System.out.println("Total de pessoas com menos de 21 anos: " + menosDe21);
      System.out.println("Total de pessoas com mais de 50 anos: " + maisDe50);
  }
}
