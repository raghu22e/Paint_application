/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.paint.shapes;

/**
 *
 * @author HP
 */
public interface Shape {
    void draw();
    void erase();
    void move(int x, int y);
    void resize(double factor);
    
}
