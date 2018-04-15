package nl.hu.v2pafr.PoorWords.filewriter;

import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

public class XMLWriter implements FileWriterInterface{
	private static final String filename = "translation.xml";
	private ArrayList<String> zinnen;
	PrintStream pr = null;
	
	//De zinnen worden vanuit de ui meegegeven
	public XMLWriter(ArrayList<String> zinnen) {
		this.zinnen = zinnen;
	}
	
	//Schrijf de zinnen vanuit de ui in een file
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
