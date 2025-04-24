package predavanja09;

// Knjiga z osnovnimi podatki (naslov, avtor, letoIzdaje)
abstract public class Knjiga {
  private String naslov;
  private String avtor;
  private int letoIzdaje;

  public Knjiga(String naslov, String avtor, int letoIzdaje) {
    this.naslov = naslov;
    this.avtor = avtor;
    this.letoIzdaje = letoIzdaje;
  }

  abstract void izpisiPodrobnosti();

  void izpisi() {
    System.out.println("Avtor:" + this.avtor);
    System.out.println("Naslov: " + this.naslov);
    System.out.println("Leto izdaje: " + this.letoIzdaje);

    izpisiPodrobnosti();
  }

  public String toString() {
    return String.format("Avtor: %s, Naslov: %s", this.avtor, this.naslov);
  }
}
