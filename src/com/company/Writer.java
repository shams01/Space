package com.company;

import javax.swing.*;
import java.awt.*;

public class Writer extends JComponent {
    public void paint(Graphics g) {
        //рисование фона
        g.drawImage(new ImageIcon(Writer.class.getResource("/Images/BackGround.png")).getImage(), Main.xBackGround, 0, null);
        g.drawImage(new ImageIcon(Writer.class.getResource("/Images/BackGround.png")).getImage(), Main.xBackGround + 1288, 0, null);
        //рисование игрока
        g.drawImage(new ImageIcon(Writer.class.getResource("/Images/Player.png")).getImage(), 100, Main.yPlayer, null);
        //рисование врагов
        for (int i = 0; i < Main.enemyCount; ++i) {
            g.drawImage(new ImageIcon(Writer.class.getResource("/Images/Enemy.png")).getImage(), Main.xEnemy[i], Main.yEnemy[i], null);
        }

        for (int i = 0; i < Main.enemyCount2; ++i) {
            g.drawImage(new ImageIcon(Writer.class.getResource("/Images/Enemy2.png")).getImage(), Main.xEnemy2[i], Main.yEnemy2[i], null);
        }

        for (int i = 0; i < Main.enemyCount1; ++i) {
            g.drawImage(new ImageIcon(Writer.class.getResource("/Images/Enemy1.png")).getImage(), Main.xEnemy1[i], Main.yEnemy1[i], null);
        }
        //рисование текста на верху экрана
        g.setColor(Color.BLUE);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("скорость: " + Main.speedPlayer + "км/c", 5, 25);
        g.drawString("здоровье: " + Main.health, 180, 25);

    }
}

