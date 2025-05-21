package predavanja12;

import java.util.*;

public class Meseci {

  public static void main(String[] args) {
    Map<String, Integer> meseci = new TreeMap<>();

    meseci.put("JAN", 31);
    meseci.put("FEB", 28);
    meseci.put("MAR", 31);
    meseci.put("APR", 30);
    meseci.put("MAJ", 31);
    meseci.put("JUN", 30);
    meseci.put("JUL", 31);

    System.out.println(meseci.size());

    if (meseci.containsKey("DEC"))
      System.out.println("true");
    else
      System.out.println("false");

    // izpis vseh mesecev
    System.out.println("--------------------------\nKljuci\n-----------------------");
    Set<String> kljuci = meseci.keySet();
    for(String kljuc : kljuci) {
      System.out.printf("Mesec: %s, Stevilo dni: %d\n", kljuc, meseci.get(kljuc));
    }


    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
    // izpis mesec od najkrajsega do najdaljsega
    ArrayList<String> urejeni = new ArrayList<>(meseci.keySet());
    urejeni.sort(new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        int d1 = meseci.get(o1);
        int d2 = meseci.get(o2);
        if (d1 != d2)
          return d1 - d2;
        else
          return -o1.compareTo(o2);
          // return o2.compareTo(o1);

      }
    });

    for(String u : urejeni) {
      System.out.printf("Mesec: %s, Stevilo dni: %d\n", u, meseci.get(u));
    }
  }
}
