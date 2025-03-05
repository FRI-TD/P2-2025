package predavanja02;

import java.util.Locale;

public class Sladoled {

  public static void main(String[] args) {
    double enaKepica = 1.25;

    System.out.println("Stevilo kepic | Cena (EUR)");
    System.out.println("--------------------------");

    Locale.setDefault(Locale.of("sl", "SI"));

    int i;
    for(i=1; i <= 10; i = i + 1) {
      System.out.printf("%5d         | %5.2f\n", i, i*enaKepica);
    }
  }
}
