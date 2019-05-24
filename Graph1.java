import java.util.*;
public class Graph1
{
    public void Graph1()
    {
        GameArena arena = new GameArena(700, 700); //creating GameArena
        Node[] nodes = new Node[4]; //array of nodes
        List<Integer> pairs2 = new LinkedList<>();

        // node Number  = posX, posY, color, Diam, Number;
        nodes[0] = new Node(200, 200, "AQUA", 45, 1); //assign nodes properties
        nodes[1] = new Node(200, 600, "AQUA", 45, 2);
        nodes[2] = new Node(600, 600, "AQUA", 45, 3);
        nodes[3] = new Node(600, 200, "AQUA", 45, 4);


        /*
        *drawing the lines
        */
        for(int i = 0; i<=3; i++)
        {   
            //draw the lines based on the added node after that
            if(i==3)
            {
                nodes[3].drawLine(nodes[0], arena);
            }
            else
            {

                nodes[i].drawLine(nodes[i+1], arena);
            }

            //storing pair numbers in order to print them after that
            if(i==0)
            {            
                nodes[i].pairPairs(nodes[i+1].getNumber());
                nodes[i].pairPairs(nodes[3].getNumber());
            }
            else if(i==3)
            {
                nodes[i].pairPairs(nodes[i-1].getNumber());
                nodes[i].pairPairs(nodes[i-3].getNumber());
            }
            else
            {
                nodes[i].pairPairs(nodes[i+1].getNumber());
                nodes[i].pairPairs(nodes[i-1].getNumber());
            }

            //populating the pairs2 LinkedList
            pairs2.add(nodes[i].getNumber()); 
        }

        /*
        *drawing the nodes
        */
        for(int i = 0; i<4; i++)
        {
            nodes[i].drawNode(arena); 
        }

        /*
        * Printing the connections of the nodes
        */
        for(int j = 0; j<4; j++)
        {
            System.out.println("Node #"+nodes[j].getNumber()+" has pairs " + nodes[j].pairs);//printing the connected nodes to this one
        }
    }
}