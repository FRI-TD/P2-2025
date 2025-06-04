package predavanja14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

class Poslusalec implements ActionListener {
  @Override
  public void actionPerformed(ActionEvent e) {
    System.out.println("Help!");
    JOptionPane.showMessageDialog(null, "juhuhu!");
  }
}

public class GridBagLayoutTest {

  public static void main(String[] args) {
    JFrame okno = new JFrame("GridBagLayout test");
    okno.setBounds(300,300, 400, 400);

    JPanel panel = new JPanel();
    panel.setLayout(new GridBagLayout());
    okno.add(panel);

    JLabel imeL          = new JLabel("Ime:");
    JLabel priimekL      = new JLabel("Priimek:");
    JTextField imeTF     = new JTextField();
    JTextField priimekTF = new JTextField();
    JTextArea vpisTA     = new JTextArea();

    JButton okB          = new JButton("OK");
    JButton odpriB       = new JButton("Odpri...");
    JButton helpB        = new JButton("Help");
    JPanel gumbiP        = new JPanel();
    gumbiP.add(okB);
    gumbiP.add(odpriB);
    gumbiP.add(helpB);

    GridBagConstraints gbc = new GridBagConstraints();
    gbc.gridx = 0;
    gbc.gridy = 0;
    gbc.insets = new Insets(5, 5, 0, 0);
    gbc.anchor = GridBagConstraints.WEST;
    panel.add(imeL, gbc);

    gbc = new GridBagConstraints();
    gbc.gridx = 0;
    gbc.gridy = 1;
    gbc.insets = new Insets(5, 5, 0, 0);
    gbc.anchor = GridBagConstraints.WEST;
    panel.add(priimekL, gbc);

    gbc = new GridBagConstraints();
    gbc.gridx = 1;
    gbc.gridy = 0;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.weightx = 1;
    gbc.insets = new Insets(5, 5, 0, 5);
    panel.add(imeTF, gbc);

    gbc = new GridBagConstraints();
    gbc.gridx = 1;
    gbc.gridy = 1;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.weightx = 1;
    gbc.insets = new Insets(5, 5, 0, 5);
    panel.add(priimekTF, gbc);

    gbc = new GridBagConstraints();
    gbc.gridx = 0;
    gbc.gridy = 2;
    gbc.gridwidth = 2;
    gbc.fill = GridBagConstraints.BOTH;
    gbc.weightx = 1;
    gbc.weighty = 1;
    gbc.insets = new Insets(5, 5, 0, 5);
    panel.add(vpisTA, gbc);

    gbc = new GridBagConstraints();
    gbc.gridx = 0;
    gbc.gridy = 3;
    gbc.gridwidth = 2;
    gbc.insets = new Insets(5, 5, 0, 0);
    panel.add(gumbiP, gbc);

    okB.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String ime = imeTF.getText();
        String priimek = priimekTF.getText();

        vpisTA.setText(ime + " " + priimek);
      }
    });

    helpB.addActionListener(new Poslusalec());

    odpriB.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        JFileChooser jfc = new JFileChooser();
        jfc.showOpenDialog(okno);
      }
    });

    vpisTA.addMouseMotionListener(new MouseMotionAdapter() {
      @Override
      public void mouseMoved(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();

        vpisTA.setText(String.format("(%d, %d)\n", x, y));
      }
    });

    okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    okno.setVisible(true);

  }
}
