public class Obresti {
  /*
     To je program za racunanje obresti.
  */
  public static void main(String[] args) {
    double G = 1000; // glavnica
    double p = 10;   // obrestna mera
    int    n = 10;   // stevilo let

    double Gn = G*Math.pow(1+p/100,n);  // G*(1+p/100)^n 
    System.out.println(Gn);
  }
}