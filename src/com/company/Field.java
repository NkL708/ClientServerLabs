package com.company;

import javax.swing.*;

public class Field extends JFrame
{
    JPanel jPanel = new JPanel();

    public void createGUI()
    {
        setSize(800,600);
        add(jPanel);
        setVisible(true);
    }

    Field()
    {
        createGUI();
    }
}
