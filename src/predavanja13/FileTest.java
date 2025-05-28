package predavanja13;

import java.io.File;

public class FileTest {

  static void mkdirs() {
    File f = new File("D:\\Users\\tomaz\\Dropbox\\FRI\\pedagosko\\P2\\P2_2025\\code\\predavanja\\test\\p2\\naloga1");
    f.mkdirs();
    System.out.println(f.exists());
  }

  static void list() {
    File f = new File("D:\\Users\\tomaz\\Dropbox\\FRI\\pedagosko\\P2\\P2_2025\\code\\predavanja");
    String[] datoteke = f.list();
    for(String datoteka : datoteke)
      System.out.println(datoteka);
  }

  static void izpisiVsebino(String imeMape, String presledki) {
    File f = new File(imeMape);
    String[] datoteke = f.list();
    for(String datoteka : datoteke) {
      System.out.println(presledki + datoteka);
      // ce je datoteka mapa, potem izpisi se njeno vsebino
      File d = new File(f, datoteka);
      if (d.isDirectory())
        izpisiVsebino(d.getAbsolutePath(), presledki + "  ");
    }
  }

  public static void main(String[] args) {
    // mkdirs();
    //list();
    izpisiVsebino("D:\\Users\\tomaz\\Dropbox\\FRI\\pedagosko\\P2\\P2_2025\\code\\predavanja", "");
  }
}
