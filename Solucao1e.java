public class Solucao1e {
  public static void main(String[] args) {
      String[] nomes = {"Zahra", "Bruno", "Carlos", "FIM"};

      for (String nome : nomes) {
          if (nome.equals("FIM")) {
              break;
          }
          System.out.println(nome);
      }
  }
}

