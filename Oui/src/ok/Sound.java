package ok;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;


public class Sound {
	public static void play(String path) {
		try {
			File musicPath = new File(path);
			AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
			Clip clip = AudioSystem.getClip();
			clip.open(audioInput);
			clip.start();
			Thread.sleep(clip.getMicrosecondLength() / 1000);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
    public static void main(String[] args) {
    	play("/Users/Stephanie/eclipse-workspace/proj/Son/son1.wav");
    }
}
