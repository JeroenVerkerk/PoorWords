package nl.hu.v2pafr.PoorWords.filewriter;

import java.util.ArrayList;

public class FileFactory {
	private ArrayList<String> zinnen = new ArrayList<String>();
	private String file;
	FileWriterInterface writer = null;
	
	public FileFactory() {
		
	}
	
	//Voer aan de hand van het gekozen filtype een write methode uit.
	public void setWriter(String file, ArrayList<String> zinnen) {
		this.file = file;
		this.zinnen = zinnen;
		
		if (file.equals("XML")) {
			writer = new XMLWriter(zinnen);
			writer.writeFile();
		}
		
		if (file.equals("TXT")) {
			writer = new TXTWriter(zinnen);
			writer.writeFile();
		}
		
		if (file.equals("CSV")) {
			writer = new CSVWriter(zinnen);
			writer.writeFile();
		}
	}
}