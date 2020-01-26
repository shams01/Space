package com.company;

public class Enemy1 {
    public static void moveEnemy1() {
        for (int i = 0; i < Main.enemyCount1; ++i) {
            Main.xEnemy1[i] = Main.xEnemy1[i] - Main.speedEnemy1[i] - Main.speedPlayer;
            //переустановка переменных врага заехавшего далеко за зону видимости
            if (Main.xEnemy1[i] <= -3000 || Main.xEnemy1[i] >= 3000) {
                Main.xEnemy1[i] = (int) ((Math.random() * 1000) + 1000);
                Main.speedEnemy1[i] = (int) (Math.random() * 9 + 3);
            }
            //проверка съезда с дороги врагов
            if (Main.yEnemy1[i] < 45) Main.yEnemy1[i] = 45;
            if (Main.yEnemy1[i] > 425) Main.yEnemy1[i] = 425;
            //поворот врагов
            if (Main.enemyLeft1[i]) Main.yEnemy1[i] -= 4;
            if (Main.enemyRight1[i]) Main.yEnemy1[i] += 4;

            //повернуть врагов с вероятностью 1 к 10
            if ((int) (Math.random() * 10) == 0) tern();
        }
    }

    private static void tern() {
        for (int i = 0; i < Main.enemyCount1; ++i) {
            if ((int) (Math.random() * 2) == 0)
                Main.enemyRight1[i] = !Main.enemyRight1[i];
            else
                Main.enemyLeft1[i] = !Main.enemyLeft1[i];
        }
    }
}