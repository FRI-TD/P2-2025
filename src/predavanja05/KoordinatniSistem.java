package predavanja05;

public class KoordinatniSistem {

  static int W=80;  // standardna sirina konzole
  static int H=25;  // standardna visina konzole

  static char[][] zaslon = new char[H][W];

  // v tabelo na vsa mesta vpisem presledke
  static void sprazniZaslon() {
    for (int i=0; i<H; i++)
      for (int j = 0; j < W; j++) {
        zaslon[i][j] = ' ';
      }
  }

  static void izpisi() {
    for (int i=0; i<H; i++) {
      for (int j = 0; j < W; j++) {
        System.out.print(zaslon[i][j]);
      }
      System.out.println();
    }
  }

  static void koordinatniSistem() {
    for (int j = 0; j < W ; j++) {
      zaslon[H/2][j] = '-';
    }
    for (int i = 0; i < H; i++) {
      zaslon[i][W/2] = '|';
    }
  }

  public static void main(String[] args) {
    sprazniZaslon();
    koordinatniSistem();
    izpisi();


  }
}
