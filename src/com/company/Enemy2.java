package com.company;

public class Enemy2 {
    public static void moveEnemy2() {
        for (int i = 0; i < Main.enemyCount2; ++i) {
            Main.xEnemy2[i] = Main.xEnemy2[i] - Main.speedEnemy2[i] - Main.speedPlayer;
            //переустановка переменных врага заехавшего далеко за зону видимости
            if (Main.xEnemy2[i] <= -3000 || Main.xEnemy2[i] >= 3000) {
                Main.xEnemy2[i] = (int) ((Math.random() * 1000) + 1000);
                Main.speedEnemy2[i] = (int) (Math.random() * 9 + 3);
            }
            //проверка съезда с дороги врагов
            if (Main.yEnemy2[i] < 45) Main.yEnemy2[i] = 45;
            if (Main.yEnemy2[i] > 425) Main.yEnemy2[i] = 425;
            //поворот врагов
            if (Main.enemyLeft2[i]) Main.yEnemy2[i] -= 4;
            if (Main.enemyRight2[i]) Main.yEnemy2[i] += 4;

            //повернуть врагов с вероятностью 1 к 10
            if ((int) (Math.random() * 10) == 0) tern();
        }
    }

    private static void tern() {
        for (int i = 0; i < Main.enemyCount2; ++i) {
            if ((int) (Math.random() * 2) == 0)
                Main.enemyRight2[i] = !Main.enemyRight2[i];
            else
                Main.enemyLeft2[i] = !Main.enemyLeft2[i];
        }
    }
}