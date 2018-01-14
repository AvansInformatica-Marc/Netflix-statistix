package nl.trio_opdracht.netflix_statistix.ui.views;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import nl.trio_opdracht.netflix_statistix.Configuration;
import nl.trio_opdracht.netflix_statistix.ui.views.interfaces.ViewPadding;

public class ImageView extends JLabel implements ViewPadding {
    public ImageView(){
        super();
        setHorizontalAlignment(SwingConstants.CENTER);
    }

    public ImageView(String imageUrl){
        this();
        setImageUrl(imageUrl);
    }

    public void setImageUrl(String path){
        setIcon(new ImageIcon(Configuration.projectPath + "\\resources\\" + path));
    }

    public void setPadding(int left, int top, int right, int bottom){
        setBorder(new EmptyBorder(top, right, bottom, left));
    }
}
