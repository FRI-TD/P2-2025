package predavanja12;

import java.io.File;
import java.util.Scanner;

public class DeliZNic {

  public static void main(String[] args) {
    int a = 0;
    try {
      int x = 5 / a;
      System.out.println(x);
    } catch (Exception e) {
      System.out.println("Deljenje z nic");
      e.printStackTrace();
    }

    int y = 10/a;

    int[] tab = new int[]{1,2,3};
    int t = tab[5];

    //Scanner sc = new Scanner(new File("a.txt"));

  }
}
