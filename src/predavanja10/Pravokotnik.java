package predavanja10;

import edu.princeton.cs.algs4.StdDraw;

import java.awt.*;

public class Pravokotnik extends Lik{
  private double a;
  private double b;

  public Pravokotnik(double x, double y, double a, double b, Color barva) {
    super(x, y, barva);
    this.a = a;
    this.b = b;
  }

  @Override
  void narisi() {
    StdDraw.setPenColor(this.barva);
    StdDraw.filledRectangle(this.x, this.y, this.a, this.b);
  }

  @Override
  void spremeniVelikost(double f) {
    this.a *= f;
    this.b *= f;
  }
}
