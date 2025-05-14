package predavanja11;

import java.util.TreeSet;

public class Delitelji {

  // metoda vrne mnozico deliteljev stevila x
  static TreeSet<Integer> delitelji(int x) {
    TreeSet<Integer> result = new TreeSet<>();
    result.add(1);result.add(x);
    for (int i = 2; i <= x/2 ; i++) {
      if (x % i == 0) result.add(i);
    }
    return result;
  }

  public static void main(String[] args) {
    int a = 15;
    TreeSet<Integer> deliteljiA = delitelji(a);

    int b = 25;
    TreeSet<Integer> deliteljiB = delitelji(b);

    System.out.println(deliteljiA);
    System.out.println(deliteljiB);

    TreeSet<Integer> unija = new TreeSet(deliteljiA);
    unija.addAll(deliteljiB);
    System.out.println("Vsi delitelji: " + unija);

    TreeSet<Integer> presek = new TreeSet(deliteljiA);
    presek.retainAll(deliteljiB);
    System.out.println("Skupni delitelji: " + presek);
  }
}
