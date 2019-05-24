import java.util.*;
public class Graph3
{
    public void Graph3()
    {
        GameArena arena = new GameArena(700, 700); //creating GameArena
        Node[] nodes = new Node[4]; //array of nodes
        List<Integer> pairs2 = new LinkedList<>();

        // node Number  = posX, posY, color, Diam, Number;
        nodes[0] = new Node(200, 100, "AQUA", 15, 1); //assign nodes properties
        nodes[1] = new Node(100, 200, "AQUA", 15, 2);
        nodes[2] = new Node(200, 400, "AQUA", 15, 3);
        nodes[3] = new Node(300, 200, "AQUA", 15, 4);


        /*
        *drawing the lines
        */
        for(int i = 0; i<=3; i++)
        {   
            //draw the arrows based on the added node after that
            if(i==3)
            {
                nodes[3].drawArrow(nodes[0], arena);
            }
            else
            {

                nodes[i].drawArrow(nodes[i+1], arena);
            }

            //storing pair numbers in order to print them after that
            if(i==0)
            {            
                nodes[i].pairPairs(nodes[i+1].getNumber());
            }
            else if(i==3)
            {
                nodes[i].pairPairs(nodes[i-3].getNumber());
            }
            else
            {
                nodes[i].pairPairs(nodes[i+1].getNumber());
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