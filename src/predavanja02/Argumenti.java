package predavanja02;

public class Argumenti {

  public static void main(String[] args) {
    args = new String[] {"x", "y"};

    System.out.println("Stevilo argumentov: " + args.length);
    for (int i=0; i < args.length; i++) {
      System.out.printf("Argument %d: %s\n", i+1, args[i]);
    }
  }
}
