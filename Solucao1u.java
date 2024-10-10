public class Solucao1u {
  public static void main(String[] args) {
      String[][] pessoas = {
              {"João", "25", "M"}, {"Maria", "18", "F"}, {"Carlos", "22", "M"}, {"Ana", "30", "F"},
              {"Pedro", "20", "M"}, {"Lucia", "17", "F"}, {"Rafael", "23", "M"}, {"Julia", "35", "F"},
              {"Marcos", "22", "M"}, {"Carla", "27", "F"}, {"Bruno", "19", "M"}, {"Fernanda", "28", "F"},
              {"Roberto", "26", "M"}, {"Sara", "40", "F"}, {"Gustavo", "29", "M"}, {"Paula", "33", "F"},
              {"Renato", "24", "M"}, {"Laura", "15", "F"}, {"Miguel", "21", "M"}, {"Bianca", "19", "F"}
      };

      for (String[] pessoa : pessoas) {
          String nome = pessoa[0];
          int idade = Integer.parseInt(pessoa[1]);
          char sexo = pessoa[2].charAt(0);

          if (sexo == 'M' && idade > 21) {
              System.out.println(nome);
          }
      }
  }
}