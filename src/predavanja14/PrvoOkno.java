package predavanja14;

import javax.swing.*;
import java.awt.*;

public class PrvoOkno {

  public static void main(String[] args) {
    JFrame okno = new JFrame("Prvo okno");

    //okno.setResizable(false);
    okno.setBounds(300,300, 400, 400);

    JButton gumb = new JButton("Pritisni me!");
    JTextArea jta = new JTextArea();


    JPanel panel = new JPanel();
    panel.setBackground(Color.lightGray);
    panel.setBorder(BorderFactory.createTitledBorder("Moj panel"));
    okno.add(panel);

    JScrollPane jsp = new JScrollPane(jta);

    jsp.setPreferredSize(new Dimension(100,100));

    panel.add(gumb);
    panel.add(jsp);


    okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    okno.setVisible(true);
  }
}
