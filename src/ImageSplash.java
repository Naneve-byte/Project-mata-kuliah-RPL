package RPL;

import javax.swing.*;
import java.awt.*;

public class ImageSplash extends JPanel{
    private Image image;

    public ImageSplash() {
        image = new ImageIcon(getClass().getResource("logo.png")).getImage();
        this.setLayout(new BorderLayout());
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D gd=(Graphics2D)g.create();
        gd.drawImage(image,0,0,getWidth(),getHeight(),null);
        gd.dispose();
    }
}

