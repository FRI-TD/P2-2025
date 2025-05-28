package predavanja13;

import java.io.Serializable;

public class Oseba  implements Serializable {
  String ime;
  int starost;

  public Oseba(String ime, int starost) {
    this.ime = ime;
    this.starost = starost;
  }
}
