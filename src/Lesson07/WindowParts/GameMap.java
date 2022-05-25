package src.Lesson07.WindowParts;

import src.Lesson07.MainWindow;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GameMap extends JPanel {


    private MainWindow mainWindow;


    public GameMap(MainWindow mainWindow)
    {
        this.mainWindow = mainWindow;

        add(new JLabel("-=GAME MAP=-"));

    }
}

