package predavanja09;

public class Clovek extends Oseba {

  void izpisi() {
    System.out.println("Clovek: " + ime);
  }

  @Override
  public String toString() {
    return "toString() od Clovek: " + ime;
  }
}
