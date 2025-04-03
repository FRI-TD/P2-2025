package si.fri.kodiranje.test;

import si.fri.kodiranje.io.BeriPisi;

public class TestBranjePisanje {

  public static void main(String[] args) {
    String vsebina = BeriPisi.preberiDatoteko("viri/veckratniki.txt");
    BeriPisi.zapisiDatoteko("viri/abc.txt", vsebina);
  }
}
