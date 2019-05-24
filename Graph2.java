import java.util.*;

public class Graph2{

    public void Graph2()
    {
        List<Integer> pairs2 = new LinkedList<>();
        Node[] nodes = new Node[5];//array of nodes
        GameArena arena = new GameArena(700, 700); //creating GameArena
       
        
        // node Number  = posX, posY, color, Diam, Number;
        nodes[0] = new Node(300, 100, "AQUA",45,1); //assign nodes properties
        nodes[1] = new Node(475, 175, "AQUA",45,2);
        nodes[2] = new Node(400, 400, "AQUA",45,3);
        nodes[3] = new Node(200, 400, "AQUA",45,4);
        nodes[4] = new Node(125, 175, "AQUA",45,5);

        /*
        *drawing the lines
        */
        for(int i = 0; i<5; i++)
        {
            /*
            * Draw lines
            */
            if(i==2)
            {
                nodes[i].drawLine(nodes[i+1], arena);
                nodes[i].drawLine(nodes[i+2], arena);
            }
            else if(i==3)
            {
                nodes[i].drawLine(nodes[i+1], arena);
            }
            else if(i==4)
            {
                nodes[i].drawLine(nodes[i-4], arena);
            }
            else
            {
                nodes[i].drawLine(nodes[i+1], arena);
                nodes[i].drawLine(nodes[i+3], arena);
                nodes[i].drawLine(nodes[i+2], arena);
            }
        }

        /*
        *drawing nodes
        */
        int y = 0;
        while(y<5)
        {
            nodes[y].drawNode(arena);
            y++;
        }
    }
}
