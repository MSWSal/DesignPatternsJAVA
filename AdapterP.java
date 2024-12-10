public class AdapterP {

    public interface MediaPlayer { //interface

        void play(String type);
    }

    public class AdvancedMediaPlayer { //adaptee

        void playVlc(){
            System.out.println("Vlc playing...");
        }

        void playMp4(){
            System.out.println("Mp4 playing...");
        }    
    }

    public class MediaAdapter implements MediaPlayer { //adapter

        private AdvancedMediaPlayer advancedMediaPlayer;

        public MediaAdapter(){

            advancedMediaPlayer = new AdvancedMediaPlayer();

        }

        @Override
        public void play(String type) {

            if(type.equalsIgnoreCase("vlc")){
                advancedMediaPlayer.playVlc();
            }else if (type.equalsIgnoreCase("mp4")){
                advancedMediaPlayer.playMp4();
            }
        
        }  
    }

    public class AudioPlayer implements MediaPlayer { //client helper

        private MediaAdapter mediaAdapter;

        @Override
        public void play(String type) {
            if(type=="mp3"){
                System.out.println("Mp3 playing...");
            } else if (type == "vlc" || type == "mp4"){
                mediaAdapter = new MediaAdapter();
                mediaAdapter.play(type);
            } else {
                System.out.println("Erorr....");
            }
        }    
    }

    public static void main(String[] args){
        AudioPlayer audioPlayer=new AdapterP().new AudioPlayer();

        audioPlayer.play("mp3");
        audioPlayer.play("mp4");
        audioPlayer.play("vlc");
    }
    
}
