import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab4Part1 extends Frame implements ActionListener {
    ButtonGroup checks = new ButtonGroup();
    Font font = new Font("Courier", Font.PLAIN, 5);
    JPanel up = new JPanel();
    Border blackline = BorderFactory.createLineBorder(Color.black);
    JCheckBox box1;
    JCheckBox box2;
    JCheckBox box3;
    JCheckBox box4;
    JLabel label;

    Lab4Part1() {
        up.setLayout(new GridBagLayout());

        box1 = new JCheckBox("Small Font");
        box1.setFont(font);
        box1.addActionListener(this);
        c.gridx = 0;
        c.gridy = 0;
        up.add(box1, c);
        checks.add(box1);

        font = new Font("Courier", Font.PLAIN, 10);
        box2 = new JCheckBox("Medium Font");
        box2.setFont(font);
        box2.addActionListener(this);
        c.gridx = 1;
        c.gridy = 0;
        up.add(box2, c);
        checks.add(box2);

        font = new Font("Courier", Font.PLAIN, 15);
        box3 = new JCheckBox("Large Font");
        box3.setFont(font);
        box3.addActionListener(this);
        c.gridx = 0;
        c.gridy = 1;
        up.add(box3, c);
        checks.add(box3);

        font = new Font("Courier", Font.PLAIN, 20);
        box4 = new JCheckBox("Extra Large Font");
        box4.setFont(font);
        box4.addActionListener(this);
        c.gridx = 1;
        c.gridy = 1;
        up.add(box4, c);
        checks.add(box4);

        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.NORTH;
        up.setBorder(blackline);
        panel.add(up, c);

        label = new JLabel("Text will change", SwingConstants.CENTER);
        label.setBorder(blackline);
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 4;
        c.fill = GridBagConstraints.BOTH;
        c.anchor = GridBagConstraints.CENTER;
        panel.add(label, c);

        setTitle("CheckBoxes");
        setVisible(true);
    }

    public static void main(String[] args) {
        Lab4Part1 run = new Lab4Part1();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == box1) {
            font = new Font("Courier", Font.PLAIN, 5);
            label.setFont(font);
        } else if (e.getSource() == box2) {
            font = new Font("Courier", Font.PLAIN, 10);
            label.setFont(font);
        } else if (e.getSource() == box3) {
            font = new Font("Courier", Font.PLAIN, 15);
            label.setFont(font);
        } else if (e.getSource() == box4) {
            font = new Font("Courier", Font.PLAIN, 20);
            label.setFont(font);
        }
    }
}



