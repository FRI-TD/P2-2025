package predavanja09;

// Leposlovje je Knjiga + tabela z mnenji bralcev
public class Leposlovje extends Knjiga {

  String[] mnenjaBralcev;

  public Leposlovje(String naslov, String avtor, int letoIzdaje, String[] mnenjaBralcev) {
    super(naslov, avtor, letoIzdaje);

    this.mnenjaBralcev = mnenjaBralcev;
  }

  void izpisiPodrobnosti() {
    System.out.println("Mnenja bralcev: ");
    for (int i=0; i<mnenjaBralcev.length;i++)
      System.out.println("  "  + mnenjaBralcev[i]);
  }
}
