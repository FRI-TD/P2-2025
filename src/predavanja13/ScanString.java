package predavanja13;

import java.io.File;
import java.util.Scanner;

public class ScanString {

  public static void main(String[] args) throws Exception {
    Scanner sc1 = new Scanner(System.in);         // podatki se berejo iz tipkovnice
    Scanner sc2 = new Scanner(new File("a.txt")); // podatki se berejo iz datoteke a.txt
    Scanner sc3 = new Scanner("32 5 8 6");        // podatki se berejo iz niza "32 5 8 6"
    while (sc3.hasNextInt()) {
      int a = sc3.nextInt();
      System.out.println(a);
    }
  }
}
