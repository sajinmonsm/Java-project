package in.orangecounty.sajin;
import javax.sound.midi.*;
/**
 * Created by sajin on 10/02/17.
 */
public class MiniMusic {
    public static void main(String args[]){
        MiniMusic mini=new MiniMusic();
        mini.play();
    }
    public void play(){
        try{
            Sequencer player=MidiSystem.getSequencer();
            player.open();
            Sequence seq=new Sequence(Sequence.PPQ,4 );
            Track track=seq.createTrack();
            ShortMessage a = new ShortMessage();
            a.setMessage(128,1,44,100);
            MidiEvent noteon=new MidiEvent(a,1);
            ShortMessage b = new ShortMessage();
            b.setMessage(128,1,44,100);
            MidiEvent noteoff=new MidiEvent(b,16);
            track.add(noteoff);
            player.setSequence(seq);
            player.start();
        }catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
