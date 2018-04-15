package nl.hu.v2pafr.PoorWords.filewriter;

import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

public class CSVWriter implements FileWriterInterface{
	private static final String filename = "translation.csv";
	private ArrayList<String> zinnen;
	PrintStream pr = null;
	
	//De array vanuit de ui wordt hier aan meegegeven
	public CSVWriter(ArrayList<String> zinnen) {
		this.zinnen = zinnen;
	}
	
	//Schrijv de zinnen weg in de file
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
