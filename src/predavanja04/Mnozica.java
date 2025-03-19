package predavanja04;

public class Mnozica {

  static int getPraznaMnozica() {
    return 0;
  }

  static int getIndex(char c) {
    return c - 'a';
  }

  static int dodajElement(int m, char c) {
    int index = getIndex(c);
    int kar   = 1 << index;   // = Math.pow(2, index)
    return m | kar; // v m prizgem karakteristicni index
  }

  static int dodajElemente(int m, char... c) {
    for (int i=0; i<c.length; i++) {
      char z = c[i];
      m = dodajElement(m, z);
    }
    return m;
  }


  static String toString(int m) {
    String result = "";
    for (char c='a'; c <= 'z'; c++) {
      int index = getIndex(c);
      int kar = 1 << index;
      if ((m & kar) == kar) {
        result += (result.isEmpty() ? "" : ",") + c  ;
      }
    }
    return "[" + result + "]";
  }

  static int presek(int m1, int m2) {
    return m1 & m2;
  }
  static int unija(int m1, int m2) {
    return m1 | m2;
  }

  static int brisiElement(int m, char c) {
    int index = getIndex(c);
    int kar   = 1 << index;

    return m & (~kar);
  }

  public static void main(String[] args) {
    int mnozica1 = getPraznaMnozica();
    mnozica1 = dodajElement(mnozica1, 'a');
    mnozica1 = dodajElement(mnozica1, 'i');
    mnozica1 = dodajElement(mnozica1, 'e');
    mnozica1 = dodajElement(mnozica1, 'z');
    System.out.printf("Mnozica1=%s\n", toString(mnozica1));

    int mnozica2 = getPraznaMnozica();
    mnozica2 = dodajElemente(mnozica2, 'a', 'f','z', 'b');
    System.out.printf("Mnozica2=%s\n", toString(mnozica2));

    int presek = presek(mnozica1, mnozica2);
    int unija  = unija (mnozica1, mnozica2);
    System.out.printf("presek(%s, %s)=%s\n",
           toString(mnozica1), toString(mnozica2), toString(presek));
    System.out.printf("unija (%s, %s)=%s\n",
            toString(mnozica1), toString(mnozica2), toString (unija));

  }
}
