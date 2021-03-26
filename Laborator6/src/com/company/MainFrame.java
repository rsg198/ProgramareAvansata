package com.company;
import javax.swing.*;
import java.awt.*;
import static java.awt.BorderLayout.*;

public class MainFrame extends JFrame {
    ConfigPanel configPanel;
    ControlPanel controlPanel;
    DrawingPanel canvas;

    public MainFrame() {
        super("My Drawing Application");
        init();
    }

    private void init() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Cream componentele
        canvas = new DrawingPanel(this);
        configPanel = new ConfigPanel(this);
        controlPanel = new ControlPanel(this);

        //Aranjam componentele intr-un container (cadru)
        //JFrame folosește implicit un BorderLayout
        add(canvas, CENTER); //Acesta este BorderLayout.CENTER
        add(configPanel, BorderLayout.NORTH);
        add(controlPanel, SOUTH);

        pack();
    }
}