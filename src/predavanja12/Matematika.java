package predavanja12;

public class Matematika {

  public static double kvocient(double x, double y) throws DeljenjeZEna {
    if (y == 1)
      throw new DeljenjeZEna();

    return x / y;
  }

  public static void main(String[] args) {
    double z = kvocient(10,1);
    System.out.println(z);
  }
}
