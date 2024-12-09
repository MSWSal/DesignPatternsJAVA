public class FacadeP {

    public class AudioPlayer {
        public void playtheAudio(){
            System.out.println("playing Audio");
        }
    }

    public class VideoPlayer {
        public void playtheVideo(){
            System.out.println("playing Video");
        }    
    }

    public class LoadImage{
        public void loadtheImage(){
            System.out.println("Loading the image");
        }
    }

    public class Facade{
        private AudioPlayer audioPlayer;
        private VideoPlayer videoPlayer;
        private LoadImage loadImage;

        public Facade(){
            this.audioPlayer = new AudioPlayer();
            this.videoPlayer = new VideoPlayer();
            this. loadImage = new LoadImage();
        }

        public void playMedia(String type){

            switch (type.toLowerCase()) {
                case "audio":
                    audioPlayer.playtheAudio();
                    break;
                case "video":
                    videoPlayer.playtheVideo();
                    break;
                case "load":
                    loadImage.loadtheImage();
                    break;
            
                default:
                    System.out.println("Not supproted");
                    break;
            }

        }
    }

    public static void main(String[] args){
        Facade facade = new FacadeP().new Facade();

        facade.playMedia("audio");
    }
    
}
