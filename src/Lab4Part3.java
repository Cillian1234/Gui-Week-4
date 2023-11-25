import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab4Part3 extends Frame implements ActionListener {

    JMenu News, Weather;
    JMenuItem localNews, intNews, localWeather, intWeather;
    JMenuBar menubar = new JMenuBar();
    Lab4Part3() {

        localNews = new JMenuItem("Local News");
        intNews = new JMenuItem("International News");
        localNews.addActionListener(this);
        intNews.addActionListener(this);
        News = new JMenu("News");
        News.add(localNews);
        News.add(intNews);

        localWeather = new JMenuItem("Local Weather");
        intWeather = new JMenuItem("International Weather");
        localWeather.addActionListener(this);
        intWeather.addActionListener(this);
        Weather = new JMenu("Weather");
        Weather.add(localWeather);
        Weather.add(intWeather);

        menubar.add(News);
        menubar.add(Weather);


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

        } else if (source == intNews) {
            
        } else if (source == localWeather) {

        } else if (source == intWeather) {

        }
    }
}
