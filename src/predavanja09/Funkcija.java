package predavanja09;

/**
 * Razred Funkcija predstavlja "matematične funkcije" - torej
 * matematične "objekte", ki znajo izračunati vrednost pri danem x
 * in vrednost odvoda pri danem x
 */
public abstract class Funkcija {
  protected abstract double vrednost(double x);
  protected abstract double odvod(double x);
}
