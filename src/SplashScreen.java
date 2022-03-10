package RPL;

import javax.swing.*;
import java.awt.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.sql.SQLException;

public class SplashScreen extends JWindow {
    private int duration;
    private JProgressBar progress;
    private ImageSplash panel;
    private JPanel p_bar;

    public SplashScreen(int d) {
        duration = d;
        setSize(500, 300);
        setLocationRelativeTo(null);
    }

    public void showSplash() {
        panel = new ImageSplash();

        p_bar = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 40));
        p_bar.setOpaque(false);

        progress = new JProgressBar(0, 100);
        progress.setStringPainted(true);
        progress.setPreferredSize(new Dimension(getWidth() - 10, 15));
        progress.setForeground(Color.decode("#7bd1e2"));
        progress.setVisible(true);
        p_bar.add(progress);

        panel.add(p_bar, "South");
        getContentPane().add(panel, "Center");

        setVisible(true);

        for (int i = 0; i < 100; i++) {
            try {
                progress.setValue(i);
                Thread.sleep(duration);
            } catch (Exception e) {
                e.getMessage();
            }
        }
        setVisible(false);
    }

    public void showSplashAndExit() {
        showSplash();

    }

    public static void main(String[] args) {
        SplashScreen frame = new SplashScreen(100);
        frame.showSplashAndExit();

    }
}
