package workshopArray;
import java.util.Arrays;
import java.util.Objects;

public class NameRepository {
    private static String[] names=new String[0];
    public static int getSize()
    {
        return names.length;
    }
    public static void setNames(String[] addNames)
    {
        names=Arrays.copyOf(addNames,addNames.length);
    }
    public static void clear()
    {
        names =new String[0];
    }
    public static String findAll(String addNames)
    {
        return addNames;
    }
    public static String find(final String fullName)
    {
        for (int i=0;i< names.length;i++)
        {
            if(names[i].equals(fullName))
            {
                return fullName;

            }
            /*else
            {
                return null;
            }*/
        }
        return null;


    }
    public static boolean add(final String fullName)
    {
        if(names.equals(fullName))
        {
            return false;
        }
        String newNames[]=Arrays.copyOf(names,names.length+1);
        newNames[names.length+1]=fullName;
        return true;

    }


}
