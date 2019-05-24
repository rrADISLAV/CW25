import java.io.*;
import java.util.Scanner;

public class GraphChose
{
    public static void main(String[] args) {
        System.out.println("Which graph would you like to see? Example input: 1; ");
        Scanner number = new Scanner(System.in); // creating a scanner
        int chosenGraphNumber = number.nextInt(); //assigning desired Graph number

        switch(chosenGraphNumber)
        {
            case 1: //Graph1 presentation
            Graph1 one = new Graph1();
            one.Graph1();
            break;
            case 2: //Graph2 presentation
            Graph2 second = new Graph2();
            second.Graph2();
            break;
            case 3: //Graph3 presentation
            Graph3 third = new Graph3();
            third.Graph3();
            break;
            case 4: //Graph4 presentation
            Graph4 fourth = new Graph4();
            fourth.Graph4();
            break;
            case 5: //Graph4 presentation
            Graph5 fifth = new Graph5();
            fifth.Graph5();
            break;
        }
    }
}