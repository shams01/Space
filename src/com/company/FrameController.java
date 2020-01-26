package com.company;

import javax.swing.*;

public class FrameController {
    public static void drawFrame() {
        //настраеваем окно
        Main.frame.setSize(1288, 519);
        Main.frame.setResizable(false);
        Main.frame.setLocationRelativeTo(null);
        Main.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Main.frame.setIconImage(new ImageIcon(FrameController.class.getResource("/Images/Icon.png")).getImage());
        //добавляем элементы в окно
        Main.frame.add(Main.writer);
        Main.frame.addKeyListener(new KeyController());
        //делаем окно видимым
        Main.frame.setVisible(true);
    }
}