public class Graph1
{
    public void Graph1()
    {
        GameArena arena = new GameArena(700, 700); //creating GameArena
        Node[] nodes = new Node[4]; //array of nodes
        List<Integer> pairs2 = new LinkedList<>();

        nodes[0] = new Node(100,100,"AQUA",30,1); //assign node properties
        nodes[1] = new Node(100,400,"AQUA",30,2);
        nodes[2] = new Node(400,400,"AQUA",30,3);
        nodes[3] = new Node(400,100,"AQUA",30,4);

        

    }
}