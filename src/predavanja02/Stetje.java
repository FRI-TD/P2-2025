package predavanja02;

public class Stetje {

  public static void main(String [] args) {

    // tabela se avtomatsko incializira na 0
    int [] t = new int[26];  // tabela s 26 polji

    String [] besede = {"pomlad", "jabolko", "jesen", "zima", "lopar", "bor"};

    // for zanka po vseh besedah
    for(int i=0; i < besede.length;  i++) {
      char c = besede[i].charAt(0);  // prva crka i-te besede
      int index = c - 'a';
      t[index] = t[index] + 1;

/*
      if (c == 'a') {
        t[0] = t[0] + 1;
      }
      if (c == 'b') {
        t[1] = t[1] + 1;
      }
      if (c == 'c') {
        t[2] = t[2] + 1;
      }
      ...
 */
    }

    for(int i=0; i<t.length; i++) {
      System.out.printf("Stevilo besed na crko '%c': %d\n", ('a'+i), t[i]);
    }

  }
}
