package predavanja08;

public class StudentiOcene {

  public static void main(String[] args) {
    Student s1 = new Student("Micka", "64193456");
    s1.dodajOceno(10);
    s1.dodajOceno(8);

    Student s2 = new Student("Janez", "63240123");
    s2.dodajOceno(7);
    s2.dodajOceno(10);
    s2.dodajOceno(5);
    s2.dodajOceno(9);

    System.out.printf("Stevilo ocen (student s1): %d\n", s1.stOcen);
    System.out.printf("Stevilo ocen (student s2): %d\n", s2.stOcen);

    System.out.printf("Povprecje s1: %.2f\n", s1.povprecje());
    System.out.printf("Povprecje s2: %.2f\n", s2.povprecje());

    //s1.dolociStatus();
    //s2.dolociStatus();

    s2.dodajOceno(10);
    s2.dodajOceno(10);
    s2.dodajOceno(10);
    System.out.printf("Status študenta 1: %s \n", s1.getStatus());
    System.out.printf("Status študenta 2: %s \n", s2.getStatus());
  }
}
