package in.orangecounty.sajin;

import java.util.ArrayList;

/**
 * Created by sajin on 03/02/17.
 */
public class ArrayListMagnet {
    public static void main(String[]args){
        ArrayList<String> a = new ArrayList<String>();
        a.add(0,"zero");
        a.add(1,"one");
        a.add(2,"two");
        a.add(3,"three");
        printAl(a);
        if(a.contains("three")){
            a.add("four");
        }
        a.remove(2);
        printAl(a);
        if(a.indexOf("four")!=4){
            a.add(4,"4.2");
        }
        printAl(a);
        if(a.contains("Two")){
            a.add("2.2");
        }
        printAl(a);

    }
    public static void printAl(ArrayList<String> al){
        for(String element:al){
            System.out.println(element+" ");
        }
        System.out.println("");
    }
}
