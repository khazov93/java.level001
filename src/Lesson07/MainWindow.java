package src.Lesson07;

import src.Lesson07.WindowParts.GameMap;
import src.Lesson07.WindowParts.InfoPanel;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    private int widthW = 1024;
    private int heightW = 768;

    private int posX = 400;
    private int posY = 200;

    private GameMap gameMap;
    private InfoPanel infoPanel;


    public MainWindow(){

    gameMap = new GameMap(this);
    infoPanel = new InfoPanel(this);

    add(infoPanel, BorderLayout.EAST);
    add(gameMap, BorderLayout.WEST);



       setupWindow();


        setVisible(true);

    }

    private void setupWindow() {

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(widthW, heightW);
        setLocation(posX, posY);
        setResizable(false);
        setTitle("Приложение");
    }


}

