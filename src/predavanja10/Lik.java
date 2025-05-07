package predavanja10;

import java.awt.Color;

public abstract class Lik {
  protected double x;
  protected double y;
  protected Color barva;
  private boolean oznacen;

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
  // abstract void narisiOznake();
  abstract void spremeniVelikost(double f);  // poveca lik za faktor f

  // vrne true/false, če tocka (x,y) pripada notranjosti lika
  // abstract boolean pripada(double x, double y);

}
