package predavanja05;

public class Tabele {

  public static void main(String[] args) {
    args = new String[] {"prvi", "drugi"};

    int[] t = new int[3];
    t[0] = 5;
    t[1] = 3;
    t[2] = 1;

    int[] t1 = {5,3,1};  // == new int[3] + inicializacija

    System.out.println(t1[2]);

    // t1 = {4,3,2};
    System.out.println("---------------------------");
    t1 = new int[] {6,4,3,2,2,13};
    System.out.println(t1[5]);
    int[] t2 = {9,8,7};
    t1 = t2;

    try {
      System.out.println(t1[5]);
    } catch (Exception e) {
      // če bo prišlo do izjeme, se bo izpisalo tole:
      System.out.println("Uporabljaš napačen indeks!");
    }


    // vrstica iz datoteke /etc/password
    String uporabnik = "john:x:105:200:John Dear:/home/john:/bin/bash";
    System.out.println(uporabnik.split(":")[6]); // -> /bin/bash

  }
}
