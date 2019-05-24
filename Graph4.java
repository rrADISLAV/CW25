import java.util.*;
public class Graph4
{
    public void Graph4()
    {
        GameArena arena = new GameArena(700, 700); //creating GameArena
        Node[] nodes = new Node[8]; //array of nodes
        List<Integer> pairs2 = new LinkedList<>();

        // node Number  = posX, posY, color, Diam, Number;
        nodes[0] = new Node(200, 100, "AQUA", 15, 1); //assign nodes properties
        nodes[1] = new Node(100, 200, "AQUA", 15, 2);
        nodes[2] = new Node(200, 400, "AQUA", 15, 3);
        nodes[3] = new Node(300, 200, "AQUA", 15, 4);
       
        //used for self-arcs
        nodes[4] = new Node(50, 250, "BLACK", 1, 5);
        nodes[5] = new Node(50, 140, "BLACK", 1, 6);
        nodes[6] = new Node(350, 250, "BLACK", 1, 7);
        nodes[7] = new Node(350, 140, "BLACK", 1, 8);
        
        
        /*
        *drawing the lines
        */
        for(int i = 0; i<=3; i++)
        {   
            //draw the arrows based on the added node after that
            if(i==3)
            {
                nodes[3].drawArrow(nodes[0], arena);
                nodes[0].drawArrow(nodes[3], arena); //drow a two - way arrow 
            }
            //draw self-arcs 
            else 
            {
                nodes[i].drawArrow(nodes[i], arena);
                nodes[i+1].drawArrow(nodes[i], arena);
                nodes[1].drawLine(nodes[4], arena);
                nodes[4].drawLine(nodes[5], arena);
                nodes[5].drawArrow(nodes[1], arena);
                nodes[3].drawLine(nodes[6], arena);
                nodes[6].drawLine(nodes[7], arena);
                nodes[7].drawArrow(nodes[3], arena);
            }

            //storing pair numbers in order to print them after that
            if(i==0)
            {            
                nodes[i].pairPairs(nodes[i+3].getNumber());
            }
            else if(i==3)
            {
                nodes[i].pairPairs(nodes[i-1].getNumber());
                nodes[i].pairPairs(nodes[i-3].getNumber());
            }
            else
            {
                nodes[i].pairPairs(nodes[i-1].getNumber());
            }

            //populating the pairs2 LinkedList
            pairs2.add(nodes[i].getNumber()); 
            
        }

        

        /*
        * Printing the connections of the nodes
        */
        int y = 0;
        while(y < 4)
        {
            System.out.println("Node #"+nodes[y].getNumber()+" has pairs " + nodes[y].pairs);
            y++;
        }
        
        /*
        *drawing nodes
        */
        for(int i = 0; i<4; i++)
        {
            nodes[i].drawNode(arena); 
        }
    }
}
