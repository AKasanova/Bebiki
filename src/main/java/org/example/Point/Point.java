package org.example.Point;

public class Point {
    private double x;
    private double y;

    public void setX(double x){
        this.x =x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }
    public void moveUp()
    {
        System.out.println("New point moved up: " + "\n" + "New location x: " + x + "\n" + "New location y: " + y);
        x = this.x;
        y = this.y + 0.5;
    }

    public void moveDown()
    {
        System.out.println("New point moved down: " + "\n" + "New location x: " + x + "\n" + "New location y: " + y);
        x = this.x;
        y = this.y - 0.5;
    }

    public void moveLeft()
    {
        System.out.println("New point moved left: " + "\n" + "New location x: " + x + "\n" + "New location y: " + y);
        x = this.x-0.5;
        y = this.y;
    }
    public void moveRight()
    {
        System.out.println("Task 3");
        System.out.println("New point moved right: " + "\n" + "New location x: " + x + "\n" + "New location y: " + y);
        x = this.x+0.5;
        y = this.y;
    }



}
