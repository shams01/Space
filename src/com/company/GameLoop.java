package com.company;

public class GameLoop {
    public static void loop() {
        Player.testKill();
        Player.testKill2();
        Player.testKill1();
        Player.movePlayer();
        Enemy.moveEnemy();
        Enemy2.moveEnemy2();
        Enemy1.moveEnemy1();

        if (Main.xBackGround <= -1288) Main.xBackGround = 0;

        Main.writer.repaint();

        try {
            Thread.sleep(1000/30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (!Main.dead) loop();
    }
}