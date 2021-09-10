import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class MyComparator implements Comparator<Students>
{
    public int compare(Students s1, Students s2)
    {
        if (s1.rollNum == s2.rollNum)
            return 0;

        else if (s1.rollNum > s2.rollNum)
            return 1;

        else
            return -1;
    }


    public static void main(String[] args)
    {

        ArrayList<Students> myObj = new ArrayList<Students>();

        myObj.add(new Students(45,"Rida"));

        myObj.add(new Students(11,"Adam"));

        myObj.add(new Students(19,"Ali"));

        Collections.sort(myObj, new MyComparator());

        System.out.println(myObj);

    }

}