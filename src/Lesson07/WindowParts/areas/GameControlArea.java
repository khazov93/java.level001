package src.Lesson07.WindowParts.areas;

import src.Lesson07.WindowParts.InfoPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameControlArea extends JPanel {

    private JButton startGame;
    private JButton exitGame;

    private InfoPanel infoPanel;

    public GameControlArea(InfoPanel infoPanel)
    {

        this.infoPanel = infoPanel;
        setLayout(new GridLayout(1, 2));

        startGame = new JButton("Start game");
        startGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Start game");
            }
        });

        exitGame = new JButton("Exit");
        exitGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Exit game");
            }
        });

        add(startGame);
        add(exitGame);

    }
}
