package predavanja12;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class BranjeDatotekeWithResources {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(new File("ime.txt"));
         PrintWriter pw = new PrintWriter("out.txt");) // ti dve datoteki se bosta avtomatsko zaprli!
    {
      while (sc.hasNextLine())
        sc.nextLine();

    } catch (Exception e) {
      System.out.println("Napaka: " + e);
    }


  }
}
