package predavanja12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BranjeDatoteke {

  public static void main(String[] args) {
    String imeDatoteke = "...";

    Scanner sc = null;
    try {
      sc = new Scanner(new File(imeDatoteke));
      while (sc.hasNextLine())
        sc.nextLine();

      return;
    } catch (FileNotFoundException e) {
      System.out.println("Napaka: " + e);
    } finally {
      if (sc != null)
        sc.close();
    }
  }
}
