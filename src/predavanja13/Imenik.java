package predavanja13;

import java.io.*;

public class Imenik {

  static void zapisiPodatke() {
    Oseba o1 = new Oseba("janez", 25);
    Oseba o2 = new Oseba("micka", 35);

    try {
      FileOutputStream fos = new FileOutputStream(new File("viri/imenik.dat"));
      ObjectOutputStream oos = new ObjectOutputStream(fos);

      oos.writeObject(o1);
      oos.writeObject(o2);

      oos.close();
    } catch (Exception e) {
      System.out.println("Napaka: " + e);
    }
  }

  static void preberiPodatke() {
    try {
      FileInputStream fis = new FileInputStream(new File("viri/imenik.dat"));
      ObjectInputStream ois = new ObjectInputStream(fis);

      Oseba o1 = (Oseba) ois.readObject();
      Oseba o2 = (Oseba) ois.readObject();

      System.out.println(o1.ime);
      System.out.println(o2.ime);

      ois.close();
    } catch (Exception e) {
      System.out.println("Napaka: " + e);
    }
  }

  public static void main(String[] args) {
    preberiPodatke();
  }
}
