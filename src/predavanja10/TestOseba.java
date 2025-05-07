package predavanja10;

class OsebaPlus extends Oseba {
  void izpisi() {
    System.out.println("Ime: " + ime);
  }
}

public class TestOseba {

  public static void main(String[] args) {
    Oseba o = new OsebaPlus();
    o.ime = "Micka";

    Oseba o2 = new Oseba() {
      void izpisi() {
        System.out.println("Name: " + ime);
      }
    };
    o2.ime = "Janez";
    o2.izpisi();

    //o.izpisi();
  }
}
