package com.edu.nbu.chapter3.item1;

/**
 * TODO
 *
 * @author fanwh
 * @version V1.0
 * @create 2017-08-10 19:23
 *  
 */
public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Point)){
            return false;
        }
        Point p = (Point)obj;
        return p.x == x && p.y == y;
    }
}
