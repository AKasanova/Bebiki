package org.example.Clock;

public class Clock implements Readable {
    private int hours;
    private int min;
    private int sec;

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMin() {
        return min;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public int getSec() {
        return sec;
    }

    public void tick() {
        sec++;
        if (sec >= 60) {
            sec = 0;
            min++;
        }
        if (min >= 60) {
            min = 0;
            hours++;
        }
        if (hours >= 24) {
            hours = 0;
        }
        System.out.println("Task 4");
    }


    @Override
    public void readTime() {
        System.out.printf("Current time: %02d:%02d:%02d%n", hours, min, sec);
    }
}

