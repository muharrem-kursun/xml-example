import database.DeveloperDatabase;
import developer.Developer;
import readxml.ReadXml;

import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        ReadXml readXml = new ReadXml("file.xml");
        List<Developer> list = new ArrayList<Developer>();
        Developer developer = new Developer();
        DeveloperDatabase database = new DeveloperDatabase();
        list = readXml.read();
        for (int i= 0 ; i<list.size(); i++)
        {
            developer =list.get(i);
            database.insert(developer);
            System.out.println(list.get(i));
        }

    }
}
