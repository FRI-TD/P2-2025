package predavanja05;

public class Nizi {

  // metoda zgradi niz iz pikic dolzine n
  static String zgradiNizString(int n) {
    String niz = "";
    for (int i = 0; i<n; i++) {
      niz += ".";
    }
    return niz;
  }

  static String zgradiNizStringBuffer(int n) {
    StringBuffer niz = new StringBuffer("");
    for (int i = 0; i<n; i++) {
      niz.append(".");
    }
    return niz.toString();
  }


  public static void main(String[] args) {
    int n = 200_000;
    System.out.println("n = " + n);
    System.out.println("Trajanje:");

    long start = System.currentTimeMillis();
    String n1 = zgradiNizString(n);
    // System.out.println(n1.length());
    long end = System.currentTimeMillis();
    System.out.printf("   ... z uporabo razreda String: %d ms\n", (end-start));

    start = System.currentTimeMillis();
    String n2 = zgradiNizStringBuffer(n);
    // System.out.println(n2.length());
    end = System.currentTimeMillis();
    System.out.printf("   ... z uporabo razreda StringBuffer: %d ms\n", (end-start));
  }
}
