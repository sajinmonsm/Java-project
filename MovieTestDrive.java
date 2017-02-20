package in.orangecounty.sajin;

/**
 * Created by sajin on 03/02/17.
 */
public class MovieTestDrive {
    public static void main(String[]args){
        Movie one =new Movie();
        one.title="Gone with Stock";
        one.genre = "Tragic";
        one.rating =-2;
        Movie two=new Movie();
        two.title="Loat in cubicie Space";
        two.genre="Comdey";
        two.rating=5;
        two.playIt();
        Movie three = new Movie();
        three.title="Byte Club";
        three.genre="Tragic but uitimately uplifting";
        three.rating=127;
    }
}
