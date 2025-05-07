package predavanja09;

// Implementacija ene od matematičnih funkcij (funkcija sin())
public class Sinus extends Funkcija {
  @Override
  public double vrednost(double x) {
    return Math.sin(x);
  }

  @Override
  public double odvod(double x) {
    return Math.cos(x);
  }
}
