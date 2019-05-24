import java.util.*;

public class Graph2{

    public void Graph2()
    {
        List<Integer> pairs2 = new LinkedList<>();
        Node[] nodes = new Node[5];//array of the nodes
        GameArena arena = new GameArena(500,500);
        //making the nodes
        nodes[0] = new Node(250, 50, "AQUA",45,1);
        nodes[1] = new Node(425, 125, "AQUA",45,2);
        nodes[2] = new Node(350, 350, "AQUA",45,3);
        nodes[3] = new Node(150, 350, "AQUA",45,4);
        nodes[4] = new Node(75, 125, "AQUA",45,5);

        //creating the lines
        for(int i = 0; i<5; i++)
        {
            //drawing the Lines
            if(i==2)
            {
                nodes[i].drawLine(nodes[i+1],arena);
                nodes[i].drawLine(nodes[i+2],arena);
            }
            else if(i==3)
            {
                nodes[i].drawLine(nodes[i+1],arena);
            }
            else if(i==4)
            {
                nodes[i].drawLine(nodes[i-4],arena);
            }
            else
            {
                nodes[i].drawLine(nodes[i+1],arena);
                nodes[i].drawLine(nodes[i+3],arena);
                nodes[i].drawLine(nodes[i+2],arena);
            }
            pairs2.add(nodes[i].getNumber());
        }
        //puts the Ball with the Text
        for(int i = 0; i<5; i++)
        {
            nodes[i].drawNode(arena);
        }
        //saving the connection of the nodes
        for(int g=0; g<5;g++)
        {
            for(int v=0; v<5; v++)
            {
                if(g!=v)
                {
                    nodes[g].pairPairs(nodes[v].getNumber());
                }
            }
        }
        System.out.println("The nodes are: " + pairs2);//printing the nodes in the graph

        for(int z = 0; z<5; z++)
        {
            System.out.println("The node "+nodes[z].getNumber()+" is connected to " + nodes[z].pairs);//printing the connected nodes to this one
        }
    }
}