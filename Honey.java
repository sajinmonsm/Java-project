package in.orangecounty.sajin;

import javax.xml.ws.Holder;

/**
 * Created by sajin on 08/02/17.
 */
class Bees{
    Honey [] beeha;
}
class Raccoon{
    kit k;
    Honey rh;
}
class kit{
    Honey kh;
}
class Bear{
    Honey hunny;

}
public class Honey {
    public static void main(String []args){
        Honey honeypot=new Honey();
        Honey []ha ={honeypot,honeypot, honeypot};
        Bees b1=new Bees();
        b1.beeha =ha;
        Bear [] ba=new Bear[5];
        for(int x=0;x<5;x++){
            ba[x]=new Bear();
            ba[x].hunny =honeypot;
        }
        kit k =new kit();
        k.kh=honeypot;
        Raccoon r =new Raccoon();
        r.rh=honeypot;
        r.k=k;
        k=null;

    }
}
