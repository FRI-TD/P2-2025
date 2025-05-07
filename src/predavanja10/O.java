package predavanja10;

public class O {

  static Oseba getRazsirjenaOseba() {
    return new Oseba() {
      void izpisi() {
        System.out.println("Name: " + ime);
      }
    };
  }

  public static void main(String[] args) {
    Oseba[] osebe = new Oseba[2];

    osebe[0]=new Oseba();
    osebe[0].ime = "Janez";
    osebe[1]=getRazsirjenaOseba();
    osebe[1].ime = "Micka";

    for (int i = 0; i <2 ; i++) {
      osebe[i].izpisi();
    }

  }


}
