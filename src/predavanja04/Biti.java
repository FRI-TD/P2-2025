package predavanja04;

public class Biti {

  static int steviloBitov(int x) {
    int result = 0;
    while (x != 0) {
      if ((x & 1) == 1) {
        result++;
      }
      // result += (x&1);
      x = x >> 1;
    }
    return result;
  }

  static int steviloBitov1(int x) {
    int result = 0;
    while (x != 0) {
      if (x % 2 == 1) {
        result++;
      }
      x = x / 2;
    }
    return result;
  }

  static int steviloBitov2(int x) {
    String dvojisko = Integer.toString(x,2); // pretvori x v dvojiski sistem in vrni niz
    return dvojisko.replaceAll("0", "").length();
  }



    public static void main(String[] args) {
    int x = 31;
    int s = steviloBitov1(x);

    System.out.printf("Stevilo bitov v %d je %d \n", x, s);
  }
}
