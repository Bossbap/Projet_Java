package representation;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/** 
 * SoundNode joue un fichier audio
 * @author Baptiste Geisenberger 
 */
public class SoundNode extends NodeDecorator{

		private Event nextNode;
		private String path;
		
		/**
		 * Constructeur de classe qui permet de donner le prochain noeud dans la partie ainsi que le chemin du fichier audio a executer.
		 * @param n prochain noeud de la partie
		 * @param p chemin du fichier a ouvrir
		 */
		public SoundNode(Event n,String p) {
			nextNode = n;
			path = p;
		}
		
		/** 
		 * Joue le fichier audio
		 */
		@Override
		public void display() {
			try {
				File musicPath = new File(path);
				AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
				Clip clip = AudioSystem.getClip();
				clip.open(audioInput);
				clip.start();
				//Thread.sleep(clip.getMicrosecondLength() / 1000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		
		public Event choosenext() {
			return nextNode;
		}
	
}
