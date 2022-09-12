import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) {
	String Filename = "Waris.txt";
	int buf;
	File nf = new File(Filename);
	FileWriter wrt;
	try {
		wrt = new FileWriter(Filename);
		wrt.write("Today is another day to be punished in progranning world");
		wrt.append("\nI am gettting my desired results esp this java auto throw and catch \nAlhamdullilahi Aim Achieved");
		wrt.close();
	} catch (IOException e2) {
	
		e2.printStackTrace();
	}
	FileReader rd;
	try {
		rd = new FileReader(Filename);
		buf = rd.read();
		while (buf != -1)
		{
			System.out.print((char) buf);
			buf = rd.read();
		}
		System.out.println();
		rd.close();
	} catch (IOException e2) {
	
		e2.printStackTrace();
	}
	
	try {
		nf.createNewFile();
//		nf.delete();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	
	if (nf.exists()) {
		System.out.println(nf.getAbsolutePath());
		System.out.println(nf.canRead());
		System.out.println(nf.canWrite());
		System.out.println(nf.lastModified());
		System.out.println("file exist");
		
	}
	else
		System.out.println("file doesnt exist");

	}
	
}
