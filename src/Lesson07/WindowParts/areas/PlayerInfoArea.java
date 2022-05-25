package src.Lesson07.WindowParts.areas;

import src.Lesson07.WindowParts.InfoPanel;

import javax.swing.*;
import java.awt.*;

public class PlayerInfoArea extends JPanel {

    private JLabel playerHp;
    private JLabel playerCoins;
    private JLabel playerExp;

    private InfoPanel infoPanel;

    public PlayerInfoArea(InfoPanel infoPanel){

        this.infoPanel = infoPanel;

        setLayout( new GridLayout(4,1));
        playerHp = new JLabel("HP = X");
        playerCoins = new JLabel("Coins = X");
        playerExp = new JLabel("Exp = X");

        add(new JLabel("-=PLAYER INFO=-"), SwingConstants.CENTER);
        add(playerHp);
        add(playerCoins);
        add(playerExp);

    }

}
