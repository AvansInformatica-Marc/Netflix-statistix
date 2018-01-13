package ui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class UserInterface implements Runnable {
    private JFrame frame;

    @Override public void run() {
        frame = new JFrame("Netflix Statistix");
        frame.setPreferredSize(new Dimension(1000, 800));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        container.add(new JInfoPanel(), BorderLayout.SOUTH);
    }
}