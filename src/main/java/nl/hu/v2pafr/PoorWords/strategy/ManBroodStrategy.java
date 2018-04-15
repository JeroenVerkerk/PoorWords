package nl.hu.v2pafr.PoorWords.strategy;

public class ManBroodStrategy implements PictureStrategy{
	private String src;
	
	//Return het pad naar de foto
	public String showPicture() {		
		src = "C:man_brood.jpg";
		return src;
	}
}
