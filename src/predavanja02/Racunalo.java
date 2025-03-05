package predavanja02;

public class Racunalo {
  public static void main(String[] args) {
    if (args.length != 3) {
      System.out.println("Napaka!");
      System.out.println("Uporaba programa: java Racunalo x op y");
      System.exit(1);
    }

    int x = Integer.parseInt(args[0]);
    int y = Integer.parseInt(args[2]);
    String op = args[1];

    int rezultat = 0;
    if (op.equals("+")) {
      rezultat = x + y;
    } else if (op.equals("-")) {
      rezultat = x - y;
    } else if (op.equals("*")) {
      rezultat = x * y;
    } else if (op.equals("/")) {
      rezultat = x / y;
    }

    System.out.printf("%d %s %d = %d\n", x, op, y, rezultat);
  }
}
