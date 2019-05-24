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
            case 3: //Graph3 presentation
            Graph3 second = new Graph3();
            second.Graph3();
            break;
            
        }
    }
}