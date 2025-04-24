package predavanja09;

public class Knjiznica {

  public static void main(String[] args) {
    // Knjiga k = new Knjiga("n", "a", 2000);

    String[] mnenja = new String[]{"Najboljša knjiga vseh časov", "Res dobra knjiga", "42"};
    Leposlovje l1 = new Leposlovje("Štoparski vodnik po Galaksiji", "Douglas Adams", 1990, mnenja);

    System.out.println("------------------------------");
    String index = "array:50;int:25;String:40;class:15";
    StrokovnaKnjiga s1 = new StrokovnaKnjiga("The Java Language Specification", "James Gosling", 2020, index);

    Knjiga[] knjige = new Knjiga[2]; // tabela knjig
    knjige[0] = l1;
    knjige[1] = s1;

    for (int i=0; i<knjige.length; i++)
      knjige[i].izpisi();

    int m1 = -1;
    if (knjige[0] instanceof Leposlovje)
      m1 = ((Leposlovje)knjige[0]).mnenjaBralcev.length;
    System.out.println(m1);
  }
}
