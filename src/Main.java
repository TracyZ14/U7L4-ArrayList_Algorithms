import java.util.ArrayList;
public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Jessica");
        names.add("Emily");
        names.add("Destiny");
        names.add("Mateo");
        names.add("Sofia");
        names.add("Tim");
        names.add("James");

        // before:
        System.out.println(names);

        // complete me:
        for(int i = (names.size() - 1); i >= 0; i--)
        {
            if(names.get(i).length() == 5)
            {
                names.remove(i);
            }
        }

        // after:
        System.out.println(names);
    }
}