package predavanja13;

import java.io.*;

public class Copy {

  static void copyByteByByte(String imeDatoteke, String imeKopije) {
    try (
      FileInputStream  fis = new FileInputStream(new File(imeDatoteke));
      FileOutputStream fos = new FileOutputStream(new File(imeKopije));
    ) {
      while (fis.available() > 0) {
        int z = fis.read();
        fos.write(z);
      }
    } catch (Exception e) {
      System.out.println("Napaka: " + e);
    }
    System.out.println("Koncano!");
  }

  static void copyWithBuffer(String imeDatoteke, String imeKopije) {
    try (
            FileInputStream  fis = new FileInputStream(new File(imeDatoteke));
            BufferedInputStream bis = new BufferedInputStream(fis);

            FileOutputStream fos = new FileOutputStream(new File(imeKopije));
            BufferedOutputStream bos = new BufferedOutputStream(fos);
    ) {
      while (bis.available() > 0) {
        int z = bis.read();
        bos.write(z);
      }
    } catch (Exception e) {
      System.out.println("Napaka: " + e);
    }
    System.out.println("Koncano!");
  }

  static void copyBlocks(String imeDatoteke, String imeKopije) {
    try (
            FileInputStream  fis = new FileInputStream(new File(imeDatoteke));
            BufferedInputStream bis = new BufferedInputStream(fis);

            FileOutputStream fos = new FileOutputStream(new File(imeKopije));
            BufferedOutputStream bos = new BufferedOutputStream(fos);
    ) {

      byte[] buffer = new byte[4096];
      while (bis.available() > 0) {
        int koliko = bis.read(buffer);
        bos.write(buffer, 0, koliko); // zapise vsebino bufferja od indeksa 0 do indeksa koliko-1
      }
    } catch (Exception e) {
      System.out.println("Napaka: " + e);
    }
    System.out.println("Koncano!");
  }

  public static void main(String[] args) {
    long zacetek = System.currentTimeMillis();
    //copyByteByByte("viri/medo.bmp", "viri/x.bmp");
    //copyWithBuffer("viri/medo4.bmp", "viri/x.bmp");

    copyBlocks("viri/volk16.bmp", "viri/x.bmp");

    long trajanje = System.currentTimeMillis() - zacetek;
    System.out.println("Trajanje: " + trajanje + "ms");
  }
}
