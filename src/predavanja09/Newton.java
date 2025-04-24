package predavanja09;

/**
 * V razredu definiramo metodo za računanje ničle
 * poljubne odvedljive funkcije s pomočjo Newtnove
 * iteracijske metode.
 */
public class Newton {

  static double poisciNiclo(Funkcija f, double x0, int n) {
    for(int i=0; i<n; i++)
      x0 = x0 - f.vrednost(x0) / f.odvod(x0);
    return x0;
  }

  public static void main(String[] args) {
    Funkcija f = new Sinus();
    double pi = poisciNiclo(f, 3,1);
    System.out.printf("Moj   PI: %.20f\n", pi);
    System.out.printf("Pravi PI: %.20f\n", Math.PI);

  }
}
