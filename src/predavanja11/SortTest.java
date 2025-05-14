package predavanja11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Oseba implements Comparable<Oseba> {
  String ime;
  int starost;

  public Oseba(String ime, int starost) {
    this.ime = ime;
    this.starost = starost;
  }

  // z metodo compareTo() definiramo, kako (po katerem kriteriju)
  // se elementi primerjajo med seboj
  @Override
  public int compareTo(Oseba o) {
    return this.ime.compareTo(o.ime);
  }
}

public class SortTest {

  public static void main(String[] args) {
    int[] tab = new int[]{4,3,5,3,6,2,8};
    // urejanje "navadne" tabele (to dela na tabelah atomarnih tipov int, double, char, ...)
    Arrays.sort(tab);

    ArrayList<Integer> stevila = new ArrayList<>();
    stevila.add(3);stevila.add(5);
    stevila.add(2);stevila.add(7);
    stevila.add(1);stevila.add(9);

    for(Integer i : stevila)
      System.out.println(i);

    System.out.println("-----------------------------");
    // urejanje seznama (ArrayList) stevil
    Collections.sort(stevila);
    for(Integer i : stevila)
      System.out.println(i);

    ArrayList<Oseba> osebe = new ArrayList<>();
    osebe.add(new Oseba("a",20));
    osebe.add(new Oseba("d",16));
    osebe.add(new Oseba("c",25));

    // urejanje seznama oseb po privzetem kriteriju (za primerjavo elementov
    // se uporabi metoda compareTo(), ki je definirana v razredu Osebe)
    Collections.sort(osebe);

    // urejanje seznama oseb po kriteriju, ki je podan v drugem parametru
    // (za primerjavo elementov se uporabi spodnja metoda compare())
    Collections.sort(osebe, new Comparator<Oseba>() {
      @Override
      public int compare(Oseba o1, Oseba o2) {
        return o1.starost - o2.starost;
      }
    });
    for (Oseba o : osebe)
      System.out.printf("ime: %s, starost: %d\n", o.ime, o.starost);

  }
}
