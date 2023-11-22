import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class SnakeGame {
    public static void main(String[] args) {
        String file = "music/Sonic-3-Music_-Final-Boss.wav";
        PlayMusic(file);
        new GameFrame ();

    }
        public static void PlayMusic(String file){
            try{
                File musicFile = new File(file);
                if(musicFile.exists()){
                    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(musicFile);
                    Clip clip = AudioSystem.getClip();
                    clip.open(audioInputStream);
                    clip.start();
                }else{
                    System.out.println("cant find file");
                }
            }catch(Exception e){
                System.out.println(e);
            }
        }

}