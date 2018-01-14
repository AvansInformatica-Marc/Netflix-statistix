package nl.trio_opdracht.netflix_statistix.ui.views;

import java.awt.Component;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

import nl.trio_opdracht.netflix_statistix.Configuration;
import nl.trio_opdracht.netflix_statistix.ui.FontType;
import nl.trio_opdracht.netflix_statistix.ui.views.interfaces.ViewPadding;
import nl.trio_opdracht.netflix_statistix.ui.views.interfaces.ViewText;

public class TextView extends JLabel implements ViewPadding, ViewText {
    private String fontName;
    private FontType fontType;
    private int fontSize;

    public TextView(){
        super();
        init();
    }

    public TextView(String text){
        super(text);
        init();
    }

    private void init(){
        fontName = "Arial";
        fontType = FontType.NORMAL;
        fontSize = 16;
        updateFont();

        setAlignmentX(Component.LEFT_ALIGNMENT);

        setPadding(4, 4, 4, 4);
    }

    public void setTextSize(int size){
        fontSize = size;
        updateFont();
    }

    public void setFontType(FontType type){
        fontType = type;
        updateFont();
    }

    public void setFontName(String name){
        fontName = name;
        updateFont();
    }

    private void updateFont(){
        setFont(new Font(fontName, fontType == FontType.BOLD ? Font.BOLD : fontType == FontType.ITALIC ? Font.ITALIC : Font.PLAIN, fontSize));
    }

    public void setPadding(int left, int top, int right, int bottom){
        setBorder(new EmptyBorder(left, top, right, bottom));
    }

    public void setImageUrl(String path){
        ImageIcon imageIcon = new ImageIcon(Configuration.projectPath + "\\resources\\" + path);
        setIcon(new ImageIcon(imageIcon.getImage().getScaledInstance(imageIcon.getIconWidth() / (imageIcon.getIconHeight() / 30), 30, java.awt.Image.SCALE_SMOOTH)));
    }
}
