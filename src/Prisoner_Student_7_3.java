//Section 7, Lesson 3 Starter for Exercise 1 - Slide 6

public class Prisoner_Student_7_3 {

    //Fields
    public String name;
    public double height;
    public int sentence;

    //Constructor

    public Prisoner_Student_7_3(String name, double height, int sentence) {
        this.name = name;
        this.height = height;
        this.sentence = sentence;
    }


    //Methods
    public void setFields (String n, double h, int s) {
        name = n;
        height = h;
        sentence = s;

    }
    public void think(){
        System.out.println("I'll have my revenge.");
    }
}
