package Views;

import java.util.ArrayList;
import Models.Kucko;

public class MainConsole 
{

    public MainConsole() 
    {}


    public void printProperties(ArrayList<Kucko> props) 
    {
        for(Kucko prop: props)
        {
            System.out.println(prop.getAddress());
            System.out.println(prop.getCity());
            System.out.println(prop.getPrice());
            System.out.println(prop.getSize());
        }
    }
}