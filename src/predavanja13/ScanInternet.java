package predavanja13;

import java.net.URL;
import java.util.Scanner;

public class ScanInternet {

  public static void main(String[] args) {
    try {
      URL url = new URL("https://zoo.si/");
      Scanner sc = new Scanner(url.openStream());
      while (sc.hasNextLine())
        System.out.println(sc.nextLine());
    } catch (Exception e) {
      System.out.println("Napaka: " + e);
    }
  }
}
