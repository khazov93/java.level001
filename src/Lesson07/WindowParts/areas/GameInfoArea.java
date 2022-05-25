package src.Lesson07.WindowParts.areas;

import src.Lesson07.WindowParts.InfoPanel;

import javax.swing.*;
import java.awt.*;

public class GameInfoArea extends JPanel {

    private JLabel sizeMap;
    private JLabel levelGame;
    private JLabel countEnemies;

    private InfoPanel infoPanel;

    public GameInfoArea(InfoPanel infoPanel){

        this.infoPanel = infoPanel;

        setLayout(new GridLayout(4,1));

        sizeMap = new JLabel("Size map = X");
        levelGame = new JLabel("Game level = X");
        countEnemies = new JLabel("Enemies = X");

        add(new JLabel("-=GAME INFO=-"), SwingConstants.CENTER);
        add(sizeMap);
        add(levelGame);
        add(countEnemies);

    }
}
