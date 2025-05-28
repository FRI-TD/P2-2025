package predavanja13;

import java.io.*;

public class DataInputStremTest {
  public static void main(String[] args) {
    try ( // zaradi try-with-resources, ni treba pisati dos.close()
          FileInputStream fis = new FileInputStream(new File("viri/data.bin"));
          DataInputStream dis = new DataInputStream(fis);
    ) {
      int   i = dis.readInt();  System.out.println("i=" + i);
      byte  b = dis.readByte();
      char  c = dis.readChar();
      String s = dis.readUTF();
    } catch (Exception e) {
      System.out.println("Napaka: " + e);
    }
  }


}
