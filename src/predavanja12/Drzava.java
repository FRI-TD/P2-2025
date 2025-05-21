package predavanja12;

public class Drzava implements Comparable<Drzava> {
  private String kratica;
  private String glavnoMesto;
  private int steviloPrebivalcev;

  public Drzava(String kratica, String glavnoMesto, int steviloPrebivalcev) {
    this.kratica = kratica;
    this.glavnoMesto = glavnoMesto;
    this.steviloPrebivalcev = steviloPrebivalcev;
  }

  public String getKratica() {
    return kratica;
  }

  public void setKratica(String kratica) {
    this.kratica = kratica;
  }

  public String getGlavnoMesto() {
    return glavnoMesto;
  }

  public void setGlavnoMesto(String glavnoMesto) {
    this.glavnoMesto = glavnoMesto;
  }

  public int getSteviloPrebivalcev() {
    return steviloPrebivalcev;
  }

  public void setSteviloPrebivalcev(int steviloPrebivalcev) {
    this.steviloPrebivalcev = steviloPrebivalcev;
  }

  @Override
  public int compareTo(Drzava o) {
    return this.getKratica().compareTo(o.getKratica());
  }

  @Override
  public String toString() {
    return String.format("Kratica: %s, Glavno mesto: %s, Stevilo prebivalcev: %d", this.getKratica(), this.getGlavnoMesto(), this.getSteviloPrebivalcev());
    // return "Kratica: " + this.getKratica() + ", Glavno mesto"
  }
}
