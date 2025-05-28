package predavanja13;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

public class JavaVerzija {

  public static void main(String[] args) throws Exception {
    FileInputStream fis = new FileInputStream(new File("out/production/predavanja/predavanja13/Copy.class"));
    DataInputStream dis = new DataInputStream(fis);

    int magic = dis.readInt();
    short minor = dis.readShort();
    short major = dis.readShort();

    System.out.printf("Magic: %X\n", magic);
    System.out.printf("Version: %d\n", major);
  }
}
