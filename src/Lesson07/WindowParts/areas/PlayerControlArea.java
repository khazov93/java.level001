package src.Lesson07.WindowParts.areas;

import src.Lesson07.WindowParts.InfoPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayerControlArea extends JPanel {

    private InfoPanel infoPanel;
    private JButton moveUp;
    private JButton moveDown;
    private JButton moveRight;
    private JButton moveLeft;

    public PlayerControlArea(InfoPanel infoPanel){

        this.infoPanel = infoPanel;
        setLayout(new GridLayout(1, 4));

        moveUp = new JButton(" ▲ ");
        moveUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Move up");
            }
        });

        moveDown = new JButton(" ▼ ");
        moveDown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Move down");
            }
        });

        moveRight = new JButton(" ▶ ");
        moveRight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Move right");
            }
        });

        moveLeft = new JButton(" ◀ ");
        moveLeft.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Move left");
            }
        });

        add(moveUp);
        add(moveDown);
        add(moveRight);
        add(moveLeft);
    }

}
