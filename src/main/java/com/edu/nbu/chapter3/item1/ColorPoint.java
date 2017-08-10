package com.edu.nbu.chapter3.item1;

import java.awt.*;

/**
 * TODO
 *
 * @author fanwh
 * @version V1.0
 * @create 2017-08-10 19:27
 *  
 */
public class ColorPoint extends Point {
    private Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }
}
