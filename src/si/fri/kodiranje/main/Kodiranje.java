package si.fri.kodiranje.main;

import si.fri.kodiranje.io.BeriPisi;

/**
 * Program Kodiranje.
 *
 * Preveden program se uporablja z, na primer, takole:
 *
 *   java -jar koriranje.jar XOR code a.txt b.txt geslo
 */
public class Kodiranje {

  public static void main(String[] args) {
    // args = new String[]{"Base64", "decode", "viri/b64.txt", "viri/b64decoded.txt"};

    if (args.length < 4 || args.length > 5 ) {
      System.out.println("Napacno stevilo argumentov!");
      System.exit(1);
    }

    String nacin   = args[0];
    String smer    = args[1];
    String inFile  = args[2];
    String outFile = args[3];
    String kljuc   = (args.length == 5) ? args[4] : "";

    doKodiranje(nacin, smer, inFile, outFile, kljuc);
  }

  /**
   * Klic metod za kodiranje/dekodiranje
   * @param nacin moznosti: XOR, NUM, Base64
   * @param smer code/decode
   * @param inFile vhodna datoteka
   * @param outFile izhodna datoteka
   * @param kljuc ključa za kodiranje (uporabno le za način XOR)
   */
  static void doKodiranje(String nacin, String smer, String inFile, String outFile, String kljuc) {
    String vsebina = BeriPisi.preberiDatoteko(inFile);
    String rezultat = "";
    switch (nacin) {
      case "XOR":
        if (smer.equals("code"))
          rezultat = Kodirniki.kodirajXOR(vsebina, kljuc);
        else
          rezultat = Kodirniki.odkodirajXOR(vsebina, kljuc);
        break;
      case "Base64":
        if (smer.equals("code"))
          rezultat = Kodirniki.kodirajBase64(vsebina);
        else
          rezultat = Kodirniki.odkodirajBase64(vsebina);
        break;
      case "NUM":
        if (smer.equals("code"))
          rezultat = Kodirniki.kodirajNUM(vsebina);
        else
          rezultat = Kodirniki.odkodirajNUM(vsebina);
        break;

      default:
        System.out.println("Napaka - napačen nacin kodiranja!");
        System.exit(2);
    }

    BeriPisi.zapisiDatoteko(outFile, rezultat);
  }
}
