package predavanja09;

import java.util.Arrays;

public class TestOseba {

  public static void main(String[] args) {
    Oseba a = new Oseba();
    a.ime = "Micka";
    a.izpisi();
    System.out.println(a.toString());

    Clovek c = new Clovek();
    c.ime = "Janez";
    c.izpisi();

    System.out.println(c);

    int[] tab = new int[]{5,4,3,2,1};
    System.out.println(Arrays.toString(tab));
  }
}
