package org.example.Car;

public class Car implements Driveable {
    private String brand;
    private String model;
    private int year;
    private double startPosition;
    private double stopPosition;
    private double distance;

    public void setStartPosition(double startPosition) {
        this.startPosition = startPosition;
    }

    public double getStartPosition() {
        return startPosition;
    }

    public void setStopPosition(double stopPosition) {
        this.stopPosition = stopPosition;
    }

    public double getStopPosition() {
        return stopPosition;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return model;
    }

    public void setYear(int Year){
        this.year = year;
    }

    public int getYear(){
        return year;
    }

    @Override
    public void start(){
        System.out.println("Task 5");
        System.out.println("Start to drive km: " + startPosition);
    }

    @Override
    public void stop() {
        stopPosition = startPosition + distance;
        System.out.println("Stop to drive km: " + stopPosition);
    }

    @Override
    public void drive() {
        System.out.println("Drive distance km: " + distance);
    }

}





