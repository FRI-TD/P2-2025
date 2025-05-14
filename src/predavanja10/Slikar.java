package predavanja10;

import edu.princeton.cs.algs4.StdDraw;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Slikar {
  static final int MAX_LIKI = 100;


  public static void main(String[] args) {
    StdDraw.setScale(0, 100);

    int stLikov = 0;
    Lik[] liki  = new Lik[MAX_LIKI];

    liki[stLikov++] = new Krog(50,50, 10, Color.red);
    liki[stLikov++] = new Pravokotnik(20,20, 10, 30, Color.blue);
    liki[stLikov++] = new Kvadrat(85,85, 10, Color.green);
    liki[stLikov++] = new Kvadrat(90,90, 5, Color.yellow);

    StdDraw.enableDoubleBuffering();
    while (true) {
      StdDraw.clear();

      // premik
      if (StdDraw.hasNextKeyTyped()) {
        char key = StdDraw.nextKeyTyped();
        double deltaX = 0, deltaY = 0, f=1;
        switch (key) {
          case 'a': deltaX = -5; break;
          case 'd': deltaX =  5; break;
          case 'w': deltaY =  5; break;
          case 's': deltaY = -5; break;
          case '+': f      = 1.1; break;
          case '-': f      = 0.9; break;
        }
        for (int i = 0; i <stLikov ; i++) {
          if (liki[i].oznacen) {
            liki[i].premakni(deltaX, deltaY);
            liki[i].spremeniVelikost(f);
          }
        }

      }

      if (StdDraw.isMousePressed()) {
        if (!StdDraw.isKeyPressed(KeyEvent.VK_SHIFT)) {
          for (int i = 0; i < stLikov; i++) {
            liki[i].oznacen = false;
          }
        }

        double x = StdDraw.mouseX();
        double y = StdDraw.mouseY();

        for (int i = 0; i < stLikov; i++) {
          if (liki[i].pripada(x,y))
            liki[i].oznacen = true;
        }
      }

      for (int i = 0; i <stLikov ; i++) {
        liki[i].narisi();
        if (liki[i].oznacen)
          liki[i].narisiOznake();
      }

      StdDraw.show();
      StdDraw.pause(100);
    }
  }
}
