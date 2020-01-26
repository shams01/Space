package com.company;

public class Enemy {
    public static void moveEnemy() {
        for (int i = 0; i < Main.enemyCount; ++i) {
            Main.xEnemy[i] = Main.xEnemy[i] - Main.speedEnemy[i] - Main.speedPlayer;
            //переустановка переменных врага заехавшего далеко за зону видимости
            if (Main.xEnemy[i] <= -3000 || Main.xEnemy[i] >= 3000) {
                Main.xEnemy[i] = (int) ((Math.random() * 1000) + 1000);
                Main.speedEnemy[i] = (int) (Math.random() * 9 + 3);
            }
            //проверка съезда с дороги врагов
            if (Main.yEnemy[i] < 45) Main.yEnemy[i] = 45;
            if (Main.yEnemy[i] > 425) Main.yEnemy[i] = 425;
            //поворот врагов
            if (Main.enemyLeft[i]) Main.yEnemy[i] -= 4;
            if (Main.enemyRight[i]) Main.yEnemy[i] += 4;

            //повернуть врагов с вероятностью 1 к 10
            if ((int) (Math.random() * 10) == 0) tern();
        }
    }

    private static void tern() {
        for (int i = 0; i < Main.enemyCount; ++i) {
            if ((int) (Math.random() * 2) == 0)
                Main.enemyRight[i] = !Main.enemyRight[i];
            else
                Main.enemyLeft[i] = !Main.enemyLeft[i];
        }
    }
}
