import java.util.*;

class Student {

    private String name;
    private int rollNumber;


    public void setDetails(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

 
    public void displayDetails() {
        System.out.println("Name : " + this.name);
        System.out.println("Roll Number : " + this.rollNumber);
    }
}