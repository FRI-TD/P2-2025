package predavanja09;

public class Clovek extends Oseba {

  // ko v razredu Clovek ponovno napišem metodo izpisi(),
  // prepišem (override) obstoječo metodo iz nadrazreda
  void izpisi() {
    System.out.println("Clovek: " + ime);
  }

  public String toString() {
    return "toString() od Clovek: " + ime;
  }
}
