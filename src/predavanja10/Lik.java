package predavanja10;

import edu.princeton.cs.algs4.StdDraw;

import java.awt.*;

public abstract class Lik {
  private final int VELIKOST_OZNAKE = 1;

  protected double x;
  protected double y;
  protected Color barva;
  protected boolean oznacen;



  public Lik(double x, double y, Color barva) {
    this.x       = x;
    this.y       = y;
    this.barva   = barva;
    this.oznacen = false;
  }

  void premakni(double deltaX, double deltaY) {
    this.x += deltaX;
    this.y += deltaY;
  }

  abstract void narisi();
  abstract void spremeniVelikost(double f);  // poveca lik za faktor f

  abstract Obmocje getObmocjeLika();

  void narisiOznake() {
    Obmocje obm = getObmocjeLika();

    Color prBarva = StdDraw.getPenColor();
    StdDraw.setPenColor(Color.lightGray);

    StdDraw.filledRectangle(obm.x, obm.y,                       VELIKOST_OZNAKE, VELIKOST_OZNAKE);
    StdDraw.filledRectangle(obm.x, obm.y-obm.visina,            VELIKOST_OZNAKE, VELIKOST_OZNAKE);
    StdDraw.filledRectangle(obm.x+obm.sirina, obm.y,            VELIKOST_OZNAKE, VELIKOST_OZNAKE);
    StdDraw.filledRectangle(obm.x+obm.sirina, obm.y-obm.visina, VELIKOST_OZNAKE, VELIKOST_OZNAKE);

    StdDraw.setPenColor(prBarva);
  }

  // vrne true/false, če tocka (x,y) pripada notranjosti lika
  abstract boolean pripada(double x, double y);

}
