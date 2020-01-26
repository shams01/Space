package com.company;

import javax.swing.*;

public class Player {
    public static void testKill() {
        // касание player с enemy
        for (int i = 0; i < Main.enemyCount; i++) {
            if (15 <= Main.xEnemy[i] && 250 >= Main.xEnemy[i] && Main.yPlayer <= Main.yEnemy[i] + 50 && Main.yPlayer + 50 >= Main.yEnemy[i]) {
                for (int j = 0; j < Main.enemyCount; j++) {
                    Main.xEnemy[j] = (int) ((Math.random() * 1000) + 1000);
                }
                --Main.health;
                if (Main.health == 0) dead();
            }
        }
    }
    public static void testKill2() {
        for (int i = 0; i < Main.enemyCount2; i++) {
            if (15 <= Main.xEnemy2[i] && 250 >= Main.xEnemy2[i] && Main.yPlayer <= Main.yEnemy2[i] + 50 && Main.yPlayer + 50 >= Main.yEnemy2[i]) {
                for (int j = 0; j < Main.enemyCount2; j++) {
                    Main.xEnemy2[j] = (int) ((Math.random() * 1000) + 1000);
                }
                --Main.health;
                if (Main.health == 0) dead();
            }
        }
    }

    public static void testKill1() {
        for (int i = 0; i < Main.enemyCount1; i++) {
            if (15 <= Main.xEnemy1[i]  && 250 >= Main.xEnemy1[i] && Main.yPlayer <= Main.yEnemy1[i] + 50 && Main.yPlayer + 50 >= Main.yEnemy1[i]) {
                for (int j = 0; j < Main.enemyCount1; j++) {
                    Main.xEnemy1[j] = (int) ((Math.random() * 1000) + 1000);
                }
                --Main.health;
                if (Main.health == 0) dead();
            }
        }
    }

    private static void dead() {
        Main.dead = true;
        JOptionPane.showMessageDialog(Main.frame, "вы проиграли!", "Space", JOptionPane.WARNING_MESSAGE);
        Main.xBackGround = 0;
        Main.xPlayer = 0;
        Main.yPlayer = 360;
        Main.speedPlayer = 0;
        Main.health = 3;
        Main.dead = false;
        Main.move = false;
        Main.back = false;
        Main.left = false;
        Main.right = false;
        GameLoop.loop();
    }

    public static void movePlayer() {
        Main.xBackGround -= Main.speedPlayer;
        Main.xPlayer += Main.speedPlayer;

        if (Main.move) ++Main.speedPlayer;
        if (Main.back) --Main.speedPlayer;

        if (Main.left) Main.yPlayer -= Main.speedPlayer / 4 + 4;
        if (Main.right) Main.yPlayer += Main.speedPlayer / 4 + 4;
        if (Main.speedPlayer < 0) Main.speedPlayer = 0;
        if (Main.speedPlayer > 50) Main.speedPlayer = 50;
        if (Main.yPlayer < 45) Main.yPlayer = 45;
        if (Main.yPlayer > 425) Main.yPlayer = 425;
    }
}