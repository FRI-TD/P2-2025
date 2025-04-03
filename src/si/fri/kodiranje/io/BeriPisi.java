package si.fri.kodiranje.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class BeriPisi {

  /**
   * Metoda vrne vsebino datoteke.
   * @param imeDatoteke ime datoteke za branje
   * @return vsebino datoteke
   */
  public static String preberiDatoteko(String imeDatoteke) {
    StringBuilder result = new StringBuilder();

    Scanner sc = null;
    try {
      sc = new Scanner(new File(imeDatoteke));
      while (sc.hasNextLine()) {
        String vrstica = sc.nextLine();

        if (!result.isEmpty()) result.append("\n");
        result.append(vrstica);
      }

    } catch (FileNotFoundException e) {
      return "Napaka pri branju datoteke";
    } finally {
      // to se pa zgodi v VSAKEM primeru
      try {
        sc.close();
      } catch (Exception e) {
        return "Napaka pri zapiranju";
      }
    }
    return result.toString();
  }

  /**
   * Vsebino zapise v datoteko.
   * @param imeDatoteke   ime datoteke
   * @param vsebina vsebina za zapis
   * @return ce zapis uspe, true, false sicer
   */
  public static boolean zapisiDatoteko(String imeDatoteke, String vsebina) {
    try {
      PrintWriter pw = new PrintWriter(imeDatoteke);
      pw.print(vsebina);
      pw.close();

      return true;
    } catch (Exception e) {
      return false;
    }
  }
}
