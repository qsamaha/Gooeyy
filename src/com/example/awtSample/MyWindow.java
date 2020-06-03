package com.example.awtSample;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWindow extends Frame {

    public MyWindow(String title) {
        super(title);
        setSize(500, 140);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font sansSerifLarge = new Font("Sanserif", Font.BOLD, 18);
        Font sansSerifSmall = new Font("Sanserif", Font.BOLD, 12);
        g.setFont(sansSerifLarge);
        g.drawString("The Complete Java", 60, 60);
        g.setFont(sansSerifSmall);
        g.drawString("Think about it", 60,100);
    }
}
