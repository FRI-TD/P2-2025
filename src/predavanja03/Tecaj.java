package predavanja03;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class Tecaj {
  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.ENGLISH);

    Scanner sc = new Scanner(new File("viri/bitcoin.txt"));

    double max=Double.MIN_VALUE; // najvecja do sedaj prebrana vrednost
    double min=Double.MAX_VALUE;

    String minD="", maxD="";

    while (sc.hasNext()) {
      String datum    = sc.next();
      double vrednost = sc.nextDouble();

      if (vrednost > max) {
        max  = vrednost;
        maxD = datum;
      }
      if (vrednost < min) {
        min  = vrednost;
        minD = datum;
      }
    }

    System.out.printf("Najmanjša vrednost: %.2f (%s)\n", min, minD);
    System.out.printf("Največja  vrednost: %.2f (%s)\n", max, maxD);

    sc.close();
  }
}
