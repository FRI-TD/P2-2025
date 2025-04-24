package predavanja09;

/**
 * Razred Funkcija predstavlja "matematične funkcije" - torej
 * matematične "objekte", ki znajo izračunati vrednost pri danem x
 * in vrednost odvoda pri danem x
 */
abstract public class Funkcija {
  abstract double vrednost(double x);
  abstract double odvod(double x);
}
