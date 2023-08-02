package workshopArray;
import java.util.Arrays;
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

}
