package predavanja03;

import java.util.Random;

public class Loto {

  public static void main(String[] args) {
    Random rnd = new Random();

    for(int i=0; i<7; i++) {
      int s = 1 + rnd.nextInt(39);
      System.out.println(s);
    }

  }
}
