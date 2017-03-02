package in.orangecounty.sajin.sajin;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by sajin on 23/02/17.
 */
public  class Sortarray {
    public int [] sortarray(int[]a){
        int len=a.length;
        int temp;
        for(int i=0;i<len-1;i++){
            if(a[i]<a[i+1]){
                temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            }
        }
        return a;
    }
    public static void main(String[]args){
        int a[]  = new int[] {5,9,8,2,1};
        Sortarray s= new Sortarray();
        int b[]=s.sortarray(a);
        for(int i=0;i<b.length;i++){
            System.out.println("sort array is"+b[i]);
        }
        String[] input = {"Thomas", "Peter", "John"};
        System.out.println(Arrays.toString(sort(input)));
    }

    public static String[] sort(String[] input){
        Arrays.sort(input, new Comparator<String>() {
            public int compare(String s, String t1) {
                return s.compareTo(t1);
            }
        });
        return input;
    }
}
