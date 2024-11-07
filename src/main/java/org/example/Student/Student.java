package org.example.Student;

public class Student implements Printable{
   private String studentName;
   private int gradeBookNumber;
   private double averageNote;

public void setStudentName(String studentName) {
    this.studentName = studentName;
}
public String getStudentName() {
        return this.studentName;
}
public void setGradeBookNumber(int gradeBookNumber){
    this.gradeBookNumber = gradeBookNumber;
}
public int getGradeBookNumber() {
        return gradeBookNumber;
}
public void setAverageNote(double averageNote){
    this.averageNote = averageNote;
}
public double getAverageNote(){
    return averageNote;
}
@Override
public void print() {
    System.out.println("Task 2");
    System.out.println("Student Name: " + this.studentName);
    System.out.println("Grade book number: " + this.gradeBookNumber);
    System.out.println("Average Note: " + this.averageNote);
}

}
