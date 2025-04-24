package predavanja09;

public class Student {
  final static int MAX_OCEN = 10;

  private String ime;
  private String id;

  private boolean polnoleten;

  private int stOcen;
  private int[] ocene;

  private String status;

  // privzeti konstruktor brez parametrov
  Student() {
    // ničesar ne naredi
  }

  Student(String tIme, String tId) {
    ime = tIme;
    id  = tId;

    stOcen = 0;  // toliko ocen je bilo do sedaj vpisanih
    ocene = new int[MAX_OCEN];

    status = "?";
  }

  // metode "getter/setter" za vse atribute
  public String getIme() {
    return ime;
  }
  public void setIme(String ime) {
    this.ime = ime;
  }

  public String getId() {
    return this.id;
  }
  public void setId(String id) {
    this.id = id;
  }

  public boolean isPolnoleten() {
    return polnoleten;
  }
  public void setPolnoleten(boolean polnoleten) {
    this.polnoleten = polnoleten;
  }

  String getStatus() {
    dolociStatus();
    return status;
  }

  void dodajOceno(int ocena) {
    if (stOcen < MAX_OCEN) {
      ocene[stOcen] = ocena;
      stOcen++;
    }
  }

  double povprecje() {
    double sum = 0;
    for(int i=0; i<stOcen; i++) sum += ocene[i];
    return stOcen == 0 ? 0 : sum / stOcen;
  }

  private void dolociStatus() {
    if (povprecje() >=9)
      status = "Odličen";
    else
      status = "Dober";
  }

}
