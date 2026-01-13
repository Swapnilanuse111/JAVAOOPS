public class Constructor
{
    int id;
    String name;

    Constructor()   // constructor name = class name
    {
        this.id = 10;
        this.name = "Swapnil";
    }

    void disp()
    {
        System.out.println(id + "  " + name);
    }

    public static void main(String args[])
    {
        Constructor c = new Constructor();
        c.disp();
    }
}
