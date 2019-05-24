public class Node
{
    int posX;           //position X of Node
    int posY;           //position Y of Node
    String color;       //the color of the Node
    String txt;         //the text inside the Node
    double diameter;    //the diameter of the Node
    int number;         //the number of the Node in the graph (used for printing the pairs, that is why is a LinkedList)

    List<Integer> pairs = new LinkedList<>(); //stores the number(index) of the nodes and is used to print the pairs of each node

    public int getPosX() //get X function
    {
        return posX;
    }

    public int getPosY() //get Y function
    {
        return posX;
    }

    public String getColor() //get color function
    {
        return color;
    }

    public void setPosX(int posXParameter) //change posX function
    {
        this.posX = posXParameter;
    }
    
    public void setPosY(int posYParameter) //change posY function
    {
        this.posY = posYParameter;
    }

    public void changeColor(String colorParameter) //change color funciton
    {
        this.color = colorParameter;
    }

    public Node(int posXParameter, int posYParameter, String colorParameter, int diameterParameter, int numberParameter) //constructor
    {
        posX = posXParameter;
        posY = posYParameter;
        color = colorParameter;
        diameter = diameterParameter;
        number = numberParameter;
    }

    /*
    * function for drawing a Line(edge) based on the starting 
    * and eding point of the node that calls the
    * function and the node that is as a parameter
    */
    public void drawLine(Node nodePrameter, GameArena arena)
    {
        Line line = new Line(this.getPosX(), this.getPosY(), nodeParameter.getPosX(), nodeParameter.getPosY(), 10, "Red");
        arena.addLine(line);
        arena.update();
    }

    /*
    * function for drawing the Node on GameArena 
    *
    */
    public void drawNode(GameArena arenaParameter) 
    {
        Ball node = new Ball(posX, posY, diameter, color); //creating a node
        Text initialText = new Text(Integer.toString(counter), positionX-(diameter/4), positionY+(diameter/4),diameter,"Black");
        arena.addBall(node);        //drawing the node
        arena.addText(initialText); //drawing the test on the node
        arena.update();             //update arena in order to add the node
    }

    /*
    * function for adding the number pairParameter in the
    * LinkedList pairs
    */
    public void pairPairs(int pairParameter)
    {
        pairs.add(pairParameter);
    }
}