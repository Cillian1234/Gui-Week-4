import javax.swing.*;
import java.awt.*;

public class Lab4Part1 extends Frame {
    JCheckBox box;
    ButtonGroup checks = new ButtonGroup();
    Font font = new Font("Courier", Font.PLAIN, 5);
    JPanel up = new JPanel();
    Lab4Part1() {
        box = new JCheckBox("Small Font");
        box.setFont(font);
        c.gridx = 0;
        c.gridy = 0;
        up.add(box, c);
        checks.add(box);

        font = new Font("Courier", Font.PLAIN, 10);
        box = new JCheckBox("Medium Font");
        box.setFont(font);
        c.gridx = 1;
        c.gridy = 0;
        up.add(box, c);
        checks.add(box);

        font = new Font("Courier", Font.PLAIN, 15);
        box = new JCheckBox("Large Font");
        box.setFont(font);
        c.gridx = 0;
        c.gridy = 1;
        up.add(box, c);
        checks.add(box);

        font = new Font("Courier", Font.PLAIN, 20);
        box = new JCheckBox("Extra Large Font");
        box.setFont(font);
        c.gridx = 1;
        c.gridy = 1;
        up.add(box, c);
        checks.add(box);

        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.NORTH;

        panel.add(up, c);
        setTitle("CheckBoxes");
        setVisible(true);
    }

    public static void main(String[] args) {
        Lab4Part1 run = new Lab4Part1();
    }
}



