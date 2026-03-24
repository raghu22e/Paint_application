/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.paint.window;

/**
 *
 * @author HP
 */
public abstract class Window {
     public void open() {
        System.out.println("Window opened");
    }

    public void close() {
        System.out.println("Window closed");
    }

    public void move() {
        System.out.println("Window moved");
    }

    public abstract void display();
    
}
