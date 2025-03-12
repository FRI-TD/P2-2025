package predavanja03;

import java.io.*;

public class Veckratniki {

  public static void main(String[] args) throws Exception {
    int n = 7;  // postevanka stevila n
    int a = 3;  // spodnja meja intervala izpisa
    int b = 6;  // zgornja meja intervala izpisa

    PrintWriter p = new PrintWriter("viri/veckratniki.txt");

    for (int i=a; i<=b; i++) {
      p.printf("%d * %d = %d\n", i, n, i*n);
    }

    p.close();
  }
}
