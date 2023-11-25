import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Lab4Part3 extends Frame implements ActionListener {

    JMenu News, Weather;
    JMenuItem localNews, intNews, localWeather, intWeather;
    JMenuBar menubar = new JMenuBar();

    JPanel localNewsPanel, intNewsPanel, localWeatherPanel, intWeatherPanel;
    JLabel imageLN, imageIN, imageLW, imageIW;
    JTextArea textLN, textIN, textLW, textIW;
    JScrollPane scroll;
    Lab4Part3() {

        localNews = new JMenuItem("Local News");
        localNews.setMnemonic(KeyEvent.VK_L);
        localNews.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.ALT_MASK));
        intNews = new JMenuItem("International News");
        intNews.setMnemonic(KeyEvent.VK_I);
        intNews.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, ActionEvent.ALT_MASK));
        localNews.addActionListener(this);
        intNews.addActionListener(this);
        News = new JMenu("News");
        News.setMnemonic(KeyEvent.VK_N);
        News.add(localNews);
        News.add(intNews);

        localWeather = new JMenuItem("Local Weather");
        localWeather.setMnemonic(KeyEvent.VK_L);
        localWeather.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.ALT_MASK));
        intWeather = new JMenuItem("International Weather");
        intWeather.setMnemonic(KeyEvent.VK_I);
        intWeather.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, ActionEvent.ALT_MASK));
        localWeather.addActionListener(this);
        intWeather.addActionListener(this);
        Weather = new JMenu("Weather");
        Weather.setMnemonic(KeyEvent.VK_W);
        Weather.add(localWeather);
        Weather.add(intWeather);

        menubar.add(News);
        menubar.add(Weather);

        localNewsPanel = new JPanel(new GridBagLayout());
        imageLN = new JLabel("Current local news image");
        c.gridx = 0;
        c.gridy = 0;
        localNewsPanel.add(imageLN, c);

        textLN = new JTextArea("Current local news text area Current local news text area Current local news text area Current local news text area Current local news text area Current local news ");
        textLN.setLineWrap(true);
        c.gridx = 0;
        c.gridy = 1;
        c.fill = GridBagConstraints.BOTH;
        scroll = new JScrollPane(textLN);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        localNewsPanel.add(scroll, c);

        intNewsPanel = new JPanel(new GridBagLayout());
        imageIN = new JLabel("Current international news image");
        c.gridx = 0;
        c.gridy = 0;
        intNewsPanel.add(imageIN, c);

        textIN = new JTextArea("Current int news text area Current int news text area Current int news text area Current int news text area Current int news text area Current int news text area");
        textIN.setLineWrap(true);
        c.gridx = 0;
        c.gridy = 1;
        c.fill = GridBagConstraints.BOTH;
        scroll = new JScrollPane(textIN);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        intNewsPanel.add(scroll, c);

        localWeatherPanel = new JPanel(new GridBagLayout());
        imageLW = new JLabel("Current local weather image");
        c.gridx = 0;
        c.gridy = 0;
        localWeatherPanel.add(imageLW, c);

        textLW = new JTextArea("Current local news text area Current local news text area Current local news text area Current local news text area Current local news text area Current local news ");
        textLW.setLineWrap(true);
        c.gridx = 0;
        c.gridy = 1;
        c.fill = GridBagConstraints.BOTH;
        scroll = new JScrollPane(textLW);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        localWeatherPanel.add(scroll, c);

        intWeatherPanel = new JPanel(new GridBagLayout());
        imageIW = new JLabel("Current international weather image");
        c.gridx = 0;
        c.gridy = 0;
        intWeatherPanel.add(imageIW, c);

        textIW = new JTextArea("Current int news text area Current int news text area Current int news text area Current int news text area Current int news text area Current int news text area");
        textIW.setLineWrap(true);
        c.gridx = 0;
        c.gridy = 1;
        c.fill = GridBagConstraints.BOTH;
        scroll = new JScrollPane(textIW);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        intWeatherPanel.add(scroll, c);


        panel.add(localNewsPanel, c);
        panel.add(intNewsPanel, c);
        localNewsPanel.setVisible(false);
        intNewsPanel.setVisible(false);
        panel.add(localWeatherPanel, c);
        panel.add(intWeatherPanel, c);
        localWeatherPanel.setVisible(false);
        intWeatherPanel.setVisible(false);
        setJMenuBar(menubar);
        setTitle("part 3");
        setVisible(true);
    }

    public static void main(String[] args) {
        Lab4Part3 run = new Lab4Part3();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == localNews) {
            localNewsPanel.setVisible(true);

            localWeatherPanel.setVisible(false);
            intWeatherPanel.setVisible(false);
            intNewsPanel.setVisible(false);
        } else if (source == intNews) {
            intNewsPanel.setVisible(true);

            localWeatherPanel.setVisible(false);
            localNewsPanel.setVisible(false);
            intWeatherPanel.setVisible(false);
        } else if (source == localWeather) {
            localWeatherPanel.setVisible(true);

            localNewsPanel.setVisible(false);
            intNewsPanel.setVisible(false);
            intWeatherPanel.setVisible(false);
        } else if (source == intWeather) {
            intWeatherPanel.setVisible(true);

            localWeatherPanel.setVisible(false);
            localNewsPanel.setVisible(false);
            intNewsPanel.setVisible(false);
        }
    }
}
