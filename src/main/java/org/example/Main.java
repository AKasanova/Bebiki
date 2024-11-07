package org.example;

import org.example.Book.Book;
import org.example.Car.Car;
import org.example.Clock.Clock;
import org.example.Point.Point;
import org.example.Student.Student;

public class Main {
   public static void main(String[] args) {
       //Task Book
       Book book1 = new Book();
       book1.setBookAuthor("Nabokov");
       book1.setBookName("Lolita");
       book1.setBookYear(1955);
       book1.display();

       //Task Student
       Student student1 = new Student();
       student1.setStudentName("Fedor Ivanov");
       student1.setGradeBookNumber(1234567);
       student1.setAverageNote(4.5);
       student1.print();

       //Task Point
       Point point1 = new Point();
       point1.setX(1);
       point1.setY(1);
       point1.moveDown();
       point1.moveUp();
       point1.moveLeft();
       point1.moveRight();

       //Task Clock
       Clock clock1 = new Clock();
       clock1.setHours(23);
       clock1.setMin(59);
       clock1.setSec(58);
       clock1.tick();
       clock1.readTime();
       clock1.tick();
       clock1.readTime();

       //Task Car
       Car car1 = new Car();
       car1.setBrand("Opel");
       car1.setModel("Astra");
       car1.setYear(2022);
       car1.setStartPosition(10.5);
       car1.setDistance(15.5);
       car1.start();
       car1.drive();
       car1.stop();
   }

}