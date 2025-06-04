package predavanja14;

import javax.swing.*;
import java.awt.*;

public class FlowLayaoutPrimer {

  public static void main(String[] args) {
    JFrame okno = new JFrame("FlowLayout test");
    okno.setBounds(300,300, 400, 400);

    JPanel panel = new JPanel();
    panel.setLayout(new FlowLayout(FlowLayout.RIGHT));
    okno.add(panel);

    JButton[] gumbi = new JButton[5];
    for(int i =0; i<gumbi.length; i++) {
      gumbi[i] = new JButton("Gumb " + i);
      panel.add(gumbi[i]);
    }

    okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    okno.setVisible(true);
  }
}
