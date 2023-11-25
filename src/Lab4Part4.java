import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Lab4Part4 extends Frame implements ActionListener {
    Border blackline = BorderFactory.createLineBorder(Color.black);
    JMenuItem button5, button10, button20, button50, button100;
    JLabel label, balLabel, selLabel;
    JButton withButton, depButton;
    int bal, sel;

Lab4Part4() {
    label = new JLabel("Choose amount", SwingConstants.CENTER);
    c.gridx = 0;
    c.gridy = 0;
    panel.add(label, c);

    button5 = new JMenuItem("€5");
    button5.setFocusable(false);
    button5.setMnemonic(KeyEvent.VK_1);
    button5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
    button5.addActionListener(this);
    c.gridx = 0;
    c.gridy = 1;
    panel.add(button5, c);

    button10 = new JMenuItem("€10");
    button10.setFocusable(false);
    button10.setMnemonic(KeyEvent.VK_2);
    button10.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, ActionEvent.ALT_MASK));
    button10.addActionListener(this);
    c.gridx = 0;
    c.gridy = 2;
    panel.add(button10, c);

    button20 = new JMenuItem("€20");
    button20.setFocusable(false);
    button20.setMnemonic(KeyEvent.VK_3);
    button20.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_3, ActionEvent.ALT_MASK));
    button20.addActionListener(this);
    c.gridx = 0;
    c.gridy = 3;
    panel.add(button20, c);

    button50 = new JMenuItem("€50");
    button50.setFocusable(false);
    button50.setMnemonic(KeyEvent.VK_4);
    button50.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_4, ActionEvent.ALT_MASK));
    button50.addActionListener(this);
    c.gridx = 0;
    c.gridy = 4;
    panel.add(button50, c);

    button100 = new JMenuItem("€100");
    button100.setFocusable(false);
    button100.setMnemonic(KeyEvent.VK_5);
    button100.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_5, ActionEvent.ALT_MASK));
    button100.addActionListener(this);
    c.gridx = 0;
    c.gridy = 5;
    panel.add(button100, c);

    label = new JLabel("Balance:", SwingConstants.CENTER);
    c.gridx = 1;
    c.gridy = 2;
    panel.add(label, c);

    balLabel = new JLabel("€0", SwingConstants.CENTER);
    c.gridx = 1;
    c.gridy = 3;
    balLabel.setBorder(blackline);
    panel.add(balLabel, c);

    label = new JLabel("Selected amount:", SwingConstants.CENTER);
    c.gridx = 2;
    c.gridy = 2;
    panel.add(label, c);

    selLabel = new JLabel("€0", SwingConstants.CENTER);
    c.gridx = 2;
    c.gridy = 3;
    balLabel.setBorder(blackline);
    panel.add(selLabel, c);

    depButton = new JButton("Deposit amount");
    depButton.setFocusable(false);
    depButton.setMnemonic(KeyEvent.VK_ENTER);
    depButton.addActionListener(this);
    c.gridx = 2;
    c.gridy = 4;
    panel.add(depButton, c);

    withButton = new JButton("Withdraw amount");
    withButton.setFocusable(false);
    withButton.setMnemonic(KeyEvent.VK_BACK_SPACE);
    withButton.addActionListener(this);
    c.gridx = 2;
    c.gridy = 5;
    panel.add(withButton, c);
    setTitle("ATM");
    setVisible(true); // make frame visible
}
    public static void main(String[] args) {
        Lab4Part4 run = new Lab4Part4();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == button5) {
            sel += 5;
            selLabel.setText("€"+sel);
        } else if (source == button10) {
            sel += 10;
            selLabel.setText("€"+sel);
        } else if (source == button20) {
            sel += 20;
            selLabel.setText("€"+sel);
        } else if (source == button50) {
            sel += 50;
            selLabel.setText("€"+sel);
        } else if (source == button100) {
            sel += 100;
            selLabel.setText("€"+sel);
        }

        if (source == withButton) {
            if (bal - sel > 0){
                bal -= sel;
                sel = 0;
                selLabel.setText("€" + sel);
                balLabel.setText("€" + bal);
            } else {
                System.out.println("Not enough money loser");
            }
        }

        if (source == depButton) {
            bal += sel;
            sel = 0;
            selLabel.setText("€"+sel);
            balLabel.setText("€"+bal);
        }
    }
}
