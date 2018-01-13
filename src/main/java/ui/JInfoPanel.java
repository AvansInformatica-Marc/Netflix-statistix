package ui;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ui.views.JTextView;

public class JInfoPanel extends JPanel {
    public JInfoPanel(){
        super(new GridLayout(1, 2));
        setBackground(Color.WHITE);
        add(new JTextView("Netflix Statistix"));
        add(new JTextView("Informatica 1A - Marc, Björn, Thomas"));
        setBorder(new EmptyBorder(2, 2, 2, 2));
    }
}
