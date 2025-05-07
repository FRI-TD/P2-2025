package predavanja10;

import edu.princeton.cs.algs4.StdDraw;

import java.awt.*;

public class Krog extends Lik {
  private double r;

  public Krog(double x, double y, double r, Color barva) {
    super(x, y, barva);
    this.r = r;
  }

  void narisi() {
    StdDraw.setPenColor(this.barva);
    StdDraw.filledCircle(x,y,r);
  }

  void spremeniVelikost(double f) {
    this.r *= f;
  }
}
