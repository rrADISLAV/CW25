public class Node
{
    int posX;
    int posY;
    String color;
    String txt;
    double diameter;
    int number;
    List<Integer> pairs = new LinkedList<>();

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
}