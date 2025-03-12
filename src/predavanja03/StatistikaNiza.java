package predavanja03;

public class StatistikaNiza {

  static void izpisStatistike(String niz) {
    System.out.printf("Niz             : %s \n", niz);
    System.out.printf("Prva crka       : %c \n", niz.charAt(0));

    int dolzina = niz.length();
    System.out.printf("Zadnja crka     : %c \n", niz.charAt(dolzina-1));

    String brezPresledkov = niz.replaceAll(" ", "");
    System.out.printf("Brez presledkov : %s \n", brezPresledkov);

    System.out.printf("Stevilo besed   : %d\n", niz.length() - brezPresledkov.length() + 1);

    System.out.printf("Obrnjnen niz    : ");
    for(int i=dolzina-1; i>=0; i--) {
      System.out.printf("%c", niz.charAt(i));
    }
    System.out.println();
  }

  public static void main(String[] args) {
    izpisStatistike("Danes je lep dan!");
    izpisStatistike("Spet je sreda");
  }
}
