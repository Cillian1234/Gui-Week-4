import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab4Part2 extends Frame implements ActionListener {
    String[] services = {"Netflix", "Hulu", "Disney+", "Prime video", "HBO max"};
    JMenu menu = new JMenu("Streaming services");
    JMenuItem menuItem1, menuItem2, menuItem3, menuItem4, menuItem5;
    JMenuBar menuBar = new JMenuBar();
    JLabel label;
    Lab4Part2() {

        menuItem1 = new JMenuItem(services[0]);
        menuItem2 = new JMenuItem(services[1]);
        menuItem3 = new JMenuItem(services[2]);
        menuItem4 = new JMenuItem(services[3]);
        menuItem5 = new JMenuItem(services[4]);

        menu.add(menuItem1);
        menu.add(menuItem2);
        menu.add(menuItem3);
        menu.add(menuItem4);
        menu.add(menuItem5);

        menuItem1.addActionListener(this);
        menuItem2.addActionListener(this);
        menuItem3.addActionListener(this);
        menuItem3.addActionListener(this);
        menuItem4.addActionListener(this);

        menuBar.add(menu);

        label = new JLabel("Images");
        panel.add(label);

        setJMenuBar(menuBar);
        setVisible(true);
        setTitle("Menus");
    }

    public static void main(String[] args) {
        Lab4Part2 run = new Lab4Part2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == menuItem1) {
            label.setText(services[0]);
        } else if (source == menuItem2) {
            label.setText(services[1]);
        } else if (source == menuItem3) {
            label.setText(services[2]);
        } else if (source == menuItem4) {
            label.setText(services[3]);
        } else if (source == menuItem5) {
            label.setText(services[4]);
        }
    }
}
