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
public abstract class Circle implements Shape {
     private double radius;
    private Point center;

    public Circle(double radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle at (" + center.getX() + "," + center.getY() + ")");
    }

    @Override
    public void erase() {
        System.out.println("Erasing Circle");
    }

    @Override
    public void move(int x, int y) {
        center.setPoint(x, y);
    }

    @Override
    public void resize(double factor) {
        radius *= factor;
    }
}

    
