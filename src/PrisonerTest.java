//Section 7, Lesson 4 Starter for Exercise 2 - Slide 14

import javax.swing.text.Position;

public class PrisonerTest {
    public static void main(String[] args){
//        Prisoner p01 = new Prisoner("Bubba", 4.3, 2);
        Cell A1 = new Cell("A1", false);
        Prisoner p01 = new Prisoner("Bubba", 2.08, 4, A1);

        p01.display();
        p01.openDoor();

    }
}
