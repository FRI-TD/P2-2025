package predavanja13;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataOutputStreamTest {

  public static void main(String[] args) {
    try ( // zaradi try-with-resources, ni treba pisati dos.close()
      FileOutputStream fos = new FileOutputStream(new File("viri/data.bin"));
      DataOutputStream dos = new DataOutputStream(fos);
    ) {
      dos.writeInt(32);
      dos.writeByte(32);
      dos.writeChar('a');
      dos.writeUTF("abcdš");
    } catch (Exception e) {
      System.out.println("Napaka: " + e);
    }
  }
}
