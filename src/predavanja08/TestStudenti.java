package predavanja08;

import java.util.Random;

public class TestStudenti {

  public static void main(String[] args) {
    Random rnd = new Random();

    Student s1 = new Student();
    s1.ime = "Lojze";
    s1.id  = "632401234";

    Student s2 = new Student("Micka","632409873");

    Student s3 = new Student("Janez", "631934235");

    System.out.println(s1.ime);
    System.out.println(s2.id);
  }
}
