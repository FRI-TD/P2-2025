package predavanja11;

import java.util.ArrayList;

public class ArrayListTest {

  public static void main(String[] args) {
    // String[] meseci = new String[12];
    ArrayList<String> meseci = new ArrayList<>();
    meseci.add("januar");
    meseci.add("februar");
    meseci.add("marec");
    meseci.add("april");
    meseci.add("maj");

    // "stara" for zanka:
    for(int i=0; i < meseci.size(); i++) {
      System.out.printf("Mesec %d: %s\n", i, meseci.get(i));
      meseci.set(i, i + ": " + meseci.get(i));
    }

    System.out.println("-------------------------------");
    // uporaba "nove" for zanke
    for(String mesec : meseci)
      System.out.println(mesec);

    meseci.remove("januar");
    meseci.set(2, "oktober");
    System.out.println("-------------------------------");
    for(String mesec : meseci)
      System.out.println(mesec);

    meseci.set(0, "december");
    System.out.println("-------------------------------");
    for(String mesec : meseci)
      System.out.println(mesec);

  }
}
