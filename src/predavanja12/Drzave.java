package predavanja12;

import java.io.File;
import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class Drzave {

  static TreeMap<String, Drzava> preberiDrzave(String imeDatoteke) {
    TreeMap<String, Drzava> drzave = new TreeMap<>();
    try {
      Scanner sc = new Scanner(new File(imeDatoteke));

      while (sc.hasNextLine()) {
        String vrstica = sc.nextLine();
        String[] deli  = vrstica.split(":");
        if (deli.length == 3) {
          int stp = -1;
          try {stp = Integer.parseInt(deli[2]);} catch (Exception ex) {}
          if (stp != -1) {
            Drzava d = new Drzava(deli[0], deli[1], stp);
            drzave.put(deli[0], d);
          }
        }
      }

      sc.close();
    } catch (Exception e) {
      System.out.println("Napaka: " + e);
    }

    return drzave;
  }

  static TreeMap<String, Drzava> preberiDrzaveX(String imeDatoteke) throws Exception {
    TreeMap<String, Drzava> drzave = new TreeMap<>();

    Scanner sc = new Scanner(new File(imeDatoteke));
    sc.close();

    return drzave;
  }

  public static void main(String[] args) throws Exception  {
    // HashMap<String, Drzava> drzaveX = preberiDrzaveX("drzave.txt");

    TreeMap<String, Drzava> drzave = preberiDrzave("viri/drzave.txt");
    for(String kratica : drzave.keySet()) {
      System.out.println(kratica);
    }

    TreeSet<Drzava> drzave1 = new TreeSet(drzave.values());
    for (Drzava dr : drzave1)
      System.out.println(dr);

  }
}


//  java Drzave  ---> JVM (java)
//  try{
//    main(....);
//  } catch (Exception e) {
//    e.printStackTrace();
//  }