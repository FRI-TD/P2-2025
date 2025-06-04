package predavanja14;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutTest {

  public static void main(String[] args) {
    JFrame okno = new JFrame("BorderLayout test");
    okno.setBounds(300,300, 400, 400);

    JPanel panel = new JPanel();
    panel.setLayout(new BorderLayout());
    okno.add(panel);

    JTextArea jta = new JTextArea();

    JPanel gumbiPanel = new JPanel();
    JButton okGumb = new JButton("OK");
    JButton cancelGumb = new JButton("Cancel");
    gumbiPanel.add(okGumb);
    gumbiPanel.add(cancelGumb);
    gumbiPanel.setPreferredSize(new Dimension(90,1));

    JPanel helpPanel = new JPanel();
    JButton helpGumb = new JButton("Help");
    helpPanel.add(helpGumb);

    panel.add(helpPanel, BorderLayout.PAGE_END);

    panel.add(jta, BorderLayout.CENTER);
    panel.add(gumbiPanel, BorderLayout.LINE_END);

    okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    okno.setVisible(true);

  }
}
