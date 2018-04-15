package nl.hu.v2pafr.PoorWords.strategy;

public class BoerLatenStrategy implements PictureStrategy {
	private String src;
	
	//Return het pad naar de foto
	public String showPicture() {
		src = "boer_laten.jpg";
		return src;
	}
}
