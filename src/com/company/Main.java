package com.company;

import javax.swing.*;

public class Main {
    public static Writer writer = new Writer();
    public static JFrame frame = new JFrame("Space");
    public static int xBackGround = 0;
    public static int xPlayer = 0;
    public static int yPlayer = 360;
    public static int speedPlayer = 0;
    public static int health = 3;

    public static final int enemyCount2 = 1;
    public static int xEnemy2[] = new int[enemyCount2];
    public static int yEnemy2[] = new int[enemyCount2];
    public static int speedEnemy2[] = new int[enemyCount2];
    public static boolean enemyLeft2[] = new boolean[enemyCount2];
    public static boolean enemyRight2[] = new boolean[enemyCount2];

    public static final int enemyCount1 = 1;
    public static int xEnemy1[] = new int[enemyCount1];
    public static int yEnemy1[] = new int[enemyCount1];
    public static int speedEnemy1[] = new int[enemyCount1];
    public static boolean enemyLeft1[] = new boolean[enemyCount1];
    public static boolean enemyRight1[] = new boolean[enemyCount1];

    public static final int enemyCount = 1;
    public static int xEnemy[] = new int[enemyCount];
    public static int yEnemy[] = new int[enemyCount];
    public static int speedEnemy[] = new int[enemyCount];
    public static boolean enemyLeft[] = new boolean[enemyCount];
    public static boolean enemyRight[] = new boolean[enemyCount];

    public static boolean dead = false;
    public static boolean left = false;
    public static boolean right = false;
    public static boolean move = false;
    public static boolean back = false;

    private static void startGame() {
        //установка скорости врагов
        for (int i = 0; i < Main.enemyCount; ++i) {
            speedEnemy[i] = (int) (Math.random() * 50 + 20);
        }
        //установка координат врагов
        for (int i = 0; i < Main.enemyCount; ++i) {
            xEnemy[i] = (int) ((Math.random() * 4000) + 4000);
        }

        //установка скорости врагов
        for (int i = 0; i < Main.enemyCount2; ++i) {
            speedEnemy2[i] = (int) (Math.random() * 50 + 20);
        }
        //установка координат врагов
        for (int i = 0; i < Main.enemyCount2; ++i) {
            xEnemy2[i] = (int) ((Math.random() * 5000) + 5000);
        }

        //установка скорости врагов
        for (int i = 0; i < Main.enemyCount1; ++i) {
            speedEnemy1[i] = (int) (Math.random() * 50 + 20);
        }
        //установка координат врагов
        for (int i = 0; i < Main.enemyCount1; ++i) {
            xEnemy1[i] = (int) ((Math.random() * 3000) + 3000);
        }

        //рисование окна
        FrameController.drawFrame();
        //запуск цикла игры
        GameLoop.loop();
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        startGame();
    }
}