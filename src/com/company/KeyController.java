package com.company;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyController extends KeyAdapter {
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_RIGHT:
                Main.move = true;
                break;
            case KeyEvent.VK_LEFT:
                Main.back = true;
                break;
            case KeyEvent.VK_UP:
                Main.left = true;
                break;
            case KeyEvent.VK_DOWN:
                Main.right = true;
                break;
        }
    }

    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_RIGHT:
                Main.move = false;
                break;
            case KeyEvent.VK_LEFT:
                Main.back = false;
                break;
            case KeyEvent.VK_UP:
                Main.left = false;
                break;
            case KeyEvent.VK_DOWN:
                Main.right = false;
                break;
        }
    }
}