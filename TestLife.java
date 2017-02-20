package in.orangecounty.sajin;

import java.util.ArrayList;

/**
 * Created by sajin on 08/02/17.
 */

class v2r{
    v2r(ArrayList list){
     for(int x=0;x<5;x++){
         list.add(new simunit("v2r"));
     }
    }
}
class v3r extends v2r{
    v3r(ArrayList lglist){
        super(lglist);
        for(int g=0;g<10;g++){
            lglist.add(new simunit("v3r"));
        }
    }
}
class RetentionBot{
    RetentionBot(ArrayList rlist){
        rlist.add(new simunit("Retention"));
    }
}
public class TestLife {
    public static void main(String args[]){
        ArrayList alist=new ArrayList() ;
        v2r v2=new v2r(alist);
        v3r v3=new v3r(alist);
        for(int z=1;z<20;z++){
            RetentionBot ret =new RetentionBot(alist);
        }

    }
}
class simunit{
    String bot;
    simunit (String type){
        bot=type;
    }
    int power(){
        if("Retention".equals(bot)){
            return 2;
        } else{
            return 4;
        }
    }
}
