package predavanja09;

// StrokovnaKnjiga je Knjiga + kazalo pojmov (indeks)
public class StrokovnaKnjiga extends Knjiga {

  private String index;

  public StrokovnaKnjiga(String naslov, String avtor, int letoIzdaje, String index) {
    super(naslov, avtor, letoIzdaje);
    this.index = index;
  }

  @Override
  void izpisiPodrobnosti() {
    System.out.println("Index:");
    String[] indexTab = index.split(";");
    for (int i = 0; i < indexTab.length; i++) {
      System.out.println("  " + indexTab[i]);
    }
  }
}
