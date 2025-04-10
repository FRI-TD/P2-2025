package predavanja07;

import edu.princeton.cs.algs4.StdDraw;
import java.awt.Color;

public class Risanje {

  static void tarca() {
    StdDraw.setScale(-100,100);
    StdDraw.clear(Color.black);
    StdDraw.setPenColor(Color.yellow);

    for (int i = 0; i < 10; i++) {
      StdDraw.circle(0,0, 10*i);
    }
  }

  static void kvadratki() {
    int n = 25;  // stevilo kvadratkov v vrsti in stolpcu
    int t = 10;  // velikost kvadratka

    StdDraw.setScale(0, n*t);

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n ; j++) {
        // tu narisem kvadrat v i-ti vrsti in j-tem stolpcu
        int x = t/2 + t*j;
        int y = t/2 + t*i;

        StdDraw.setPenColor(new Color(j*10, i*10, 0));
        StdDraw.filledSquare(x,y, t/2);
      }
    }
  }

  static void kvadratnaSpirala() {
    StdDraw.setScale(-100,100);

    int[][] smeri = {{0,-1}, {-1,0}, {0,1}, {1,0}};

    int n = 200;
    int smer = 0;
    int trDolzina = 5;

    double trX = 0;
    double trY = 0;

    for(int i=0; i<n; i++) {
      double nX = trX + smeri[smer][0] * trDolzina;
      double nY = trY + smeri[smer][1] * trDolzina;

      StdDraw.line(trX, trY, nX, nY);

      trX = nX;
      trY = nY;
      smer = (smer + 1) % 4;
      trDolzina++;
    }
  }

  static void roza(int n) {
    StdDraw.setScale(-100,100);

    double trX = 0;
    double trY = 0;
    double d   = 1;
    double fi  = 0;
    double deltaFi = 2 * Math.PI / n;

    for (int i = 0; i <n ; i++) { // za vsak list

      for(int j=0; j<n; j++) {
        double nX = trX + Math.cos(fi) * (j<n-1 ? d : 2.5*d);
        double nY = trY + Math.sin(fi) * (j<n-1 ? d : 2.5*d);

        StdDraw.line(trX, trY, nX, nY);
        trX = nX;
        trY = nY;
        if (j < n-1) fi = fi + deltaFi;
      }
    }
  }

  static void radar() {
    StdDraw.setScale(-100,100);

    StdDraw.setPenColor(Color.green);
    StdDraw.setPenRadius(0.01);

    StdDraw.enableDoubleBuffering();

    double kot = 0;
    double deltaKot = 2*Math.PI/360;

    while(true) {
      StdDraw.clear(Color.black);
      for (int i = 0; i < 4; i++)
        StdDraw.circle(0,0, 20 + 20*i);

      double x = 80 * Math.cos(kot);
      double y = 80 * Math.sin(kot);

      StdDraw.line(0,0,x,y);
      kot = kot + deltaKot;

      StdDraw.show();
      StdDraw.pause(100);
    }
  }

  static void ura() {
    StdDraw.setScale(-100,100);

    double kot = 0;
    for (int i=0; i<36; i++) {
      double x1 = 80 * Math.cos(Math.toRadians(kot));
      double y1 = 80 * Math.sin(Math.toRadians(kot));
      double x2 = 85 * Math.cos(Math.toRadians(kot));
      double y2 = 85 * Math.sin(Math.toRadians(kot));

      if (i % 3 == 0)
        StdDraw.setPenRadius(0.03);
      else
        StdDraw.setPenRadius(0.003);

      StdDraw.line(x1,y1,x2,y2);

      kot = kot + 10;
    }

    // izpis stevil
    kot = 0;
    for (int i = 1; i <= 12; i++) {
      double x1 = 95 * Math.cos(Math.toRadians(60-kot));
      double y1 = 95 * Math.sin(Math.toRadians(60-kot));

      StdDraw.text(x1,y1, i+"");
      kot += 30;
    }

  }

  public static void main(String[] args) {
    //tarca();
    //kvadratki();
    //kvadratnaSpirala();
    //roza(50);
    // radar();
    ura();
  }
}
