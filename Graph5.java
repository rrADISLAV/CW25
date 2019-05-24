import java.util.*;
public class Graph5
{
    public void Graph5()
    {
        GameArena arena = new GameArena(700, 700); //creating GameArena
        Node[] nodes = new Node[8]; //array of nodes
        List<Integer> pairs2 = new LinkedList<>();

        // node Number  = posX, posY, color, Diam, Number;
        nodes[0] = new Node(300, 100, "AQUA", 15, 1); //assign nodes properties
        nodes[1] = new Node(100, 130, "AQUA", 15, 2);
        nodes[2] = new Node(500, 130, "AQUA", 15, 3);
        nodes[3] = new Node(100, 320, "AQUA", 15, 4);
        nodes[4] = new Node(300, 300, "AQUA", 15, 5);
        nodes[5] = new Node(500, 320, "AQUA", 15, 6);

        //self-arcs
        nodes[6] = new Node(550, 300, "BLACK", 1, 7);
        nodes[7] = new Node(500, 380, "BLACK", 1, 8);
        
         /*
        *drawing the lines
        */
        for(int i = 0; i<=5; i++)
        {   
            //draw the arrows based on the added node after that
            if(i==0)
            {
                nodes[i].drawArrow(nodes[2], arena);
                nodes[i].drawArrow(nodes[1], arena); //drow a two - way arrow 
            }
            else if(i==1)
            {
                nodes[i].drawArrow(nodes[3], arena);
            }
            else if(i==2)
            {
                nodes[i].drawArrow(nodes[0], arena);
                nodes[i].drawArrow(nodes[4], arena);
            }
            else if(i==4)
            {
                nodes[i].drawArrow(nodes[1], arena);
                nodes[i].drawArrow(nodes[3], arena);
                nodes[i].drawArrow(nodes[5], arena);
            }
            else if(i==5)
            {
                nodes[i].drawLine(nodes[6], arena);
                nodes[6].drawLine(nodes[7], arena);
                nodes[7].drawArrow(nodes[i], arena);
            }
            else {
                System.out.println("Bla");
            }
          
        }             
       
        /*
        *drawing nodes
        */
        for(int i = 0; i<6; i++)
        {
            nodes[i].drawNode(arena); 
        }
    }
}
