//Section 7, Lesson 4 Starter for Exercise 2 - Slide 14

import javax.swing.text.Position;

public class PrisonerTest {
    public static void main(String[] args){
//        Prisoner p01 = new Prisoner("Bubba", 4.3, 2);
        Cell cellA1 = new Cell("A1", false, 7864);
        Cell cellA2 = new Cell("A2", true, 2923);

        Prisoner p01 = new Prisoner("Bubba", 2.08, 4, cellA1);
        Prisoner p02 = new Prisoner("Twitch", 3.33, 4, cellA2);


        p01.display();
        System.out.println("The prisoner count is " + Prisoner.getPrisonerCount());

        System.out.println(" ");
        p02.display();

        cellA1.setDoorIsOpen(7864);




//        p01.openDoor();

    }
}
