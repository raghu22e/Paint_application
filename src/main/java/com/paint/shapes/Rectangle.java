/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.paint.shapes;

import com.paint.utils.Point;

/**
 *
 * @author HP
 */
public abstract class Rectangle implements Shape {
    private Point topLeft;
    private int width, height;

    public Rectangle(Point topLeft, int width, int height) {
        this.topLeft = topLeft;
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle at (" + topLeft.getX() + "," + topLeft.getY() + ")");
    }

    @Override
    public void erase() {
        System.out.println("Erasing Rectangle");
    }

    @Override
    public void move(int x, int y) {
        topLeft.setPoint(x, y);
    }

    @Override
    public void resize(double factor) {
        width *= factor;
        height *= factor;
    }
    
    
}
