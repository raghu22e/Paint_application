/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.paint.main;

import com.paint.shapes.Circle;
import com.paint.shapes.Rectangle;
import com.paint.shapes.Shape;
import com.paint.utils.Point;
import com.paint.window.ConsoleWindow;
import com.paint.window.Window;

/**
 *
 * @author HP
 */
public class MainApp {
   

    public static void main(String[] args) {
        
        Point p = new Point(10, 20);

        Shape circle = new Circle(5, p) {} ;
        circle.draw();
        circle.move(30, 40);
        circle.resize(2);

        Shape rect = new Rectangle(new Point(0, 0), 10, 20) {};
        rect.draw();

        Window window = new ConsoleWindow() {};
        window.open();
        window.display();
        
    }
}

    

