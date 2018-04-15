package nl.hu.v2pafr.PoorWords.strategy;

public class ManBoerStrategy implements PictureStrategy{
	private String src;
	
	//Return het pad naar de foto
	public String showPicture() {
		src = "man_boer.jpg";
		return src;
	}
}
