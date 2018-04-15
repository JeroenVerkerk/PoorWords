package nl.hu.v2pafr.PoorWords.strategy;

public class BroodSnijdenStrategy implements PictureStrategy{
private String src;
	

	//Return het pad naar de foto
	public String showPicture() {
		src = "brood-snijden.jpg";
		return src;
	}
}
