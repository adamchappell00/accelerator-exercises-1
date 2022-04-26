package module12.student;

public class Student {

    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public double getGpa() {return gpa;}
    public void setGpa(double gpa) {this.gpa = gpa;}

    public void greet(){
        System.out.printf("Hello, I am %s and I have a %s GPA.\n", this.name, this.gpa);
    }
}