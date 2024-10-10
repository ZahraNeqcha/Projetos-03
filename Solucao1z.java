public class Solucao1z {
  public static void main(String[] args) {
      double num1 = 10, num2 = 5;
      int opcao = 0;

      do {
          System.out.println("Operações Disponíveis:");
          System.out.println("1. Adição");
          System.out.println("2. Subtração");
          System.out.println("3. Multiplicação");
          System.out.println("4. Divisão");
          System.out.println("9. Sair do Programa");
          opcao = 3;

          switch (opcao) {
              case 1:
                  System.out.println("Resultado: " + (num1 + num2));
                  break;
              case 2:
                  System.out.println("Resultado: " + (num1 - num2));
                  break;
              case 3:
                  System.out.println("Resultado: " + (num1 * num2));
                  break;
              case 4:
                  if (num2 != 0) {
                      System.out.println("Resultado: " + (num1 / num2));
                  } else {
                      System.out.println("Divisão por zero não permitida.");
                  }
                  break;
              case 9:
                  System.out.println("Encerrando o programa...");
                  break;
              default:
                  System.out.println("Opção inválida.");
                  break;
          }
      } while (opcao != 9);
  }
}
