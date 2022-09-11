import javax.sound.sampled.*;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class main {
	public static void main(String[] args) {
		File adfile = new File("fatia.wav");
		Scanner cmdplay = new Scanner(System.in);
		try {
			
			AudioInputStream adplayer = AudioSystem.getAudioInputStream(adfile);
			Clip clip = AudioSystem.getClip();
			clip.open(adplayer);
			
			//lip.start();
			String response = "";
			
			while(!response.equalsIgnoreCase("q")) {
				System.out.println("p = play or resume || s for pause || r for restart || q to quit ");
				System.out.print("Enter your choice ");
				response = cmdplay.nextLine();
				switch(response) {
					case "p": clip.start();
					break;
					case "s": clip.stop();
					break;
					case "r": clip.setMicrosecondPosition(0);
					break;
					case "q": clip.close();
					default : System.out.println("invalid input");
				}
			}
			
		} catch (UnsupportedAudioFileException | IOException e) {
			//if adplayer cant get the file or open the file
			e.printStackTrace();
		} catch (Exception e) {
			// if clip failed
			e.printStackTrace();
		}
		cmdplay.close();
		System.out.println("Hope you enjoyed your music in .wav format\nWe will work on creating others as times goes on\nThank you");
		
	}

}
