package predavanja10;


import predavanja09.Funkcija;
import predavanja09.Newton;

class Polinom extends Funkcija {

  private int[] a; // koeficienti

  public Polinom(int[] a) {
    this.a = a;
  }

  public double vrednost(double x) {
    double result = 0;
    for (int i = 0; i < a.length; i++) {
      result += a[i] * Math.pow(x,i);
    }
    return result;
  }

  public double odvod(double x) {
    double result = 0;
    for (int i = 1; i < a.length; i++) {
      result += a[i] * i * Math.pow(x,i-1);
    }
    return result;
  }
}


public class TestNewton {

  public static void main(String[] args) {
    Polinom f = new Polinom(new int[] {3,-1,-3,1});

    double x = Newton.poisciNiclo(f, -0.1, 10);
    System.out.println(x);

    Funkcija cosinus = new Funkcija() {
      protected double vrednost(double x) {
        return Math.cos(x);
      }
      protected double odvod(double x) {
        return -Math.sin(x);
      }
    };
  }
}
