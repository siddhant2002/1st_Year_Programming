interface Z
{
    int i = 10;
}
public class B implements Z
{
    public static void main(String args[])
    {
        System.out.println(Z.i);
    }
}