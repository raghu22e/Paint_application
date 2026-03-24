/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.paint.utils;

/**
 *
 * @author HP
 */
public class DrawingContext {
    public void setPoint(int x, int y) {
        System.out.println("Setting point at (" + x + "," + y + ")");
    }

    public void clearScreen() {
        System.out.println("Screen cleared");
    }

    public int getVerticalSize() {
        return 600;
    }

    public int getHorizontalSize() {
        return 800;
    }
    
}
