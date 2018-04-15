package nl.hu.v2pafr.PoorWords.strategy;

public class BroodKopenStrategy implements PictureStrategy {
	private String src;
	
	//Return het pad naar de foto
	public String showPicture() {
		src = "brood_kopen.jpg";
		return src;
	}
}
