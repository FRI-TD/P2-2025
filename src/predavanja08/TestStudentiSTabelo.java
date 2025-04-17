package predavanja08;

import java.util.Scanner;

public class TestStudentiSTabelo {

  public static void main(String[] args) {
    int n = 3; // stevilo studentov

    int[] t = new int[3]; // tabela treh int-ov

    Student[] studenti = new Student[n]; // tabela n Student-ov

    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < n; i++) {
      System.out.printf("Vpisi ime studenta %d: ", i + 1);
      String ime = sc.nextLine();

      System.out.printf("Vpisi id             : ");
      String id = sc.nextLine();

      Student s = new Student();
      s.ime = ime;
      s.id = id;

      studenti[i] = s;
    }

    System.out.println("----------------------------------------");
    for (int i = 0; i < studenti.length; i++) {
      System.out.printf("%s, %s\n", studenti[i].ime, studenti[i].id);
    }

  }
}


