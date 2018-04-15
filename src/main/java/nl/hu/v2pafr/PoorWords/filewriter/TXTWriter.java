package nl.hu.v2pafr.PoorWords.filewriter;

import java.util.ArrayList;
import java.io.IOException;
import java.io.PrintStream;

public class TXTWriter implements FileWriterInterface {
	private static final String filename = "translation.txt";
	private ArrayList<String> zinnen;
	PrintStream pr = null;
	
	//De zinnen worden vanuit de ui meegegeven
	public TXTWriter(ArrayList<String> zinnen) {
		this.zinnen = zinnen;
	}
	
	//Schrijf de zinnen die vanuit de ui worden meegeven in een file
	public void writeFile() {
		try {
			pr = new PrintStream(filename);

			for (String zin : zinnen) {
				pr.println(zin);
			}

			pr.close();
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
		
	}
}
