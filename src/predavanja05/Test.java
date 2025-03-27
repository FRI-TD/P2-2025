package predavanja05;

public class Test {
  static int i; // inicializacija ni potrebna
  public static void main(String[] args) {
    int x=0; // obvezna inicializacija lokalne spremenljvke!
    System.out.println(i);
    System.out.println(x);

    char a = 'a'; // znak v enojnih narekovajih

    // char z = ''; // ... napaka: znak ne more biti 'prazen"

    String s1 = "niz"; // niz v dvojnih narekovajih
    String s2 = ""; // String pa je lahko prazen

    char nl = '\n';  // kontrolni znak (prehod v novo vrstico)

    char pi = '\u03C0'; // znak, zapisan z uporabo Unicode code

    double π = 3.14;  // Unicode znaki lahko nastopajo tudi v imeih spremenljivk
    System.out.println(π);

    System.out.println(pi);

    int x1 = 0xabba;  // zapis števila v šestnajstiškem sistemu
    int x3 = 0b1010101010101000001010; // dvojiški zapis
    //int x2 = 0xabdfedfe0463; // napaka: šestnajstiški zapis lahko vsebuje le 0-9 in a-f
    //int x4 = 0b010101003;    // napaka: dvojiški zapis lahko vsebuje le 0 in 1

    String niz1 = "abcdefghijklmnoprstuvz";
    System.out.println(niz1.indexOf("i")); // 8

    String niz3 = "Danes je grd dan";
    niz3.replace("grd", "lep");  // niz3 se ne spremeni
    System.out.println(niz3); // -> Danes je grd dan

    String niz4 = niz3.replace("grd", "lep"); // spremembo shranim v niz4
    System.out.println(niz4); // -> Danes je lep dan

    String niz5 = "Danes je grd dan";
    niz5 = niz5.replace("grd", "lep");  // spremembo shranim v isto spremenljivko (niz5)
    System.out.println(niz5); // -> Danes je lep dan


    String niz6 = "Domača   naloga   5  je   zanimiva!";

    System.out.println("-------- PO BESEDAH -----------------------");
    String[] t1 = niz6.split(" +"); // ločilo je "en ali več presledkov" -> razbitje niza po besedah
    for (int i=0; i<t1.length; i++) {
      System.out.println(t1[i]);
    }

    System.out.println("-------- PO ČRKAH ------------------------");
    String[] t2 = niz6.split(""); // "prazno" ločilo -> razbitje niza po črkah
    for (int i=0; i<t2.length; i++) {
      System.out.println(t2[i]);
    }

    System.out.println("---------PO DELIH  ----------------------");
    String niz7 = "abc:def-ghi_xyz*133";
    String[] t3 = niz7.split("[*_:]"); // locila so * ali _ ali :
    for (int i=0; i<t3.length; i++) {
      System.out.println(t3[i]);
    }
  }
}
