package predavanja03;


import java.util.Scanner;

public class Ocene {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int ocena;
    int vsota = 0; // vsota vpisanih ocen
    int n     = 0; // stevilo vpisanih stevil
    do {
      System.out.print("Vpisi oceno: ");

      try {
        ocena = sc.nextInt();
      } catch (Exception e) {
        sc.nextLine();
        // sem pridem le ce uporabnik vpise neveljavno oceno
        ocena = 1;
      }

      if (ocena != 0 && (ocena < 5 || ocena > 10)) {
        System.out.println("Neveljavna ocena!");
        continue;
      }

      if (ocena != 0) {
        vsota += ocena;  // vsoti pristejem pravkar prebrano oceno
        n += 1;
      }
    } while (ocena > 0);

    if (n != 0) {
      System.out.printf("Povprecje vpisanih ocen: %.2f \n", 1.0*vsota / n);
      //System.out.printf("Povprecje vpisanih ocen: %.2f \n", (double)vsota/n);
    } else {
      System.out.println("Ni bilo vpisanih ocen.");
    }
  }
}
