package si.fri.kodiranje.main;

import org.apache.commons.codec.binary.Base64;

public class Kodirniki {

  /**
   * Sirfiranje vsebine po metodi XOR
   * @param besedilo šifrirno besedilo
   * @param kljuc šifrirni ključ
   * @return zašifrirano besedilo
   */
  public static String kodirajXOR(String besedilo, String kljuc) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < besedilo.length() ; i++) {
      char c1 = besedilo.charAt(i);
      char c2 = kljuc   .charAt(i % kljuc.length());
      result.append((char)(c1 ^ c2));
    }
    return result.toString();
  }

  public static String kodirajNUM(String besedilo) {
    return "";
  }

  /**
   * Kodiranje po metodi Base64. Uporabljamo metodo encodeBase64 iz knjižnice
   * org.apache.commons.codec.
   * @param besedilo kodirno besedilo
   * @return zakodirano besedilo
   */
  public static String kodirajBase64(String besedilo) {
    return new String(Base64.encodeBase64(besedilo.getBytes()));
  }

  public static String odkodirajXOR(String besedilo, String kljuc) {
    return kodirajXOR(besedilo, kljuc);
  }

  public static String odkodirajNUM(String besedilo) {
    return "";
  }

  public static String odkodirajBase64(String besedilo) {
    return new String(Base64.decodeBase64(besedilo.getBytes()));
  }

}
