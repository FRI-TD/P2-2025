package predavanja11;

import java.util.Iterator;
import java.util.TreeSet;

public class Dnevi {

  public static void main(String[] args) {
    TreeSet<String> dnevi = new TreeSet<>();  // podatki urejeni po abecedi

    // HashSet  ... za hitrejše delovanje

    dnevi.add("PON");
    dnevi.add("TOR");
    dnevi.add("SRE");
    dnevi.add("CET");
    dnevi.add("PET");
    dnevi.add("SO");
    dnevi.add("NE");

    System.out.println("Stevilo dni v tednu: " + dnevi.size());

//    dnevi.remove("PON");
//    System.out.println("Stevilo dni v tednu: " + dnevi.size());

//    dnevi.remove("FRI");
//    System.out.println("Stevilo dni v tednu: " + dnevi.size());

    dnevi.add("NE");
    System.out.println("Stevilo dni v tednu: " + dnevi.size());

    String s = "XYZ";
    System.out.printf("Mnozica vsebuje element %s: %s\n", s, dnevi.contains(s));

    Iterator<String> it = dnevi.iterator();
    while (it.hasNext()) {
      String dan = it.next();
      System.out.println(dan);
    }

    System.out.println("------------------------------");
    for(String dan : dnevi) {
      System.out.println(dan);
    }

    int[] a = new int[]{5,4,6,3,7,2,8,1};
    for(int x : a)
      System.out.println(x);

    for (int i = 0; i < a.length; i++)
      System.out.printf("Element %d: %d\n", i, a[i]);
  }
}
