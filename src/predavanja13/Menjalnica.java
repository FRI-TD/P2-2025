package predavanja13;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Menjalnica {

  public static void main(String[] args) {
    String request = "https://min-api.cryptocompare.com/data/price?fsym=%s&tsyms=EUR";

    String valuta  = "BTC";


    URL url;

    {
      try {
        url = new URL(String.format(request, valuta));
        Scanner sc = new Scanner(url.openStream());
        String result = sc.nextLine();
        System.out.println(result);

        Pattern vzorec = Pattern.compile("[{]\"EUR\":(\\d+([.]\\d+)?)[}]");
        Matcher m      = vzorec.matcher(result);
        if (m.find())
          System.out.println(m.group(1));


      } catch (MalformedURLException e) {
        throw new RuntimeException(e);
      } catch (IOException e) {
        System.out.println("Napaka: " + e);
      }
    }
  }
}
