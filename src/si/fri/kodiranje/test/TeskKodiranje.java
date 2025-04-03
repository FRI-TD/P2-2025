package si.fri.kodiranje.test;

import si.fri.kodiranje.main.Kodirniki;

public class TeskKodiranje {

  public static void main(String[] args) {
    String kljuc = "fri";
    String besedilo = "danes je lep dan";
    //String zakodirano = Kodirniki.kodirajXOR(besedilo, kljuc);
    //String odkodirano = Kodirniki.odkodirajXOR(zakodirano, kljuc);
    String zakodirano = Kodirniki.kodirajBase64(besedilo);
    String odkodirano = Kodirniki.odkodirajBase64(zakodirano);

    System.out.println("Besedilo:" + besedilo);
    System.out.println("Zakodirano: " + zakodirano);
    System.out.println("Odkodirano: " + odkodirano);
  }
}
